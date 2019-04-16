package me.drngsl.controller;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import me.drngsl.model.User;

@RestController
public class HelloController {

	@RequestMapping("/hello")
	public String hello() {
		System.out.println("Access one comming...");
		return "hello provider 1";
	}

    @RequestMapping(value = "/hellol", method= RequestMethod.GET)
    public String hello(@RequestParam String name) {
        return "Hello " + name;
    }

    @RequestMapping(value = "/hello2", method= RequestMethod.GET)
    public User hello(@RequestHeader String name, @RequestHeader Integer age) {
        return new User(name, age);
    }

    @RequestMapping(value = "/hello3", method = RequestMethod.POST)
    public String hello (@RequestBody User user) {
        return "Hello "+ user. getName () + ", " + user. getAge ();
    }
}
