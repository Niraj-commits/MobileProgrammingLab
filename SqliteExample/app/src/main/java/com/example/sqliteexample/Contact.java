package com.example.sqliteexample;

public class Contact {
    int id;
    String name;
    String phoneNumber;

    public Contact(){}

    public Contact(int id,String name, String phoneNumber){
        this.id = id;
        this.name = name;
        this.phoneNumber = phoneNumber;
    }
    public Contact(String name,String phoneNumber){
        this.name = name;
        this.phoneNumber = phoneNumber;
    }
    public int getId(){
        return id;
    }
    public void setId(int i){
        this.id = id;
    }
    public String getName(){
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
