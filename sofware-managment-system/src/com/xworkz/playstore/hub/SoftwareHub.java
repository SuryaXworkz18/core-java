package com.xworkz.playstore.hub;

import com.xworkz.playstore.app.Application;

import java.lang.reflect.Array;
import java.util.Arrays;

public class SoftwareHub {


    Application application[] ;
    public SoftwareHub(int size){
       application = new Application[size];
    }
    int index;

    public boolean addApplication(Application application) {
        boolean isadded = false;
        if (application != null) {
            this.application[index++] = application;
            isadded = true;
        }
        return isadded;
    }



    public void getAllapplication() {
        System.out.println("The list of application");
        for (int index = 0; index < application.length; index++) {
            System.out.println(application[index].getAppID() + " " + application[index].getAppName()+" "+application[index].getAppVersion()+" "+application[index].getAppSize());
        }

    }

    public String getApplicationByName(String appName) {
        String application1 = null;

        for (int index = 0; index < this.application.length; index++) {
            if (application[index].getAppName() == appName) {
                application1 = application[index].getAppName();
                System.out.println("The application is found.......");
            }

        }
        return application1;
    }

    public Application getApplicationById(int appId){
        Application apps = null;

        for (int appindex = 0; appindex < this.application.length; appindex++) {
            if(application[appindex].getAppID()==appId){
                apps = application[appindex];
                System.out.println("The application found using AppId");
            }

        }
        return apps;



    }

    public Application getApplicationBytype(String apptype){
        Application apps1 = null;

        for (int appindex = 0; appindex < this.application.length; appindex++) {
            if(application[appindex].getApptype()==apptype){
                apps1 = application[appindex];
                System.out.println("The application found using App type is.......");
            }

        }
        return apps1;

    }

    public Application getApplicationNameByType(String apptype){
        Application apps2 = null;
        for (int index = 0; index < this.application.length; index++) {
            if(application[index].getApptype()==apptype){
                apps2 = application[index];
                System.out.println("The application type is found....");
                System.out.println("The application name is----");
            }

        }
        return  apps2;
    }

    public String getApplicationTypeByName(String appName){
       String apps3 = null;
        for (int index = 0; index < this.application.length; index++) {
            if(application[index].getAppName()==appName){
                apps3 = application[index].getApptype();
                System.out.println("The application name is found....");
                System.out.println("The application Type is----");
            }

        }
        return  apps3;
    }

    public double getApplicationSizeByName(String appName){
        double apps4 = 0.0;
        for (int index = 0; index < this.application.length; index++) {
            if(application[index].getAppName()==appName){
                apps4 = application[index].getAppSize();
                System.out.println("The application Name is found....");
                System.out.println("The application Size is----");
            }

        }
        return  apps4;
    }

    public boolean updateAppVersionbyName(String newVersion,String exitingAppName){

        boolean updateVersion = false;
        System.out.println("The App name is found.......");
        for (int index = 0; index < this.application.length; index++) {
            if(application[index].getAppName()==exitingAppName){
                application[index].setAppVersion(newVersion);

                updateVersion=true;
                System.out.println("The app version is updated successfully");
            }

        }
        return updateVersion;
    }

     public boolean updateAppVersionandSizebyName(String newVersion,double newSize,String existingAppName){
        boolean updateVesionandSize = false;
         System.out.println("The App Name is found......");
         for (int index = 0; index < application.length; index++) {
             if(application[index].getAppName()==existingAppName){
                 application[index].setAppVersion(newVersion);
                 application[index].setAppSize(newSize);
                 updateVesionandSize=true;
                 System.out.println("The App Version And Size is updated");
             }

         }
        return updateVesionandSize;


     }

     public void deleteApplicationByAppName(String appName){


         System.out.println("Invokes the delete operation");

         int index,newindex;
         for(index =0,newindex=0;index<this.application.length;index++){
             if(application[index].getAppName()!= appName){
                 application[newindex++]=application[index];
                 System.out.println("Given App name is been deleted from the Software");
             }
         }
         application = Arrays.copyOf(application,newindex);
         getAllNewApplication(application);

     }

     public void getAllNewApplication(Application[] application){
         for (int i = 0; i < application.length; i++) {
             System.out.println(application[i].getAppID()+" "+application[i].getAppName()+" "+application[i].getAppSize()+" "+application[i].getAppVersion());

         }


     }


}






