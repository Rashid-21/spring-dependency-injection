package az.spring.demo;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;


@Configuration
public class SpringConfig {

    @Bean
    public Message getSms() {
        return new Sms();
    }

    @Bean
    public Message getEmail() {
        return new Email();
    }

    @Bean
    public Employee getEmployee() {
        Employee employee = new Employee();
        employee.setName("Rashid");
        employee.setSurname("Alakbarov");
        employee.setAge(21);

        return employee;
    }

    @Bean
    @Scope("prototype")
    public Notification getNotification(){
        Notification notification = new Notification();
        notification.setMessage(getSms());
        notification.setEmployee(getEmployee());

        return notification;
    }
}
