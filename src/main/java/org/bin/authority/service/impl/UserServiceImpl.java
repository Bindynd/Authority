package org.bin.authority.service.impl;

import org.bin.authority.entity.User;
import org.bin.authority.dao.UserMapper;
import org.bin.authority.service.UserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * <p> User 服务实现类 </p>
 *
 * @author Bin
 * @since 2023-12-07
 */
@Service
@Transactional
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

}
