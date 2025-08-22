package com.Automation.pageObejct;
public class ScenarioErrorContext {
    private static final ThreadLocal<Throwable> errorHolder = new ThreadLocal<>();

    public static void setError(Throwable error) {
        errorHolder.set(error);
    }

    public static Throwable getError() {
        return errorHolder.get();
    }

    public static void clear() {
        errorHolder.remove();
    }
}