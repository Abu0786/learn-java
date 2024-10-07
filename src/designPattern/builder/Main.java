package designPattern.builder;

public class Main {

    public static void main(String[] args) {
        User user = new User.UserBuilder()
                .setUserName("Abu Saleh")
                .setUserId("user1")
                .setEmailId("abu@gmail.com")
                .build();
        System.out.println(user);
    }
}
