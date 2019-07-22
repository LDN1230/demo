package danning.lin.springcloudconfigclient;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class TestController {

    @Value("${name:fail}")//如果读不到配置文件的name,就name=fail
    private String name;

    @RequestMapping("/name")
    public String returnName(){
        return name;
    }
}
