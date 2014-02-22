/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package phindile.createtestassign.service.Imp;

import phindile.createtestassign.service.AssignInterface;

/**
 *
 * @author chrisy
 */
public class CreateTestAssignImp implements AssignInterface{
    
    
    
    public CreateTestAssignImp(String a)
    {
    
    }
    public CreateTestAssignImp()
    {
    
    }

   

    @Override
    public int getNumber() {
        return 5;
    }

    @Override
    public boolean Trueth() {
        return true;
    }

    @Override
    public boolean False() {
        
        return false;
    }

    @Override
    public String testNull() {
        return null;
    }
    @Override
        public String testNotNull(String name) {
        return name;
       //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int Multiply(int a, int b) {
        return 10;
        //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int Exception(int a, int b) {
        return a/b;//To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public boolean same(CreateTestAssignImp a) {
        return true;
       
 
    }
    
    
    @Override
    public void timeOutTestMethodTwo() {
    System.out.println("Time out");
    }

    @Override
    public boolean Notsame(CreateTestAssignImp a) {
        return true;
    }

    

   
   

   
    
    
        
    
}
