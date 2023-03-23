package az.spring.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {
    public static void main(String[] args) {
//        Notification notification = new Notification();
//        notification.setMessage(sms);
//        notification.alert();


//          XML Based Configuration

//        ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
//        Notification notification = context.getBean("notification", Notification.class);
//        notification.alert();



//        Java Based Configuration

        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        Notification notification = context.getBean("getNotification", Notification.class);
        notification.alert();


    }
}
