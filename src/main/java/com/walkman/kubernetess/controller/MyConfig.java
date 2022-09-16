package com.walkman.kubernetess.controller;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

/**
 * @author weiqisen
 * @date 2022/09/08 22:54
 **/
@Component
@Profile("prod")
public class MyConfig {

    @PostConstruct()
    public void greeting() {
        System.out.println("greeting bean running-------------------------------->");
    }
}
