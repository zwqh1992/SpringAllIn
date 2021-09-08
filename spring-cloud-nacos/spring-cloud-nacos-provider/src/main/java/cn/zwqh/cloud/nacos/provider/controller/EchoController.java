package cn.zwqh.cloud.nacos.provider.controller;

import cn.zwqh.cloud.nacos.api.EchoFacade;
import org.springframework.web.bind.annotation.*;

/**
 * @author wangc
 * @date 2021年09月07日 上午11:48
 */
@RestController
public class EchoController implements EchoFacade {

    @Override
    @GetMapping("/echo/{string}")
    public String echo(@PathVariable String string) {
        return "Hello," + string;
    }
}
