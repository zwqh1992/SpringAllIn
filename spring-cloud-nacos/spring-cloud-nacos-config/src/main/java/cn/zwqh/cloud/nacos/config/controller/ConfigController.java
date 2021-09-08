package cn.zwqh.cloud.nacos.config.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wangc
 * @date 2021年09月08日 下午3:29
 */
@RestController
@RefreshScope
public class ConfigController {

    @Value("${custom.config.appid}")
    private String appid;

    @GetMapping("/getConfig")
    public String getConfig() {
        return appid;
    }
}
