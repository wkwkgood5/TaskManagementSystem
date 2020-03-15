package com.example.demo.contorller;

import com.example.demo.pojo.User;
import com.example.demo.service.UserService;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Controller
public class UserContorller {
    @Autowired
    private UserService userService;

    @GetMapping("all")
    public String all(Model model) {
        List<User> users = this.userService.selectUserByName();
        model.addAttribute("users", users);
        return "users";
    }

    @GetMapping(value = "delete/{id}")
    public ModelAndView delete(@PathVariable String id) {
        userService.deleteById(id);
        ModelAndView mav = new ModelAndView("redirect:/all");
        return mav;
    }

    @RequestMapping("Add1")
    public ModelAndView Add1() {
        return new ModelAndView("add");
    }

    @RequestMapping("AddUser")
    public ModelAndView AddUser(User user) {
        userService.add(user);
        ModelAndView mav = new ModelAndView("redirect:/all");
        return mav;
    }

}