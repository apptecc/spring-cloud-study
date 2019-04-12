package cn.nxnil.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Hello world!
 */
@SpringBootApplication
public class Application {
    public static void main(String[] args) {
        System.out.println("start spring boot...");
        SpringApplication.run(Application.class, args);
    }
}
