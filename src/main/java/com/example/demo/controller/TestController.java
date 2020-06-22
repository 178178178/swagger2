package com.example.demo.controller;

import com.example.demo.model.User;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

@RestController
@Api(tags = "用户管理相关接口")
@RequestMapping("/user")
public class TestController {

    @GetMapping("test")
    @ApiOperation("添加用户的接口")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "username", value = "用户名", defaultValue = "李四"),
            @ApiImplicitParam(name = "address", value = "用户地址", required = true)
    }
    )
    public String addUser(String username, @RequestParam(required = true) String address) {
        return "new RespBean()";
    }

    @GetMapping("/")
    @ApiOperation("根据id查询用户的接口")
    @ApiImplicitParam(name = "id", value = "用户id", defaultValue = "99", required = true)
    public String getUserById(@PathVariable Integer id) {

        return "user";
    }
    @PutMapping("/{id}")
    @ApiOperation("根据id更新用户的接口")
    public String updateUserById(@RequestBody User user) {
        return "user";

    }
}
