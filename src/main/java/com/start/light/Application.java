package com.start.light;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created by YuBing on 2018/6/30.
 */
@SpringBootApplication
public class Application {

    /**
     * spring boot 入口方法
     * @param args 命令行参数
     */
    public static void main(String [] args){
        SpringApplication.run(Application.class, args);
    }
}
