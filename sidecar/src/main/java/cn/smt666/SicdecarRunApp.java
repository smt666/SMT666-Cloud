package cn.smt666;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.sidecar.EnableSidecar;

@SpringBootApplication
@EnableSidecar
public class SicdecarRunApp {

	public static void main(String[] args) {
		SpringApplication.run(SicdecarRunApp.class, args);
	}

}
