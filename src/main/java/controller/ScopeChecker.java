package controller;

public class ScopeChecker {

    public int publicVar = 0;
    private int varOne = 1;

    public ScopeChecker() {
        System.out.println("ScopeCheck created, publicVar = " + publicVar + " &  varOne = " + varOne);
    }

    public void timesTwo() {
        int varTwo = 2; // if I comment this out, looks for the next level ... that is the class variables, and works!
        for (int i = 0; i < 10; i++) {
            System.out.println(i + " times two is " + (i * varTwo));
        }
    }

    public int getPublicVar() {
        return publicVar;
    }

    public void setPublicVar(int publicVar) {
        this.publicVar = publicVar;
    }

    public int getVarOne() {
        return varOne;
    }

    public void setVarOne(int varOne) {
        this.varOne = varOne;
    }

    public class InnerClass {
        public int varThree = 3;

        public InnerClass() {
            System.out.println("InnerClass created, private var is " + varThree);
        }

        public void timesTwo() {
            int privateVar = 2; // if I comment this out, looks for the next level ... that is the class variables, and works!
            for (int i = 0; i < 10; i++) {
                System.out.println(i + " times two is " + (i * privateVar));
            }
        }

        public void usingThisKeyWordForVariable() {
            System.out.println("varOne from ScopeChecker " + ScopeChecker.this.varOne);
        }

        public void timesTwoUsesMethodFromMainClass() {
            ScopeChecker.this.timesTwo();
            for (int i = 0; i < 10; i++) {
                System.out.println(i + " times two is " + (i * ScopeChecker.this.varOne));
            }
            for (int i = 0; i < 10; i++) {
                System.out.println(i + " times two is " + (i * varThree));
            }
        }
    }
}