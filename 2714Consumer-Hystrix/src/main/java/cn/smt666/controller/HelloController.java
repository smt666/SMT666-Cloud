package cn.smt666.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

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
	@HystrixCommand(fallbackMethod = "fallbackHello")  // 失败时短路器自动回调方法。
	public String hello(@PathVariable String name) {
		return eurekaServiceFeign.hello(name);
	}
	
	/**
	 * 失败时短路器自动回调方法.
	 * @param name
	 * @return
	 */
	private String fallbackHello(String name) {
		// 设置一个失败时的默认值。
		return "tony";
	}
}
