package com.mands.bdd;

import cucumber.api.cli.Main;

public class CucumberRunner {
    public static void main(String[] args) throws Throwable {
        RunCukeTestsIT.setup();
        Hooks hooks = new Hooks();
        hooks.beforeScenario();
        Runtime.getRuntime().addShutdownHook(new Thread() {
            public void run() {
                RunCukeTestsIT.teardown();
            }
        });
        Main.main(args);
    }
}
