package com.xworkz.crud;

public class TraineExe {


    public static void main(String args[]){

        Trainee traine = new Trainee();

        traine.addName("Surya");
        traine.addName("Nithish");
        traine.addName("Suraj");
        traine.addName("Chetan");
        traine.addName("Dolly");
        traine.update("Nithish","Panda");
        System.out.println("Before Delete");
        traine.getName();
        traine.delete("Panda");
        System.out.println("After Delete");
        traine.getName();

    }
}
