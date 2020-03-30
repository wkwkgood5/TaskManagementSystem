package com.example.demo.contorller;

import com.example.demo.pojo.User;
import com.example.demo.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;


import java.util.List;

@RestController
public class UserContorller {
    @Autowired
    private UserService userService;

    @GetMapping("getAll")
    public List getall(Model model){
//        List<User> users = userService.getAll();
//        model.addAttribute("users", users);
//        return "users";
        return userService.getAll();
    }

    @GetMapping("/get/{id}")
    public User get(@PathVariable String id){
        return userService.getOne(id);
    }

    @PostMapping("/delete")
    public int remove(@RequestParam String id) {
        return userService.remove(id);
    }


    @PostMapping("/add")
    public int add(@RequestBody User user) {
        return userService.add(user);
    }

    @PostMapping("/modify")
    public int modify(@RequestBody User user) {
        return userService.modify(user);
    }
}