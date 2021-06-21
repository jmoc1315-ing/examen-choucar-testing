package starter.account;

import net.serenitybdd.screenplay.targets.Target;

class AccountForm {

    static Target EMAIL_CREATE= Target.the("Create an account").
    		locatedBy("#email_create");
    
    static Target LOGIN= Target.the("Sign In").
    		locatedBy(".login");
    
    static Target ID_GENDER1 = Target.the("Title Mr.")
            .locatedBy("#id_gender1");
    static Target ID_GENDER2 = Target.the("Title Mrs.")
            .locatedBy("#id_gender2");
    static Target FIRST_NAME = Target.the("First name")
            .locatedBy("#customer_firstname");
    static Target LAST_NAME = Target.the("Last name")
            .locatedBy("#customer_lastname");
    static Target REGISTER = Target.the("Register")
            .locatedBy("#submitAccount");
    
    

}
