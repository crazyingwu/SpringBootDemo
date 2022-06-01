package crazywu.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import crazywu.demo.pojo.User;
import crazywu.demo.service.UserService;

@RestController
public class DemoController {

    // 注入usrService
    @Autowired
    private UserService userService;

    @RequestMapping("/demo")
    public String demo() {
        return "This is Spring Boot";
    }

    @GetMapping("/hello")
    public String hello() {
        return "hello vs code";
    }

    @GetMapping("/user")
    public User user() {
        User user = new User();
        user.setAge(10);
        user.setName("zhangsan");
        return user;
    }

    @GetMapping("/say")
    public String say(){
        return userService.say();
    }

}
