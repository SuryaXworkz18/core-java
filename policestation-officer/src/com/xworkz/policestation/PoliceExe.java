package com.xworkz.policestation;

import com.xworkz.policestation.officer.OfficerDetails;
import com.xworkz.policestation.policestation.PoliceStation;

import java.util.Scanner;

public class PoliceExe {


    public static void main(String args[]) {


        Scanner sc = new Scanner(System.in);
        System.out.println("The no of officer to be added to be added");
        int size = sc.nextInt();
        PoliceStation station = new PoliceStation(size);

        for (int index = 0; index < size; index++) {
            OfficerDetails officerDetails = new OfficerDetails();
//               System.out.println("Enter officer ID");
//            officerDetails.setOfficerId(sc.nextInt());
            System.out.println("Enter officer name");
            officerDetails.setOfficerName(sc.next());
            System.out.println("Enter officer post name");
            officerDetails.setOfficerPostName(sc.next());
            System.out.println("Enter officer age");
            officerDetails.setAge(sc.nextInt());
            System.out.println("Enter officer gender");
            officerDetails.setGender(sc.next());
            System.out.println("Enter blood grp");
            officerDetails.setBloodGrp(sc.next());
            System.out.println("Enter Rthe address");
            officerDetails.setAddress(sc.next());

           station.addOfficerDetails(officerDetails);
        }


        String input = null;

        do{
            System.out.println("Press 1 : get the all officerDetails");
            System.out.println("Press 2 : get officer Name by post Name");
            System.out.println("Press 3 : get officer info by Id");
            System.out.println("Press 4 : get officer AGE BY name");
            System.out.println("Press 5 : update postname by officer name");
            System.out.println("Press 6 : Delete the office by ID");

            int option=sc.nextInt();
            switch (option){

                case 1 : station.getAllOfficerDetails();
                    break;
                case 2 :
                    System.out.println("The  post Name is found");
                    String sd =  station.getOfficerPostNameByName(sc.next());
                    System.out.println("");
                    break;
                case 3 : OfficerDetails office =station.getOfficerInfoById(sc.nextInt());
                    System.out.println(office.getOfficerId()+office.getOfficerName()+office.getOfficerPostName());
                    break;

                case 4 : station.getOfficerageByName(sc.next());
                    break;
                case 5 : boolean off = station.updatePostNameByOfficerName(sc.next(), sc.next());
                         station.getAllOfficerDetails();
                    break;
                case 6 :
                    System.out.println("enter the officer id");
                    station.deleteOfficerId(sc.nextInt());

                default:
                    System.out.println("please enter the option availble ");
            }
            System.out.println("To countinue press Y & to exit press N");
            input = sc.next();

        }while (input.equals("Y"));
        System.out.println("Thank you for using ");

    }
}
