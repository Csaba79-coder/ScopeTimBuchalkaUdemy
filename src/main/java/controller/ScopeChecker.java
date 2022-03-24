package controller;

public class ScopeChecker {

    public int publicVar = 0;
    private int privateVar = 1;

    public ScopeChecker() {
        System.out.println("ScopeCheck created, publicVar = " + publicVar + " & privateVar = " + privateVar);
    }

    public void timesTwo() {
        int privateVar = 2; // if I comment this out, looks for the next level ... that is the class varialbe, and works!
        for (int i = 0; i < 10; i++) {
            System.out.println(i + " times two is " + (i * privateVar));
        }
    }

    public int getPublicVar() {
        return publicVar;
    }

    public void setPublicVar(int publicVar) {
        this.publicVar = publicVar;
    }

    public int getPrivateVar() {
        return privateVar;
    }

    public void setPrivateVar(int privateVar) {
        this.privateVar = privateVar;
    }

    public class InnerClass {
        public int privateVar = 3;

        public InnerClass() {
            System.out.println("InnerClass created, private var is " + privateVar);
        }

        public void timesTwo() {
            int privateVar = 2; // if I comment this out, looks for the next level ... that is the class varialbe, and works!
            for (int i = 0; i < 10; i++) {
                System.out.println(i + " times two is " + (i * privateVar));
            }
        }
    }
}