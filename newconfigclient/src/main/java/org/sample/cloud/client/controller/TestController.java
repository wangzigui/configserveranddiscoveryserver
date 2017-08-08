package org.sample.cloud.client.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.ApiOperation;

@RestController
@RefreshScope // 使用该注解的类，会在接到SpringCloud配置中心配置刷新的时候，自动将新的配置更新到该类对应的字段中。如本类的 app.message
public class TestController {

	@Value("${app.message}")
	private String message;
	
	@Value("${user.username}")
	private String username;
	
	@Value("${user.userage}")
	private String userage;
	
	@Value("${user.sex}")
	private String sex;
	
	@Value("${server.port}")
	private String port;
	
	@Autowired
	private FeignProvidClient feignProvidClient;
	
	@ApiOperation(value="获取用户列表", notes="")
	@RequestMapping(value = "/test", method = RequestMethod.GET)
	public String test(){
		return message + " >> " + username + " >> " + userage +">>"+ sex + port;
	}
	
	@RequestMapping(value = "/find", method = RequestMethod.GET)
    public String index() {
        return "客户端请求参数：" + feignProvidClient.index("我是参数！！");
    }
}
