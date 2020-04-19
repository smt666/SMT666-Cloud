package cn.smt666;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

/**
 * 启动Feign的时候，就必须使用SpringCloud的注解了：@SpringCloudApplication 。
 * @author 27140
 *
 */
@SpringCloudApplication
@EnableFeignClients
public class FeignRunApp {

	public static void main(String[] args) {
		SpringApplication.run(FeignRunApp.class, args);
	}

}
