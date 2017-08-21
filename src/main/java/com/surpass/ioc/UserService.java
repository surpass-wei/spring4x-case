package com.surpass.ioc;

import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by surpass.wei@gmail.com on 2017/8/7.
 */
@Service
public class UserService {
    @Resource   //  等效于 @Autowired, 但是一般更推荐使用@Resource, 详细区别可参考 https://www.zhihu.com/question/39356740
    private ToolService toolService;

    String useTool() {
        return toolService.sayHello();
    }
}
