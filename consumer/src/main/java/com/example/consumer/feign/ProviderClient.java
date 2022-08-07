package com.example.consumer.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author cj
 * @date 2022/7/31 17:55
 */
@FeignClient(value = "provider")
public interface ProviderClient {
    @GetMapping("/hi")
    String hi(@RequestParam(value="name",defaultValue="forzep",required=false) String name);
}
