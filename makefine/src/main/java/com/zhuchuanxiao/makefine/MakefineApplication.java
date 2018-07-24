package com.zhuchuanxiao.makefine;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.transaction.annotation.EnableTransactionManagement;



@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
@EnableTransactionManagement
@MapperScan(basePackages={"com.zhuchuanxiao.makefine.IDao"})
@EnableScheduling
public class MakefineApplication {

	public static void main(String[] args) {
		SpringApplication.run(MakefineApplication.class, args);
	}
}
