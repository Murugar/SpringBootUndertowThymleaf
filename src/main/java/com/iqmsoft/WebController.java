package com.iqmsoft;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.io.IOException;
import java.net.URL;
import java.util.Scanner;


@Controller
public class WebController {

    @RequestMapping("/")
    public String greeting(@RequestParam(value="name", defaultValue ="Test", required=false) String name, Model model) {
        model.addAttribute("name", name);
       
       

        return "index";
    }

}

