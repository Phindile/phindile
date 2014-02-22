/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package phindile.createtestassign.Test;

import java.util.Scanner;
import org.junit.Assert;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import phindile.createtestassign.config.AppConfig;
import phindile.createtestassign.service.AssignInterface;
import phindile.createtestassign.service.Imp.CreateTestAssignImp;

/**
 *
 * @author chrisy
 */
public class creatTest {
    private AssignInterface inter;
    
    @BeforeMethod
     public void setUp() throws Exception {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        inter = (AssignInterface)ctx.getBean("Test");

    }
    
    @Test
    public void expectingNumberFive() throws Exception {
        assertEquals(5, new CreateTestAssignImp().getNumber());
    }
    @Test
    public void BooleanTrue() throws Exception{
        assertTrue(true); 
       
    }
    @Test
    public void BooleanFalse() throws Exception {
        assertFalse(false);
    }
    
    @Test
    
    public void tectNull() throws Exception{
        assertNull(new CreateTestAssignImp().testNull());
    }
   @Test
   
   public void testNotNull()throws Exception {
       assertNotNull(new CreateTestAssignImp().testNotNull("Pindile"));

   }
   @Test
    public void Fail()throws Exception{
        int results = inter.Multiply(5,9);
       Assert.fail("Delibarelety made to Failed");
     }
     @Test
      public void Eception()throws Exception{
         
          int numerator =8;
          int Denominator=0;
        
           int result = inter.Exception(numerator,Denominator);
         System.out.printf("\nResult: %d / %d = %d\n", numerator, Denominator, result );
             
      }
      

@Test
public void same()throws Exception{
    
    CreateTestAssignImp obj1,obj2;
            obj1= new CreateTestAssignImp("hey");
            obj2 =new CreateTestAssignImp("hey");
    assertSame(inter.same(obj1),inter.same(obj2));
   
}
public void Notsame()throws Exception{
    
    CreateTestAssignImp obj1,obj2;
            obj1= new CreateTestAssignImp("hey");
            obj2 =new CreateTestAssignImp("hi");
            assertSame(inter.same(obj1),inter.same(obj2));

   
}


@Test(timeOut = 5000)
public void timeOutTestMethodRunForEver() {
    while (true) {


    }
}

}

