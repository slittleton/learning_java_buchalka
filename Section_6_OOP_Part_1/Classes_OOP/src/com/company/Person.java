package com.company;

public class Person {
    private String firstName;
    private String lastName;
    private int age;

    public String getFirstname(){
        return this.firstName;
    }
    public String getLastName(){
        return this.lastName;
    }
    public int getAge(){
        return this.age;
    }
    public void setFirstname(String firstName){
        this.firstName = firstName;
    }
    public void setLastName(String lastName){
        this.lastName = lastName;
    }
    public void setAge(int age){
        this.age = age;
    }
    public boolean isTeen(){
        if(this.age > 12 && this.age < 20){
            return true;
        }
        return false;
    }
    public String getFullName(){
        if(this.firstName.isEmpty() && this.lastName.isEmpty()) return "";
        if(this.firstName.isEmpty())return this.lastName;
        if(this.lastName.isEmpty()) return this.firstName;
        return this.firstName + " " + this.lastName;
    }
}
