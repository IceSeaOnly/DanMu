package site.binghai;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@SpringBootApplication
public class DanmuApplication {

	/**
	 * 主程序入口
	 * */
	public static void main(String[] args) {
		SpringApplication.run(DanmuApplication.class, args);
	}


}
