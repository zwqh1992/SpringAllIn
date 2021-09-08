package cn.zwqh.cloud.nacos.consumer.controller;

import cn.zwqh.cloud.nacos.api.EchoFacade;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author wangc
 * @date 2021年09月07日 下午5:27
 */
@RestController
public class FeignTestController {

    @Resource
    private EchoFacade echoFacade;

    @GetMapping("/echo2/{str}")
    public String echo(@PathVariable String str) {
        return echoFacade.echo(str);
    }
}
