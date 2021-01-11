package com.qa.main;

import java.util.ArrayList;
import java.util.List;

public class Runner {

    public static void main(String[] args) {

        Duck woodDuck = new Duck();
        woodDuck.setName("Wood Duck");
        woodDuck.setAMallard(false);

        Duck mallard = new Duck();
        mallard.setName("Mallard Duck");
        mallard.setAMallard(true);

        Duck redheadDuck = new Duck();
        redheadDuck.setName("Redhead Duck");
        redheadDuck.setAMallard(false);

        Duck myDuckList =  new Duck();
        myDuckList.addToDuckList(woodDuck);
        myDuckList.addToDuckList(mallard);
        myDuckList.addToDuckList(redheadDuck);

        System.out.println("Printing all ducks in list");
        myDuckList.printAllList();
        System.out.println("\n");

        System.out.println("Printing all ducks individually");
        myDuckList.printAll();
        System.out.println("\n");

        System.out.println("Printing all mallards");
        myDuckList.printAllMallard();

        System.out.println("Sorting List");
        myDuckList.printAllList();
        myDuckList.sortAllDucks();
        myDuckList.printAllList();

        myDuckList.printStuff();

    }
}
