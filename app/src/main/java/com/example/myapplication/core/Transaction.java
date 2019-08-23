package com.example.myapplication.core;

import java.util.Date;

public class Transaction {
    // private variables
    private int transactionId;
    private double amount;
    private String transaction_Description;
    private Boolean c_or_d;

    Date transactionDate= new Date();


    // setters
    public void setTransactionId(int transactionId){
        this.transactionId=transactionId;
    }

    public void setTransaction_Description(String transaction_Description){
        this.transaction_Description=transaction_Description;
    }

    public void setAmount(double amount){
        this.amount=amount;
    }

    public void setC_or_d(boolean c_or_d){
        this.c_or_d=c_or_d;
    }

    // getters

    public int getTransactionId(){
        return transactionId;
    }

    public double getAmount(){
        return amount;
    }

    public String getTransaction_Description(){
        return transaction_Description;
    }

    public boolean getC_or_d(){
        return c_or_d;
    }

    // any additional static functions

    public static void test(){}
}
