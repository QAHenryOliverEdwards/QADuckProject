package com.qa.main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Duck {

    private String name;
    private boolean isAMallard;
    private List<Duck> myDuckList = new ArrayList<>();

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

    public List<Duck> getMyDuckList() {
        return myDuckList;
    }

    public void setMyDuckList(List<Duck> myDuckList) {
        this.myDuckList = myDuckList;
    }

    public void addToDuckList(Duck duck) {
        this.myDuckList.add(duck);
    }

    @Override
    public String toString() {
        return "Duck{" +
                "name='" + name + '\'' +
                ", isAMallard=" + isAMallard +
                '}';
    }

    public void printAll() {
        for (Duck duck : this.myDuckList) {
            System.out.println(duck.toString());
        }
    }

    public void printAllList() {
        System.out.println(this.myDuckList);
    }

    public void printAllMallard() {
        for (Duck duck : this.myDuckList) {
            if (duck.isAMallard()) {
                System.out.println(duck);
            }
        }
    }

    public void sortAllDucks() {
        List<String> nameList = new ArrayList<>();

        for (Duck duck : this.myDuckList) {
            nameList.add(duck.name);
        }

        Collections.sort(nameList);

        List<Duck> myDuckList2 = new ArrayList<>();

        for (String name : nameList) {
            for (Duck duck : this.myDuckList) {
                if (duck.name.equals(name)) {
                    myDuckList2.add(duck);
                }
            }
        }

        myDuckList = myDuckList2;

    }

}
