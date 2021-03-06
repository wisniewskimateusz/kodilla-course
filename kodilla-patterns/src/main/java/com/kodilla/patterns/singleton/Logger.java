package com.kodilla.patterns.singleton;

public enum Logger {

    INSTANCE;

    private String lastLog = "";

    public String log(String log) {
        return lastLog = "Log: [" + log + "]";
    }

    public String getLastLog() {
        return lastLog;
    }
}