package org.bin.authority.controller;


import org.bin.authority.service.UserService;
import org.bin.authority.utils.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p> User 前端控制器 </p>
 *
 * @author Bin
 * @since 2023-12-07
 */
@RestController
@RequestMapping("/api/user")
public class UserController {
    @Autowired
    private UserService userService;
    /**
     * 查询所有用户列表
     * @return
     */
    @GetMapping("/listAll")
    public Result list(){
        return Result.ok(userService.list());
    }

}

