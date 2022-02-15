package com.itum;

public class Student {
    private String name;

    public void setName(String name){
        this.name=name;
    }

    public String getName(){
        return name;
    }
}

class TestEncapsulation{
    public static void main(String[] args) {
        Student s = new Student();
        s.setName("Tharaka");
        System.out.println(s.getName());
    }
}