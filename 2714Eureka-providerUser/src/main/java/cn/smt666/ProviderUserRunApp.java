package cn.smt666;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * Eureka 注册中心的客户端。
 * @author 27140
 *
 */
@SpringBootApplication
@EnableEurekaClient  //标识这是一个Eureka的客户端的程序。（只有客户端才可以注册在Eureka上。）
public class ProviderUserRunApp {

	public static void main(String[] args) {
		SpringApplication.run(ProviderUserRunApp.class, args);
	}

}
