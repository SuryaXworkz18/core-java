package com.xworkz.policestation.policestation;

import com.xworkz.policestation.officer.OfficerDetails;

import java.util.Arrays;

public class PoliceStation {


OfficerDetails officerDetails[];
public PoliceStation(int size){
officerDetails=new OfficerDetails[size];


}
int index;

   // private int nextOfficerId = 1;
public void addOfficerDetails(OfficerDetails officerDetails){

   // this.officerId = nextOfficerId++;


    if(officerDetails!=null){
        this.officerDetails[index]=officerDetails;
       index++;

    }


}

public void getAllOfficerDetails(){
    System.out.println("The Officers Details are.......");
    for (int index = 0; index < this.officerDetails.length; index++) {
        System.out.println("Officer ID - "+officerDetails[index].getOfficerId()+
        "Officer Name - "+officerDetails[index].getOfficerName()+
                " Officer PostName - "+officerDetails[index].getOfficerPostName()+
                " Officer age - "+officerDetails[index].getAge()+
                " Officer Gender - "+officerDetails[index].getGender()+
                " Officer BloodGroup - "+officerDetails[index].getBloodGrp()+
                " Officer Address - "+officerDetails[index].getAddress());
    }

}
//    public String[] getOfficerNamesByPostName(String postName) {
//        String[] officers = new String[this.officerDetails.length];
//        int count = 0;
//
//        for (int index = 0; index < this.officerDetails.length; index++) {
//            if (officerDetails[index].getOfficerPostName().equals(postName)) {
//                officers[count] = officerDetails[index].getOfficerName();
//                count++;
//            }
//        }
//
//        if (count > 0) {
//            System.out.println("The post Name is found");
//            System.out.println("The Name of the officer(s) is.......");
//        } else {
//            System.out.println("No officers found for the given post Name.");
//        }

        // Return an array containing officer names (possibly empty).
//        return Arrays.copyOf(officers, count);
//    }


    public String getOfficerNameByPostName(String postName){
    String officerName = "";

    for (int index = 0; index < this.officerDetails.length; index++) {
        if(officerDetails[index].getOfficerPostName().equals(postName)){
            officerName = officerDetails[index].getOfficerName();
            System.out.println("The Name of the officer is.......");

        }
    }
return officerName;

}
    public OfficerDetails getOfficerInfoById(int officerId){
        OfficerDetails officer = null;
        for (int index = 0; index < this.officerDetails.length; index++) {
            if(officerDetails[index].getOfficerId()==officerId){
                officer = officerDetails[index];
                System.out.println("The  ID is found");
                System.out.println("The information of the officer is.......");

            }
        }
        return  officer;

    }

    public OfficerDetails getOfficerageByName(String officerName){
        OfficerDetails officer = null;
        for (int index = 0; index < this.officerDetails.length; index++) {
            if(officerDetails[index].getOfficerName()==officerName){
                officer = officerDetails[index];
                System.out.println("The  Name of Officer is found");
                System.out.println("The Age of the officer is.......");

            }
        }
        return  officer;

    }
    public String getOfficerPostNameByName(String officerName){
        String officer = null;
        for (int index = 0; index < this.officerDetails.length; index++) {
            if(officerDetails[index].getOfficerName()==officerName){
                officer = officerDetails[index].getOfficerPostName();
                System.out.println("The Name is found");
                System.out.println("The PostName of the officer is.......");

            }
        }
        return officer;

    }

    public  boolean updatePostNameByOfficerName(String exitingofficerName,String newPostName){
    boolean updatePost=false;
        for (int index = 0; index < this.officerDetails.length; index++) {
        if(officerDetails[index].getOfficerName().equals(exitingofficerName)){
        officerDetails[index].setOfficerPostName(newPostName);
        updatePost= true;
            System.out.println("The post name is updated");

        }
        }
return updatePost;



    }

    public void deleteOfficerId(int officerId){
    OfficerDetails newofficer[]=new OfficerDetails[this.officerDetails.length-1];
    int index,newindex;
    for(index=0,newindex=0;index<this.officerDetails.length;index++){

        if(officerDetails[index].getOfficerId()!=officerId){
            officerDetails[newindex++]=officerDetails[index];

        }
    }

    officerDetails=Arrays.copyOf(officerDetails,newindex);
    getAllNewofficer(officerDetails);

    }

    public void  getAllNewofficer(OfficerDetails[] officerDetails){

        for (int index = 0; index < officerDetails.length; index++) {
            System.out.println(officerDetails[index].getOfficerId()+
                    officerDetails[index].getOfficerName()+officerDetails[index].getOfficerPostName()+officerDetails[index].getGender());

        }
    }



}
