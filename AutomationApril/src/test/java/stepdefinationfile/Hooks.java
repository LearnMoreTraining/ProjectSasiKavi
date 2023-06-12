package stepdefinationfile;

import io.cucumber.java.Before;
import resusable.BrowserBase;

import java.io.IOException;

public class Hooks {


    @Before()
    public void setup() throws IOException {

        BrowserBase.browserBaseCode();
    }

}
