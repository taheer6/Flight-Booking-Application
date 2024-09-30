/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package coe528.lab1;

/**
 *
 * @author khant
 */
public class Member extends Passenger{
    private int yearsOfMembership;

    public int getYearsOfMembership() {
        return yearsOfMembership;
    }

    public void setYearsOfMembership(int yearsOfMembership) {
        this.yearsOfMembership = yearsOfMembership;
    }

    public Member(int a, String n) {
        super(a, n);
        
    }

    @Override
    public double applyDiscount(double p) {
        if(yearsOfMembership>5){
           return p=p*0.5;
        }
        if(5>yearsOfMembership && yearsOfMembership>1){
            return p=p*0.9;
        }
        else{
            return p;
        }
    }
}