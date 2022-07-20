package stepdefs;

import io.cucumber.java.da.Givet;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HelloWorldStepDefs {

    private int alexApplesCount;
    private int kateApplesCount;
    private int applesTotalCount;

    @Givet("Alex has {int} apples")
    public void set_appeles_for_alex(int count) {
        alexApplesCount = count;
    }

    @Givet("Jekaterina has {int} apples")
    public void set_apples_for_kate(int count) {
        kateApplesCount = count;
    }

    @When("they are puttings all apples together")
    public void put_apples_together() {

    }

    @Then("they have {int} apples")
    public void check_apples_count(int count) {
        applesTotalCount = count;
    }
}
