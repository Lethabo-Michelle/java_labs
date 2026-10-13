package org.example;

public class LoginCheck {

    public void loginCheck(String name, String password){
        if(name.equals("Lethabo") && password.equals("Lethabo123")){
            System.out.println("Login successful");
        }
        else {
            System.out.println("Invalid credentials");
        }
    }
}
