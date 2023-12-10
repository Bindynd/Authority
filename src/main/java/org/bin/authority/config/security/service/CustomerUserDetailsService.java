package org.bin.authority.config.security.service;

import org.bin.authority.entity.Permission;
import org.bin.authority.entity.User;
import org.bin.authority.service.PermissionService;
import org.bin.authority.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class CustomerUserDetailsService implements UserDetailsService {
    @Autowired
    private UserService userService;
    @Autowired
    private PermissionService permissionService;
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        // 调用根据用户名查询用户信息的方法
        User user = userService.findUserByUserName(username);
        // 对象为空则认证失败
        if (user == null) {
            throw new UsernameNotFoundException("用户名或密码错误");
        }
        // 查询用户拥有的权限列表
        List<Permission> permissionList = permissionService.findPermissionListByUserId(user.getId());
        // 获取权限编码
        List<String> collect = permissionList.stream().filter(item -> item != null).map(item -> item.getCode()).filter(item -> item != null).collect(Collectors.toList());
        // 转换成数组
        String[] array = collect.toArray(new String[collect.size()]);
        // 设置权限列表
        List<GrantedAuthority> authorityList = AuthorityUtils.createAuthorityList(array);
        user.setAuthorities(authorityList);
        // 设置菜单列表
        user.setPermissionList(permissionList);
        // 返回用户信息
        return user;
    }
}
