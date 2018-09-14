import com.Example.Example;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

//import static org.hamcrest.MatcherAssert.assertThat;
//import static org.hamcrest.core.Is.is;


public class MyStepdefs {
    private Example _target;
    private String _actualResult;

    @Given("^I am officiating a FizzBuzz game$")
    public void iAmOfficiatingAFizzBuzzGame() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
//        throw new PendingException();
        _target = new Example();
    }

    @When("^the number (\\d+) is played$")
    public void theNumberIsPlayed(int playedNumber) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
//        throw new PendingException();
        _actualResult = _target.checkPlay(playedNumber);
    }

    @Then("^I should be told the correct answer is \"([^\"]*)\"$")
    public void iShouldBeToldTheCorrectAnswerIs(String expectedResult) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
//        throw new PendingException();

        assertThat(expectedResult).isEqualTo(_actualResult);

    }

    @Given("^I am on the \"([^\"]*)\" page$")
    public void iAmOnThePage(String arg0) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @And("^I click the \"([^\"]*)\" button$")
    public void iClickTheButton(String arg0) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^I should go to the \"([^\"]*)\" page$")
    public void iShouldGoToThePage(String arg0) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }
}
