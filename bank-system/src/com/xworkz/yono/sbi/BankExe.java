package com.xworkz.yono.sbi;

import com.xworkz.yono.sbi.savings.SavingsAc;

public class BankExe {

    public static void main(String args[]){

        BankAccount myAcc = new SavingsAc(10000);
        myAcc.credit(12000);
        myAcc.credit(50000);
        myAcc.debite(7000);

        System.out.println(myAcc.getBalance());

        SavingsAc mySavingsAcc = (SavingsAc)myAcc;

        mySavingsAcc.calculationInterestRate();
        System.out.println(mySavingsAcc.calculationInterestRate());
        System.out.println("Balance after interest rate"+mySavingsAcc.getBalance());
        System.out.println("my available balence" +myAcc.getBalance());


       /*
//1
        SavingsAc frendAcc = new SavingsAc();
        frendAcc.credit(300);


        myAcc.tranfer(2000, frendAcc);

        System.out.println("My acc balance"+myAcc.getBalance());
        System.out.println("Frend ac balance"+frendAcc.getBalance());

//2
        SavingsAc momsAcc = new SavingsAc();
        momsAcc.credit(10000);

        myAcc.tranfer(15000,momsAcc);

        System.out.println("Moms Acc balance-"+momsAcc.getBalance());
//3
        SavingsAc rameshwaramCafe = new SavingsAc();

        myAcc.tranfer(500,rameshwaramCafe);
//4
        SavingsAc fatherAcc = new SavingsAc();
        momsAcc.credit(100000);

        myAcc.tranfer(5000,fatherAcc);

        System.out.println("Father Acc balance-"+fatherAcc.getBalance());
//5
        SavingsAc broAcc = new SavingsAc();
        broAcc.credit(20000);

        myAcc.tranfer(5000,broAcc);

        System.out.println("bro Acc balance-"+broAcc.getBalance());
//6
        SavingsAc sisAcc = new SavingsAc();
        sisAcc.credit(7000);

        myAcc.tranfer(5000,sisAcc);

        System.out.println("sis Acc balance-"+sisAcc.getBalance());
        System.out.println("my balance-"+myAcc.getBalance());
//7
        SavingsAc martAcc = new SavingsAc();
        martAcc.credit(10000);

        myAcc.tranfer(2000,martAcc);

        System.out.println("mart Acc balance-"+martAcc.getBalance());
        System.out.println("my balance-"+myAcc.getBalance());
//8
        SavingsAc surajAcc = new SavingsAc();
        surajAcc.credit(10000);

        myAcc.tranfer(1500,surajAcc);

        System.out.println("suraj Acc balance-"+surajAcc.getBalance());
        System.out.println("my balance-"+myAcc.getBalance());

 //9
        SavingsAc pandaAcc = new SavingsAc();
        pandaAcc.credit(10000);

        myAcc.tranfer(2000,martAcc);

        System.out.println("panda Acc balance-"+pandaAcc.getBalance());
        System.out.println("my balance-"+myAcc.getBalance());

//10
        SavingsAc umaAcc = new SavingsAc();
        umaAcc.credit(10000);

        myAcc.tranfer(4000,martAcc);

        System.out.println("uma Acc balance-"+umaAcc.getBalance());
        System.out.println("my balance-"+myAcc.getBalance());

 //11
        SavingsAc prasannaAcc = new SavingsAc();
        prasannaAcc.credit(10000);

        myAcc.tranfer(3000,martAcc);

        System.out.println("prasanna Acc balance-"+prasannaAcc.getBalance());
        System.out.println("my balance-"+myAcc.getBalance());*/


    }
}
