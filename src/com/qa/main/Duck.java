package com.qa.main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Duck {

    private String name;
    private boolean isAMallard;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isAMallard() {
        return isAMallard;
    }

    public void setAMallard(boolean AMallard) {
        this.isAMallard = AMallard;
    }

    @Override
    public String toString() {
        return "Duck{" +
                "name='" + name + '\'' +
                ", isAMallard=" + isAMallard +
                '}';
    }


}
