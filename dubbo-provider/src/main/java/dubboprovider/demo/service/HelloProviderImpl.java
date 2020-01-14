package dubboprovider.demo.service;

import com.mlandgt.road.HelloService;
import com.mlandgt.road.version.ServiceVersionConstant;
import org.apache.dubbo.config.annotation.Service;

import java.util.List;
import java.util.Map;

/**
 * @author Road
 */
@org.springframework.stereotype.Service("helloService")
@Service(timeout = 5000, version = ServiceVersionConstant.VERSION)
public class HelloProviderImpl implements HelloService {

    @Override
    public String say() {
        return "provider_hello";
    }

    @Override
    public List<Map<String, Object>> testMapList(Map<String, Object> map) {
        return null;
    }
}
