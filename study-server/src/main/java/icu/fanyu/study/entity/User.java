package icu.fanyu.study.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author AssassinLeon
 * @since 2021-10-24
 */
@Data
@TableName("user")
public class User extends Model<User> {
    private static final long serialVersionUID=1L;
    @TableId(value = "id", type = IdType.ASSIGN_UUID)
    private String id;
    private String username;
    private String password;
    private String userTypeId;
}
