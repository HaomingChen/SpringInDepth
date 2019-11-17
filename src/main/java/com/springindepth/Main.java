package com.springindepth;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author 58212
 * @date 2019-11-13 0:12
 */
public class Main {
    public static void main(String[] args) {
        //1.创建Spring的IOC容器对象
        //ApplicationContext代表IOC容器
        //ClassPathXmlApplicationContext:是ApplicationContext接口的实现类。该实现类从类路径下来加载配置文件。
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        //2.从IOC容器中获取Bean实例 /id方式
        HelloWorld helloWorld = (HelloWorld) ctx.getBean("helloWorld");
        //利用class类来获取bean实例
//        HelloWorld helloWorld = ctx.getBean(HelloWorld.class);
        System.out.println(helloWorld);
        //3.调用hello方法
//        helloWorld.hello();
        Car car = (Car) ctx.getBean("car2");
        System.out.println(car);

        Person person = (Person) ctx.getBean("person");
        System.out.println(person);
    }
}
