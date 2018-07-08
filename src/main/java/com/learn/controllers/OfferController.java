package com.learn.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by farhans on 6/9/18.
 */
@Controller
public class OfferController {

    @RequestMapping(value = "/hell",method = RequestMethod.GET)
    public String test(){
        return "test";
    }
}
