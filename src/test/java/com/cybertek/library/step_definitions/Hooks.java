package com.cybertek.library.step_definitions;

import com.cybertek.library.utilities.Driver;
import org.junit.After;

public class Hooks {

    @After

    public void tearDownScenario(){
        System.out.println("--Teardown steps are being applied--");
        Driver.closeDriver();
    }
}
