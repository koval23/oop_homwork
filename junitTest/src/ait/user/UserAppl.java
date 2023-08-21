package ait.user;

import ait.user.model.User;

public class UserAppl {
    public static void main(String[] args) {
        String password = "oQiuqUwej21";
        char[] passwordArr = password.toCharArray();
        for (int i = 0; i < passwordArr.length; i++) {
            if(Character.isUpperCase(passwordArr[i])){
                System.out.println(passwordArr[i]);
            }
//            System.out.println(passwordArr[i]);
        }


//
//
//        User user = new User("john@mail.com", "1234");
//        System.out.println(user);
//        user.setEmail("vova@jmx.de");
//        System.out.println(user);

    }

}
