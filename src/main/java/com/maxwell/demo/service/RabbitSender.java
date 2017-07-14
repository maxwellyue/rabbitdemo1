package com.maxwell.demo.service;

import com.maxwell.demo.entity.User;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Date;

/************************************************************************************
 * 功能描述：
 * 创建人：岳增存  yuezc@seentao.com
 * 创建时间： 2017年07月14日 --  下午8:40 
 * 其他说明：
 * 修改时间：
 * 修改人：
 *************************************************************************************/
@Component
public class RabbitSender {
    @Autowired
    private AmqpTemplate rabbitTemplate;
    public void send() {
        String msg = "hello,baby ---- " + new Date();
        this.rabbitTemplate.convertAndSend("myqueue", msg);
        System.out.println("我发出了消息 : " + msg);
    }

    public void send(User user){
        this.rabbitTemplate.convertAndSend("myqueue", user);
        System.out.println("我发出了消息 : " + user.toString());
    }
}
