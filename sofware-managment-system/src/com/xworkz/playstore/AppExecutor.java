package com.xworkz.playstore;

import com.xworkz.playstore.app.Application;
import com.xworkz.playstore.hub.SoftwareHub;

import java.util.Scanner;

public class AppExecutor {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of Apps to be added");
        int size = sc.nextInt();
        SoftwareHub softwareHub = new SoftwareHub(size);

        for (int index = 0; index < size; index++) {
            Application application = new Application();
            System.out.println("Enter the App ID");
            application.setAppID(sc.nextInt());
            System.out.println("Enter the Name of the App");
            application.setAppName(sc.next());
            System.out.println("Enter the size of the App");
            application.setAppSize(sc.nextDouble());
            System.out.println("Enter the Release Date of an App");
            application.setReleaseDate(sc.next());
            System.out.println("Enter the App Owner Name");
            application.setAppOwner(sc.next());
            System.out.println("Enter the App type");
            application.setApptype(sc.next());
            System.out.println("Enter the App Version");
            application.setAppVersion(sc.next());

            softwareHub.addApplication(application);

        }





        softwareHub.getAllapplication();
        String input = null;

        do{
            System.out.println("Press 1 : get the all apps");
            System.out.println("Press 2 : get apps by name");
            System.out.println("Press 3 : get apps by Id");
            System.out.println("Press 4 : get apps by type");
            System.out.println("Press 5 : get application name by type");

           int option=sc.nextInt();
            switch (option){

                case 1 : softwareHub.getAllapplication();
                break;
                case 2 : softwareHub.getApplicationByName(sc.next());
                break;
                case 3 : softwareHub.getApplicationById(sc.nextInt());
                break;
                case 4 : softwareHub.getApplicationBytype(sc.next());
                break;
                case 5 : softwareHub.getApplicationNameByType(sc.next());
                break;
                default:
                    System.out.println("please enter the option availble ");
            }
            System.out.println("To countinue press Y & to exit press N");
          input = sc.next();

        }while (input.equals("Y"));
        System.out.println("Thank you for using ");















//        System.out.println("Enter App Name to be updated");
//        boolean bb=softwareHub.updateAppVersionbyName(sc.next(),sc.next());
//        System.out.println(bb);



//
//
//        softwareHub.getAllapplication();
//        softwareHub.deleteApplicationByAppName("yulo");






        /*Application app = softwareHub.getApplicationByName("insta");
        System.out.println("App Id-"+app.getAppID()+" App Owner-"+app.getAppOwner()+" App version-"+app.getAppVersion());

        Application app1 = softwareHub.getApplicationById(1);
        System.out.println("App Name-"+app1.getAppName()+" App Owner-"+app1.getAppOwner()+" App version-"+app1.getAppVersion());

        Application app2 = softwareHub.getApplicationBytype("games");
        System.out.println("App Id-"+app2.getAppID()+" App Name-"+app2.getAppName()+" App Owner-"+app2.getAppOwner()+" App version-"+app2.getAppVersion());

        Application app3 = softwareHub.getApplicationNameByType("travel");
        System.out.println("App Id-"+app3.getAppID()+" App Name-"+app3.getAppName()+" App Owner-"+app3.getAppOwner()+" App version-"+app3.getAppVersion());


        String app4 = softwareHub.getApplicationTypeByName("insta");
        //System.out.println("App Id-"+app4.getAppID()+" App Type-"+app4.getApptype()+" App Owner-"+app4.getAppOwner()+" App version-"+app4.getAppVersion());
        System.out.println(app4);

        double app5 = softwareHub.getApplicationSizeByName("Netflix");
        System.out.println(app5);*/




    }
}
