package starter.stepdefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.ParameterType;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.ensure.Ensure;
import starter.account.CreateAccount;
import starter.account.WikipediaArticle;
import starter.navigation.NavigateTo;

public class SearchStepDefinitions {

    @Given("{actor} is launching the index page")
    public void he_is_researching_things_on_the_internet(Actor actor) {
        actor.wasAbleTo(NavigateTo.theAutomationPracticeIndexPage());
    }

    @When("{actor} is heading to create an account")
    public void he_is_go_to_create_user(Actor actor) {
        actor.attemptsTo(
                CreateAccount.singIn()
        );
    }
    
    @And("{actor} create an account with email {string}")
    public void create_an_account_with_email(Actor actor,String term) {
    	actor.attemptsTo(
              CreateAccount.linkToGoCreateAccount(term)
              );
    }
    
    
    @And("{actor} select title option Mr")
    public void create_an_account_with_email(Actor actor) {
    	actor.attemptsTo(
              CreateAccount.selectTitle()
              );
    }
    


    @Then("{actor} should see information about {string}")
    public void should_see_information_about(Actor actor, String term) {
        actor.attemptsTo(
                Ensure.that(WikipediaArticle.HEADING).hasText(term)
        );
    }
}
