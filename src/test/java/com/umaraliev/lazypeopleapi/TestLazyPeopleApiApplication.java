package com.umaraliev.lazypeopleapi;

import org.springframework.boot.SpringApplication;

public class TestLazyPeopleApiApplication {

    public static void main(String[] args) {
        SpringApplication.from(LazyPeopleApiApplication::main).with(TestcontainersConfiguration.class).run(args);
    }

}
