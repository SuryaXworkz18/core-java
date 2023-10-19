package com.xworkz.irctc.station;

import com.xworkz.irctc.railway.Train;

public class Station {

    Train train[];

    public Station(int size){
        train = new Train[size];

    }
    int index;

    public  boolean addTrain(Train train){
        boolean isadded=false;
        if(train != null){
        this.train[index]=train;
        index++;
        isadded=true;
        }
        return isadded;

    }


    public void getAllTrain(){
        System.out.println("------The list of trains is-----");
        for (int index = 0; index < train.length; index++) {
            System.out.println("PNR no- "+train[index].getPnrNo()
                    +"Train name- "+train[index].getTrainName()
                    +"Train type- "+train[index].getTrainType()
                    +"No of coaches- "+train[index].getNoCoaches()
                    +"No of Ac coaches- "+train[index].getNoAcCoaches()
                    +"Deaprter time- "+train[index].getDeparterTiming()
                    +"Reaching time- "+train[index].getReachTime()
                    +"Strting point- "+train[index].getStartingPoint()
                    +"End point- "+train[index].getEndpoint());

        }
    }

    public String getTrainByName(String trainName) {
        String train1 = null;

        for (int index = 0; index < this.train.length; index++) {
            if (train[index].getTrainName() == trainName) {
                train1  = train[index].getTrainName();
                System.out.println("Train is found.......");
            }

        }
        return train1;
    }

    public String getTrainByEndpoint(String endPoint) {
        String train1 = null;

        for (int index = 0; index < this.train.length; index++) {
            if (train[index].getEndpoint().equals(endPoint)) {
                train1 = train[index].getEndpoint();
                System.out.println("The Train end point is found.......");
            }

        }
        return train1;
    }

    public  boolean updateTrainTypeByName(String exitingTrainName,String newType){
        boolean updateTrain=false;
        for (int index = 0; index < this.train.length; index++) {
            if(train[index].getTrainName().equals(exitingTrainName)){
                train[index].setTrainType(newType);
                updateTrain= true;
                System.out.println("The post name is updated");

            }
        }
        return updateTrain;



    }


}
