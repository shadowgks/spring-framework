package org.example.service;

public class TestService {
    public boolean checkLogin(String username, String password){
        if(username.equals("shadowgks") && password.equals("123456")){
            return true;
        }else {
            return false;
        }
    }
}
