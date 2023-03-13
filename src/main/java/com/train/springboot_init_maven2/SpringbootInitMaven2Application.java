package com.train.springboot_init_maven2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.http.codec.cbor.Jackson2CborDecoder;

@SpringBootApplication
public class SpringbootInitMaven2Application {

    public static void main(String[] args) {
        ConfigurableApplicationContext run = SpringApplication.run(SpringbootInitMaven2Application.class, args);
        Object redisTemplate = run.getBean("redisTemplate");
        Jackson2CborDecoder bean = run.getBean(Jackson2CborDecoder.class);
        Jackson2CborDecoder bean2 = run.getBean(Jackson2CborDecoder.class);
        Jackson2CborDecoder bean3 = run.getBean(Jackson2CborDecoder.class);
        Jackson2CborDecoder bean4 = run.getBean(Jackson2CborDecoder.class);
        Jackson2CborDecoder bean5 = run.getBean(Jackson2CborDecoder.class);
        Jackson2CborDecoder bean6 = run.getBean(Jackson2CborDecoder.class);
        System.out.println("pull");
        
        System.out.println(redisTemplate);
    }

}
