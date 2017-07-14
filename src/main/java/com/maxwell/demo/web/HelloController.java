package com.maxwell.demo.web;

import com.maxwell.demo.entity.User;
import com.maxwell.demo.service.RabbitSender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/************************************************************************************
 * 功能描述：
 * 创建人：岳增存  yuezc@seentao.com
 * 创建时间： 2017年07月14日 --  下午8:29 
 * 其他说明：
 * 修改时间：
 * 修改人：
 *************************************************************************************/
@RestController
public class HelloController {

    @Autowired
    private RabbitSender sender;

    @RequestMapping("/hello")
    public String sayHello(){
        sender.send();
        return "hello, baby";
    }

    @RequestMapping("/hi")
    public String sayHi(){
        User user = new User();
        user.setUsername("maxwell");
        user.setAge(10);
        user.setEmail("123456789@qq.com");
        user.setPhone("12345678909");
        sender.send(user);
        return "hello," + user.toString();
    }
}
