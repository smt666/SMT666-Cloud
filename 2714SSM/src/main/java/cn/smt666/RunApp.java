package cn.smt666;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "cn.smt666.ssm.mapper")
public class RunApp {

	public static void main(String[] args) {
		SpringApplication.run(RunApp.class, args);
	}

}
