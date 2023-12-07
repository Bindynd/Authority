package org.bin.authority.service.impl;

import org.bin.authority.entity.Department;
import org.bin.authority.dao.DepartmentMapper;
import org.bin.authority.service.DepartmentService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * <p> Department 服务实现类 </p>
 *
 * @author Bin
 * @since 2023-12-07
 */
@Service
@Transactional
public class DepartmentServiceImpl extends ServiceImpl<DepartmentMapper, Department> implements DepartmentService {

}
