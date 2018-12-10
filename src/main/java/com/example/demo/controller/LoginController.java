package com.example.demo.controller;

import com.example.demo.common.Result;
import com.example.demo.model.User;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@RestController
@RequestMapping("/user")
public class LoginController {
    @Autowired
    private UserService userservice;

    @PostMapping("/login")
    public Result login(@RequestBody User user,HttpServletRequest request){
        System.out.print(user);
        User usernew = userservice.findByusername(user.getUsername());
        if(usernew==null){
            return Result.fail(403,"用户名不存在");
        }
        if(!(usernew.getPassword().equals(user.getPassword()))){
            return Result.fail(403,"密码不正确");
        }

        usernew.setPassword(null);
        HttpSession session=request.getSession();//获取session并将userName存入session对象
        session.setAttribute("user", usernew);
        return  Result.success("/thymeleaf/starter");
    }
    @GetMapping("/logout")
    public Result logout(HttpSession session) {
        session.invalidate();
        return Result.success("/thymeleaf/login");
    }

}
