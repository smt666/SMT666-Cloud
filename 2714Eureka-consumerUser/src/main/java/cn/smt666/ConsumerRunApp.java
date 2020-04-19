package cn.smt666;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * Eureka 注册中心的消费者。
 * @author 27140
 *
 */
@SpringBootApplication
@EnableEurekaClient
public class ConsumerRunApp {

	/**初始化模板对象。
	 * 让Spring容器给我弄初始化一个Bean对象：RestTemplate对象。
	 * @return 
	 */
	@Bean
	@LoadBalanced   // 使用ribbon负载均衡策略。
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}
	
	public static void main(String[] args) {
		SpringApplication.run(ConsumerRunApp.class, args);
	}

}
