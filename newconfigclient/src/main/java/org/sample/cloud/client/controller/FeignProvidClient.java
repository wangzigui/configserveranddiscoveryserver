package org.sample.cloud.client.controller;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient("client1")
public interface FeignProvidClient {
	
	@RequestMapping(value = "/index", method = RequestMethod.GET)
    public String index(@RequestParam("str") String str);
}
