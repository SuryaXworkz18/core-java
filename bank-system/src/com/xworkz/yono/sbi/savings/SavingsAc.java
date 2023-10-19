package com.xworkz.yono.sbi.savings;

import com.xworkz.yono.sbi.BankAccount;

public class SavingsAc extends BankAccount {
double interestRate=1.5;
    public SavingsAc(double minBalance){

        this.credit((int)minBalance);

    }

    public double calculationInterestRate( ){

        double interestAmount = (interestRate+getBalance()/100);
        this.credit((int)interestAmount);
        return interestAmount;


    }



}
