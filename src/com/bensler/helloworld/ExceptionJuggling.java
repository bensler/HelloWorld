package com.bensler.helloworld;

public abstract class ExceptionJuggling {

    public void doSomething() {
        try {
            try {
                callAService();
            } catch (SomeException e) {
                throw new RuntimeException(e.getMessage()); // losing stacktrace
            }
        } catch (Exception e) {
            e.printStackTrace(System.err); // not using a logging framework for the sake of simplicity
        }
    }

    abstract void callAService() throws SomeException;

}

class SomeException extends Exception {
}