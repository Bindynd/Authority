package org.bin.authority.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.bin.authority.entity.Permission;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author Bin
 * @since 2023-12-07
 */
public interface PermissionMapper extends BaseMapper<Permission> {
    /**
     * 根据用户ID查询权限列表
     * @param userId
     * @return
     */
    List<Permission> findPermissionListByUserId(Long userId);

}
