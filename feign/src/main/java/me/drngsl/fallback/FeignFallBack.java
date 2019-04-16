package me.drngsl.fallback;

import org.springframework.stereotype.Component;

import me.drngsl.model.User;
import me.drngsl.service.FeignService;

@Component
public class FeignFallBack implements FeignService {
	@Override
    public String hello() {
        return "error";
    }

    @Override
    public String hello(String name) {
        return "error";
    }

    @Override
    public User hello(String name, Integer age) {
        return new User();
    }

    @Override
    public String hello(User user) {
        return "error";
    }
}
