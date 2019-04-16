package me.drngsl.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import me.drngsl.model.User;
import me.drngsl.service.FeignService;

@RestController
public class ConsumerController {
	@Autowired
    FeignService feignService;

    @RequestMapping("/consumer")
    public String helloConsumer(){
        return feignService.hello();
    }

    @RequestMapping("/consumer2")
    public String helloConsumer2(){
        String r1 = feignService.hello("hjc");
        String r2 = feignService.hello("hjc", 23).toString();
        String r3 = feignService.hello(new User("hjc", 23));
        return r1 + "-----" + r2 + "----" + r3;
    }
}
