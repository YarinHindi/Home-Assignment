package WorkFlow;

import Utilities.CommonOps;
import Extentions.uiActions;

public class WorkFlows extends CommonOps {

    public static void CreatAccount(String firstname,String lastname,String emailAd,String password){
        uiActions.click(homePage.creatAccountBtn);
//
//        uiActions.click(createAccount.firstNameField);
        uiActions.updateText(createAccount.firstNameField,firstname);
        uiActions.updateText(createAccount.lastNameField,lastname);
        uiActions.updateText(createAccount.emailAddressField,emailAd);
        uiActions.updateText(createAccount.passwordField,password);
        uiActions.updateText(createAccount.passwordConfirmationFiled,password);
        uiActions.click(createAccount.createAccountBtn);


    }
}
