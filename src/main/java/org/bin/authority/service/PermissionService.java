package org.bin.authority.service;

import com.baomidou.mybatisplus.extension.service.IService;
import org.bin.authority.entity.Permission;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author Bin
 * @since 2023-12-07
 */
public interface PermissionService extends IService<Permission> {
    /**
     * 根据用户ID查询权限列表
     * @param userId
     * @return
     */
    List<Permission> findPermissionListByUserId(Long userId);
}
