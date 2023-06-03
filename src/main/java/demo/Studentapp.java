package demo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("demo.mapper")
public class Studentapp {
    public  static  void main(String[] args){
        SpringApplication.run(Studentapp.class,args);

    }
}
