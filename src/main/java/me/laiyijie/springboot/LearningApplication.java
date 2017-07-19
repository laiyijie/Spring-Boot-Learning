package me.laiyijie.springboot;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by admin on 2017-07-19.
 */
@SpringBootApplication
@RestController
public class LearningApplication{

    @RequestMapping("/")
    public String tee(){
        return "hello spring boot";
    }

    public static void main(String[] args) throws Exception {
        SpringApplication.run(LearningApplication.class, args);
    }

}
