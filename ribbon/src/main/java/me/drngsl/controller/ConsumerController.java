package me.drngsl.controller;

import java.net.URI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class ConsumerController {

	// 注入负载均衡客户端
	@Autowired
	private LoadBalancerClient loadBalancerClient;

	@RequestMapping("/consumer")
	public String helloConsumer() {
		ServiceInstance serviceInstance = loadBalancerClient.choose("providers");
		URI uri = URI.create(String.format("http://%s:%s", serviceInstance.getHost(), serviceInstance.getPort()));
		return uri.toString();
	}

	@Autowired
	private RestTemplate restTemplate;

	@RequestMapping("/consumer2")
	public String helloConsumer2() {
		return restTemplate.getForEntity("http://HELLO-SERVICE/hello", String.class).getBody();
	}
}
