package springboot;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.core.env.Environment;
import springboot.service.Message;

import java.util.logging.Level;

@SpringBootApplication
@EnableAspectJAutoProxy
public class SpringBoot1 extends SpringBootServletInitializer {


    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(SpringBoot1.class);
        Message m =(Message) context.getBean("message");
        m.getName();
        System.out.println(m);

    }
}
