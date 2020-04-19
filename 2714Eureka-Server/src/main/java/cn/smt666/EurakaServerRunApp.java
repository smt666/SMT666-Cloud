package cn.smt666;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

// 启动Euraka注册中心的服务端。
@EnableEurekaServer
@SpringBootApplication
public class EurakaServerRunApp {

	public static void main(String[] args) {
		SpringApplication.run(EurakaServerRunApp.class, args);
	}

}
