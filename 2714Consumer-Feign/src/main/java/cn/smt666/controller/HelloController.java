package cn.smt666.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cn.smt666.feign.EurekaServiceFeign;

@RestController
public class HelloController {

	// 调用接口
	@Autowired
	private EurekaServiceFeign eurekaServiceFeign;
	
	/**
	 * 调用提供者。
	 * @param name
	 * @return
	 */
	@RequestMapping("/hello/{name}")
	public String hello(@PathVariable String name) {
		return eurekaServiceFeign.hello(name);
	}
}
