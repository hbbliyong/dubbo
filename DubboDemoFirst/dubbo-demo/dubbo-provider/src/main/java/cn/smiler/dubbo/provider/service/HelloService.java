package cn.smiler.dubbo.provider.service;

import org.springframework.stereotype.Service;

@Service("helloService")
public class HelloService implements cn.smiler.api.HelloService {
    @Override
    public String sayHi(String msg) {
        return "Hello "+msg;
    }
}
