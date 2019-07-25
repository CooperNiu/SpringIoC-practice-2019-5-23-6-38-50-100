//TODO
package com.example.SpringIoCpractice;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;


@SpringBootApplication
public class Main {

    public static void main(String[] args) {
        //1加载配置文件，根据创建对象
        ApplicationContext context = new FileSystemXmlApplicationContext("hello.xml");
        //2得到创建的对象
        HelloWorld hello=(HelloWorld) context.getBean("helloworld");
        hello.getHello();
        //System.out.println(hello);;
    }

}
