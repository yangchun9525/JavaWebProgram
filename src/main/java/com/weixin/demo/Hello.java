package com.weixin.demo;

import com.weixin.demo.entity.User;
import org.springframework.web.bind.annotation.*;

@RestController
public class Hello {
    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String hello(String text) {
        return text;
    }

    /**
     * ResponseBody  注解，代表返回json格式
     *
     * @param name
     * @param age
     * @return
     */
    @RequestMapping(value = "/testJson", method = RequestMethod.POST)
    @ResponseBody
    public User testJson(String name, String age) {
        System.out.print("test:" + name + ",age:" + age);
        User user1 = new User();
        user1.name = name;
        user1.age = age;
        return user1;
    }

    /**
     * * RequestBody  注解 ，代表 json格式提交数据
     * @param user
     * @return
     */
    @RequestMapping(value = "/testRequestBody", method = RequestMethod.POST)
    @ResponseBody
    public User testJson(@RequestBody User user) {
        try {
            System.out.print(user.toString());
            System.out.print(user.age);
            System.out.print(user.name);
        } catch (Exception e) {
            System.out.print(e.toString());
        }

        User user1 = new User();
        user1.name = user.name;
        user1.age = user.age;
        return user1;
    }
}
