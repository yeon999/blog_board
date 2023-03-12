package com.test.blog_board;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan
@SpringBootApplication
public class BlogBoardApplication {

    public static void main(String[] args) {
        SpringApplication.run(BlogBoardApplication.class, args);
    }

}
