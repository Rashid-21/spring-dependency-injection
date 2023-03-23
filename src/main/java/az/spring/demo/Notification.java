package az.spring.demo;



public class Notification {

    private Message message;

    private Employee employee;


    /*public Notification() {
        System.out.println("Notification constructor worked!!! ");
    }*/

    //constructor injection
//    public Notification(Message message, Employee employee) {
//        this.message = message;
//        this.employee = employee;
//    }


    //setter injection
    public void setMessage(Message message) {
        this.message = message;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public void alert() {
        System.out.println("Notification......");
        message.send();
        System.out.println(employee);
    }

    public void myInit() {
        System.out.println("My init method worked...");
    }

    public void myDestroy() {
        System.out.println("Destroy method worked...");
    }


}
