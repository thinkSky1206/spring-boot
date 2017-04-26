package com.liuwp.web.controller;

import com.liuwp.model.User;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;

/**
 * Author: liuwuping
 * Date: 17/4/26
 * Description:
 */
@Controller
@RequestMapping(value = "/home")
public class LoginController {


    @Value("${jwt.secret}")
    private String secret;


    @RequestMapping(value = "/login")
    @ResponseBody
    public String login() {
        return Jwts.builder()
                .setSubject("liuwp")
                .setExpiration(new Date())
                .signWith(SignatureAlgorithm.HS512, "haha")
                .compact();
    }
}
