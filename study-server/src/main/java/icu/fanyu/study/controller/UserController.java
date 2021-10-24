package icu.fanyu.study.controller;


import icu.fanyu.study.entity.User;
import icu.fanyu.study.service.UserService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author AssassinLeon
 * @since 2021-10-24
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping("/getUser/{id}")
    private User getUser(@PathVariable String id){
        User user = userService.getById(id);
        return user;
    }
}
