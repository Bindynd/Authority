package org.bin.authority.service.impl;

import org.bin.authority.entity.Role;
import org.bin.authority.dao.RoleMapper;
import org.bin.authority.service.RoleService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * <p> Role 服务实现类 </p>
 *
 * @author Bin
 * @since 2023-12-07
 */
@Service
@Transactional
public class RoleServiceImpl extends ServiceImpl<RoleMapper, Role> implements RoleService {

}
