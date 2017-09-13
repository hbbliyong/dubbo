package cn.smiler.api;

import cn.smiler.api.model.User;

public interface DemoService {
    public String sayHello(String name);

    public User findUserById(long id);
}
