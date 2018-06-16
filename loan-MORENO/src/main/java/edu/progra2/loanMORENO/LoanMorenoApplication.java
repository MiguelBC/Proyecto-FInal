package edu.progra2.loanMORENO;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;



@SpringBootApplication
@MapperScan("edu.progra2.loanMORENO.repository")
public class LoanMorenoApplication {

	public static void main(String[] args) {
		SpringApplication.run(LoanMorenoApplication.class, args);
	}
}
