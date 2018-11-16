package com.sheffmachine.didemo;

import com.sheffmachine.didemo.controllers.ConstructorInjectedController;
import com.sheffmachine.didemo.controllers.MyController;
import com.sheffmachine.didemo.controllers.PropertyInjectedController;
import com.sheffmachine.didemo.controllers.SetterInjectedController;
import com.sheffmachine.didemo.examplebeans.FakeDataSource;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DiDemoApplication {

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(DiDemoApplication.class, args);
        MyController controller = (MyController) ctx.getBean("myController");
        LifecycleDemoBean demoBean = (LifecycleDemoBean) ctx.getBean("lifecycleDemoBean");

        FakeDataSource fakeDataSource = (FakeDataSource) ctx.getBean(FakeDataSource.class);
        System.out.println(fakeDataSource.getUser());
//        System.out.println(controller.hello());
//        System.out.println(ctx.getBean(PropertyInjectedController.class).sayHello());
//        System.out.println(ctx.getBean(SetterInjectedController.class).sayHello());
//        System.out.println(ctx.getBean(ConstructorInjectedController.class).sayHello());
    }
}
