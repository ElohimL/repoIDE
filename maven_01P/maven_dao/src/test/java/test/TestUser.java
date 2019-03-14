package test;

import domain.User;

import java.util.Date;

public class TestUser {
    public static void main(String[] args) {
        User user = new User();
        user.setId(1);
        user.setName("张三");
        user.setBirthday(new Date());
        System.out.println(user);
        show();
    }
    public static void show(){
        System.out.println("Jhin");
    }
}
