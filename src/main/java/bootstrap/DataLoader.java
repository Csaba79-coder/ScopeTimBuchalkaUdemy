package bootstrap;

import controller.ScopeChecker;

public class DataLoader {

    public void load() {
        String privateVar = "this is private to DataLoader";

        ScopeChecker scopeInstance = new ScopeChecker();
        System.out.println("scopeInstance privateVar is " + scopeInstance.getPrivateVar());
        System.out.println(privateVar);

        scopeInstance.timesTwo();
    }
}
