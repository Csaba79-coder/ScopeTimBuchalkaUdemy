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

        scopeInstance.useInner();

        ScopeChecker.InnerClass inner = scopeInstance.new InnerClass();
        System.out.println("In this case varThree is not accessible from here!!! -> if it has private access!");
        System.out.println("VarThree can be reached if it is public access: " + inner.varThree);
    }
}
