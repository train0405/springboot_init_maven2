package com.train.springboot_init_maven2;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;


@SpringBootTest
public class UserServerTest {

    @Resource
    UserServer userServer;
    @Test
    public void addTest(){
        userServer.add();
    }

}
