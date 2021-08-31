package cn.zwqh.springboot.nacos;

import com.alibaba.nacos.api.config.annotation.NacosValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wangc
 * @date 2021年08月31日 上午10:21
 */
@RestController
public class ConfigController {

    @NacosValue(value = "${useLocalCache:false}", autoRefreshed = true)
    private boolean useLocalCache;

    @GetMapping("/config")
    public boolean config(){
        return useLocalCache;
    }
}
