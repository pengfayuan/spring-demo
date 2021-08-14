package com.yuanyuan.springdemo;

import java.util.Arrays;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * @author FAYUAN.PENG
 * @version \$Id: SpringDemoWebApplication.java,  2021-08-01 23:37 FAYUAN.PENG Exp $$
 */
@SpringBootApplication
public class SpringDemoWebApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(SpringDemoWebApplication.class);
        Arrays.stream(context.getBeanDefinitionNames()).forEach(bean -> System.out.println("load bean:" + bean));
    }
}
