package com.hmw.mybatisplus.service.impl;

import com.hmw.mybatisplus.entity.User;
import com.hmw.mybatisplus.mapper.UserMapper;
import com.hmw.mybatisplus.service.UserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author hmw
 * @since 2020-12-26
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

}
