package com.surpass.ioc;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * 演示程序
 * <p>
 * Created by surpass.wei@gmail.com on 2017/8/7.
 */
public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);    //  根据配置类加载一个Spring容器

        UserService userService = context.getBean(UserService.class);   //  根据类型获取Bean
        System.out.println(userService.useTool());
        context.close();
    }
}
