package com.xworkz.irctc;

import com.xworkz.irctc.railway.Train;
import com.xworkz.irctc.station.Station;

import java.util.Scanner;

public class RailwayExe {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("The no of Train to be added");
        int size=sc.nextInt();
        Station station = new Station(size);

        for (int index = 0; index < size; index++) {
            Train train = new Train();
            System.out.println("Enter PNR No");
            train.setPnrNo(sc.nextInt());
            System.out.println("Enter train name");
            train.setTrainName(sc.next());
            System.out.println("Enter the type");
            train.setTrainType(sc.next());
            System.out.println("Enter no coaches");
            train.setNoCoaches(sc.nextInt());
            System.out.println("Enter no of Ac coaches");
            train.setNoAcCoaches(sc.nextInt());
            System.out.println("Enter Departure Time ");
            train.setDeparterTiming(sc.next());
            System.out.println("Enter Reaching Time");
            train.setReachTime(sc.next());
            System.out.println("Enter Starting point");
            train.setEndpoint(sc.next());
            System.out.println("Enter End Point");
            train.setEndpoint(sc.next());

            station.addTrain(train);

        }
        station.getAllTrain();

        String input = null;

        do{
            System.out.println("Press 1 : get the all Train");
            System.out.println("Press 2 : get train by name");
            System.out.println("Press 3 : get train by endpoint");
            System.out.println("Press 4 : to update train type by name");

            int option=sc.nextInt();
            switch (option){

                case 1 : station.getAllTrain();
                    break;
                case 2 : String sd = station.getTrainByName(sc.next());
                    break;
                case 3 : String sg = station.getTrainByEndpoint(sc.next());
                    break;
                case 4 :
                    System.out.println("Enter the train name");
                    boolean update = station.updateTrainTypeByName(sc.next(), sc.next());
                                        station.getAllTrain();aa

                default:
                    System.out.println("please enter the option availble ");
            }
            System.out.println("To countinue press Y & to exit press N");
            input = sc.next();

        }while (input.equals("Y"));
        System.out.println("Thank you for using ");




    }
}
