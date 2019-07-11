package com.chm.demo.controller;

import com.chm.demo.model.Person;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.springframework.web.bind.annotation.*;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import java.util.Date;
import java.util.Objects;

@RestController
public class LoginController {
//    @PostMapping("login")
////    public ResultVo login(@RequestParam(value = "usernameOrEmail", required = true) String usernameOrEmail,
////                          @RequestParam(value = "password", required = true) String password,
////                          HttpServletRequest request) {
////        Boolean is_email = false; //MatcherUtil.matcherEmail(usernameOrEmail);
////        User user = new User();
////        if (is_email) {
////            user.setEmail(usernameOrEmail);
////        } else {
////            user.setUsername(usernameOrEmail);
////        }
////        User query_user = userService.get(user);
////        if (query_user == null) {
////            return ResultVOUtil.error("400", "用户名或邮箱错误");
////        }
////        //验证密码
////        PasswordEncoder encoder = new BCryptPasswordEncoder();
////        boolean is_password = encoder.matches(password, query_user.getPassword());
////        if (!is_password) {
////            //密码错误，返回提示
////            return ResultVOUtil.error("400", "密码错误");
////        }
////
////        String jwtToken = JwtHelper.createJWT(query_user.getUsername(),
////                query_user.getId(),
////                query_user.getRole().toString(),
////                audience.getClientId(),
////                audience.getName(),
////                audience.getExpiresSecond()*1000,
////                audience.getBase64Secret());
////
////        String result_str = "bearer;" + jwtToken;
////        return ResultVOUtil.success(result_str);
////    }
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String login(@RequestBody Person person) throws ServletException {
        if (Objects.isNull(person.getName())) {
            throw new ServletException("username is invalid");
        }
        if (Objects.isNull(person.getPassword())) {
            throw new ServletException("password is invalid");
        }

        String jwtToken = Jwts.builder()
                .setSubject(person.getName())
                .claim("roles", "member")
                .setIssuedAt(new Date())
                .signWith(SignatureAlgorithm.HS256, "secretkey")
                .compact();

        return jwtToken;
    }






}
