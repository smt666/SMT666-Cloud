package cn.smt666.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class HelloController {

	@Autowired
	private RestTemplate restTemplate;
	
	@RequestMapping("/hello/{name}")
	public String hello(@PathVariable String name) {
//		String url = "http://localhost:7900/hello/" + name;
		// 使用Eureka动态列表，通过application.name找到真正的提供者的地址。
//		String url = "http://provider-user:7900/hello/" + name;
		String url = "http://provider-user/hello/" + name;  // 实际上不需要加上端口号的，有时如果有端口号的话，会造成负载均衡失败的结果。
		return this.restTemplate.getForObject(url, String.class);
	}
}
