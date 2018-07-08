package com.learn.controllers;

import com.learn.dto.CustomUserDetails;
import com.learn.entities.User;
import com.learn.service.UserService;
import com.learn.utils.CommonUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;
import java.util.Objects;

/**
 * Created by farhans on 6/15/18.
 */

@Controller
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping(value="/home", method = RequestMethod.GET)
    public ModelAndView home(HttpSession session){
        ModelAndView modelAndView = new ModelAndView();
        String username = CommonUtils.getCurrentUserName();
        if(Objects.nonNull(username)){
            User user = userService.findUserByEmail(username);
            modelAndView.addObject("user", user);
        }
        modelAndView.setViewName("home");
        return modelAndView;
    }

}
