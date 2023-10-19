package com.xworkz.crud;

public class Trainee {

    int index = 0;
    public String[] traineeName = new String[5];

    public void addName(String name) {
        System.out.println("The name added is");
        System.out.println("The name is:" + name);
        if (index < traineeName.length) {
            System.out.println("The length of array is less than index");
            traineeName[index] = name;
            index += 1;
            System.out.println("Then length of the index is:" + index);

        } else {
            System.out.println("The array is full ");
        }

    }

    public void update(String oldValue, String newValue) {
        System.out.println("The update method");
        System.out.println("oldName is: " + oldValue + "newName is: " + newValue);
        boolean isFound = false;
        for (int i = 0; i < traineeName.length; i++) {
            if (traineeName[i] == oldValue) {
                System.out.println("The name is found");
                traineeName[i] = newValue;
                System.out.println("The new value is :" + traineeName[i]);
                isFound = true;
            }

        }
        if (isFound == true) {
            System.out.println("The new name is updated");
        } else {
            System.out.println("The name is not updated");
        }
    }

    public void delete(String name){
        System.out.println("The delete method");
        System.out.println("The name is to be delete is-"+name);
        boolean isDelete=false;
        for(int i=0;i< traineeName.length;i++){
            if(traineeName[i]==name){
                traineeName[i]=null;

                isDelete=true;
            }
        }
        if(isDelete){
            System.out.println("The name is deleted");
        }else{
            System.out.println("The name is not delete");

        }
    }


    public void getName(){

        for(int i=0;i< traineeName.length;i++){

        if(traineeName[i]!=null)
            System.out.println("The list of the name is"+traineeName[i]);
        }

    }
}