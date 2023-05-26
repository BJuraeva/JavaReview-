package com.syntax.review10;

public class FaceBookUser { // encapsulation class
    private String name;
    private String userName;
    private String dob;
    private String password;

    public FaceBookUser(String name, String userName, String password, String dob){
        this.name = name;
        this.userName = userName;
        this.password = password;
        this.dob = dob;
    }
    void logIn (String userName, String password){
        // encapsulation
        if (this.userName.equals(userName)&&this.password.equals(password)){
            System.out.println("Logged in");
        }
    }
    public String getDob(){
        return dob;
    }
    public String getUserName(){
        return userName;
    }
    public void setUserName(String userName){
     this.userName=userName;
    }
}
