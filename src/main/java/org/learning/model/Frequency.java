package org.learning.model;

public enum Frequency {
    ONCE("ONCE"), DAILY("DAILY"), WEEKLY("WEEKLY"), MONTHLY("MONTHLY");

    private String value;

    Frequency(String value) {
        this.value = value;
    }
}
