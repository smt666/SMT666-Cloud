package cn.smt666.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 业务需求：
 * 在浏览器中访问"localhost:8080/hello/tony"就可以显示JSON格式的字符串。
 * ==========================
 * 注意：这个入口main所在的Controller必须放在所有需要处理类的父目录里面。
 * @author 27140
 *
 */
@RestController
public class HelloController {

	@RequestMapping("/hello/{name}")
	public String hello(@PathVariable String name) {
		return "Hello SpringBoot," + name;
	}
}
