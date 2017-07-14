package com.maxwell.demo.service;

import com.maxwell.demo.entity.User;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/************************************************************************************
 * 功能描述：
 * 创建人：岳增存  yuezc@seentao.com
 * 创建时间： 2017年07月14日 --  下午8:42 
 * 其他说明：
 * 修改时间：
 * 修改人：
 *************************************************************************************/
@Component
@RabbitListener(queues = "myqueue")
public class RabbitReceiver {
    @RabbitHandler
    public void process(String hello) {
        System.out.println("我收到消息了 : " + hello);
    }

    @RabbitHandler
    public void processObject(User user) {
        System.out.println("我收到消息了 : " + user.toString());
    }

}
