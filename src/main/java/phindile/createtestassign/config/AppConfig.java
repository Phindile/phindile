/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package phindile.createtestassign.config;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import phindile.createtestassign.service.AssignInterface;
import phindile.createtestassign.service.Imp.CreateTestAssignImp;

/**
 *
 * @author chrisy
 */
@Configuration
public class AppConfig {
    @Bean(name="Test")
    public AssignInterface getService()
    {        return new CreateTestAssignImp();
    }
    
}
