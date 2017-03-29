package com.liuwp.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Author: liuwuping
 * Date: 17/3/28
 * Description:
 */
@Controller
public class HelloController {

    @RequestMapping("/login")
    public String login(Model model) {
        model.addAttribute("msg","hello world");
        return "login";
    }

}
