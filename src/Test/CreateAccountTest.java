package Test;

import Extentions.Verifications;
import Extentions.uiActions;
import Utilities.CommonOps;


import WorkFlow.WorkFlows;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import Utilities.CommonOps;

public class CreateAccountTest extends CommonOps {

    @Test(description = "TEST-0 create an account and check if account and check if account is really created")
    public void Test_01(){
        WorkFlows.CreatAccount("yarin","hindi","y@gmail.com","1234!@#$a");
        driver.getTitle();


    }



}
