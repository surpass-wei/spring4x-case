package com.surpass.ioc;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Spring 配置类
 * <p>
 * Created by surpass.wei@gmail.com on 2017/8/7.
 */
@Configuration  //  声明该类为配置类
@ComponentScan("com.surpass.ioc")   //  注册指定包下面使用 @Component/@Service/@Repository/@Controller注解的类为Bean
public class MyConfig {
}
