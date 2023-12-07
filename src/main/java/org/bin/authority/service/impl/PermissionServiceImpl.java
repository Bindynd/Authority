package org.bin.authority.service.impl;

import org.bin.authority.entity.Permission;
import org.bin.authority.dao.PermissionMapper;
import org.bin.authority.service.PermissionService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * <p> Permission 服务实现类 </p>
 *
 * @author Bin
 * @since 2023-12-07
 */
@Service
@Transactional
public class PermissionServiceImpl extends ServiceImpl<PermissionMapper, Permission> implements PermissionService {

}
