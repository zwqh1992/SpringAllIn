package cn.zwqh.cloud.nacos.api;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author wangc
 * @date 2021年09月07日 下午5:23
 */
@FeignClient(contextId = "echoFacade", value = "service-provider", path = "")
public interface EchoFacade {

    @GetMapping("/echo/{string}")
    String echo(@PathVariable String string);
}
