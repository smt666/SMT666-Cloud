package cn.smt666;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * 先启动Eureka-Server服务端
 * 再启动ZuulRunApp
 * @author 27140
 *
 */
@SpringBootApplication
@EnableZuulProxy
@EnableEurekaClient  // 指定Eureka客戶端。
public class ZuulRunApp {
	
	public static void main(String[] args) {
		SpringApplication.run(ZuulRunApp.class, args);
	}
}
