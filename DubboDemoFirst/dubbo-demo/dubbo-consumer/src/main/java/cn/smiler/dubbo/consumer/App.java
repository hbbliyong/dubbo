package cn.smiler.dubbo.consumer;

import cn.smiler.api.DemoService;
import cn.smiler.api.model.User;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext(
                "classpath:applicationContext.xml"
        );
        context.start();

        DemoService demoService=(DemoService)context.getBean("demoService"); // 获取远程服务代理
        String hello=demoService.sayHello("ricky");//执行远程方法
        System.out.println(hello);

        User user=demoService.findUserById(15);
        System.out.println(user);//显示调用结果
    }
}
