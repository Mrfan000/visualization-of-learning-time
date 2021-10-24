package icu.fanyu.study.mapper;

import icu.fanyu.study.entity.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author AssassinLeon
 * @since 2021-10-24
 */
@Mapper
public interface UserMapper extends BaseMapper<User> {

}
