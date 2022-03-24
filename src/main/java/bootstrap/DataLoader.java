package bootstrap;

import controller.ScopeChecker;

public class DataLoader {

    public void load() {
        String varFour = "this is private to DataLoader";

        ScopeChecker scopeInstance = new ScopeChecker();
        System.out.println("scopeInstance varOne is " + scopeInstance.getVarOne());
        System.out.println(varFour);

        scopeInstance.timesTwo();

        ScopeChecker.InnerClass innerClass = scopeInstance.new InnerClass();
        innerClass.timesTwo();
        innerClass.usingThisKeyWordForVariable();

        innerClass.timesTwoUsesMethodFromMainClass();
    }
}
