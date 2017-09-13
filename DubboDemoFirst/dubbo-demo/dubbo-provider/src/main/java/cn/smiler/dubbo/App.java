package cn.smiler.dubbo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

public class App {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext(
                "classpath:applicationContext.xml");
        context.start();

        System.out.println("Dubbo provider start...");
        try {
            System.in.read();	// 按任意键退出
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
