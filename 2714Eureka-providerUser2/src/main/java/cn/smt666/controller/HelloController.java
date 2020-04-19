package cn.smt666.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	/**
	 * Restful 风格请求。
	 * @param name
	 * @return
	 */
	@RequestMapping("/hello/{name}")
	public String hello(@PathVariable String name) {
		return "Hello provider2 " + name;
	}
}
