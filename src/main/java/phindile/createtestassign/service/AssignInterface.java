/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package phindile.createtestassign.service;

import phindile.createtestassign.service.Imp.CreateTestAssignImp;

/**
 *
 * @author chrisy
 */
public interface AssignInterface {
    public  int getNumber(); 
    public boolean Trueth();
    public boolean False();
    public String testNull();
    public String testNotNull(String a);
    public int Multiply(int a,int b);
    public int Exception(int a,int b);
    public boolean same(CreateTestAssignImp a);
    public boolean Notsame(CreateTestAssignImp a);
    public void  timeOutTestMethodTwo();
    
   
    

}
