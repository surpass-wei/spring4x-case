package com.surpass.ioc;

import org.springframework.stereotype.Service;

/**
 * Created by surpass.wei@gmail.com on 2017/8/7.
 */
@Service
public class ToolService {
    String sayHello() {
        return "hello, I'm FunctionService";
    }
}
