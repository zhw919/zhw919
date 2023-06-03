package demo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("demo.mapper")//扫描mapper层的位置
public class JsoupDay3app {
    public static void main(String[] args){
        SpringApplication.run(JsoupDay3app.class,args);
    }

}