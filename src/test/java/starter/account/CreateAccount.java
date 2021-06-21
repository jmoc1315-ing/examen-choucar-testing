package starter.account;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Click;
import org.openqa.selenium.Keys;

public class CreateAccount {
    public static Performable singIn() {
        return Task.where("{0} session init '",
        		Enter.keyValues(Keys.ENTER).into(AccountForm.LOGIN)
//                Enter.theValue(searchTerm)
//                        .into(UserForm.SEARCH_FIELD)
//                        .thenHit(Keys.ENTER)
        );
    }
    
    public static Performable linkToGoCreateAccount(String searchTerm) {
        return Task.where("{0} searches for '" + searchTerm + "'",
                Enter.theValue(searchTerm)
                        .into(AccountForm.EMAIL_CREATE)
                        .thenHit(Keys.ENTER)
        );
    }
    
    public static Performable selectTitle() {
        return Task.where("{0} searches for '",
        		Click.on(AccountForm.ID_GENDER1)       
        );
    }
}
