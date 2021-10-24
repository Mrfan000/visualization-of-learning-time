package icu.fanyu.study.service.impl;

import icu.fanyu.study.entity.User;
import icu.fanyu.study.mapper.UserMapper;
import icu.fanyu.study.service.UserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author AssassinLeon
 * @since 2021-10-24
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

}
