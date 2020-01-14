package dubboconsumer.demo.controller;

import com.mlandgt.road.HelloService;
import com.mlandgt.road.version.ServiceVersionConstant;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Road
 */
@RestController
public class DenoController {

    @Reference(version = ServiceVersionConstant.VERSION, check = false, url = "dubbo://10.1.7.46:20880?version=1.0.0")
    private HelloService helloService;

    /**
     * 获取hello接口
     * 
     * @return
     */
    @GetMapping(value = "/hello")
    public String hello() {
        if (helloService == null) {
            return "hello failed";
        }
        return helloService.say();
    }
}
