package com.qa.main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DuckList {

    private List<Duck> myDuckList = new ArrayList<>();

    public List<Duck> getMyDuckList() {
        return myDuckList;
    }

    public void setMyDuckList(List<Duck> myDuckList) {
        this.myDuckList = myDuckList;
    }

    public void addToDuckList(Duck duck) {
        this.myDuckList.add(duck);
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
            nameList.add(duck.getName());
        }

        Collections.sort(nameList);

        List<Duck> myDuckList2 = new ArrayList<>();

        for (String name : nameList) {
            for (Duck duck : this.myDuckList) {
                if (duck.getName().equals(name)) {
                    myDuckList2.add(duck);
                }
            }
        }

        myDuckList = myDuckList2;

    }

}
