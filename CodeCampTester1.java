import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;




// CodeCamp.java - CS314 Assignment 1 - Tester class

/*
 * Student information for assignment:
 * Name: Antonio Gonzalez
 * email address: agonzalez@utexas.edu
 * UTEID: adg3853
 * Section 5 digit ID: 50915
 * Grader name: Irena
 * Number of slip days used on this assignment:
 */

/*
 * CS314 Students: place results of shared birthdays experiments in this
 * comment.
 */


public class CodeCampTester1 {

    public static void main(String[] args) {


        System.out.println("\nHamming Distance TESTS");

        newLine();
        // test 1, hamming distance
        int[] h1 = {1, -2, 3, 4, 5, 4, -60, 2, 1};
        int[] h2 = {1, 2, 13, 4, -30, 4, 3, -10, 1};
        int expected = 5;
        int actual = CodeCamp.hammingDistance(h1, h2);
        System.out.println("hammingDistance test 1: expected value: " + expected
                + ", actual value: " + actual);
        if (expected == actual) {
            System.out.println(" passed test 1, hamming distance");
        } else {
            System.out.println(" ***** FAILED ***** test 1, hamming distance");
        }

        newLine();

        //Hamming distance test 2

        int[] intArray1 = {1, 3, 4, 5, 6, 7, 8, 9};
        int[] intArray2 = {21, 22, 0, 0, 0, 0, 0, 0};

        int expectedHamming = 8;

        int actualHamming = CodeCamp.hammingDistance(intArray1, intArray2);
        System.out.println("hammingDistance test 2: expected value: " + expectedHamming
                + ", actual value: " + actualHamming);

        if (expectedHamming == actualHamming) {
            System.out.println(" passed test 2, hamming distance");
        } else {
            System.out.println(" ***** FAILED ***** test 1, hamming distance");
        }

        newTest();


        System.out.println("isPermutation TESTS\n");

        //isPermuation test 1

        int[] x1 = {1, 2, 3, 4, 5};
        int[] x2 = {5, 4, 3, 2, 1};

        boolean expectedResults = true;
        boolean testResults = CodeCamp.isPermutation(x1, x2);

        System.out.println("isPermutation test 1: expectued bool: " + expectedResults + " Actual bool: " + testResults);
        if (testResults == expectedResults) {
            System.out.println("isPermutation test 1 passed!");
        } else {
            System.out.println("isPermutation test 2 failed");
        }

        newLine();

        //isPermutation test 2

        Random r = new Random();
        int size = 100;
        int[] randArray1 = new int[size];
        int[] randArray2 = new int[size];
        for (int i = 0; i < size; i++) {
            randArray1[i] = r.nextInt();
            randArray2[i] = r.nextInt();
        }

        expectedResults = false;
        testResults = CodeCamp.isPermutation(randArray1, randArray2);

        System.out.println("isPermuatation test 2: expected bool: "
                + expectedResults + " actual bool: " + testResults);

        if (testResults == expectedResults) {
            System.out.println("isPermutation test 2 passed!");
        } else {
            System.out.println("isPermutation test 2 failed");
        }

        newTest();


        System.out.println("mostVowels TESTS\n");

        //mostVowels test 1

        String[] arrayOfStrings = {null, "long ago in a galaxy far far away", null,
                "", "abc", "dont mess with the trees! because the trees speak vietnamese!"};
        expected = 5;
        actual = CodeCamp.mostVowels(arrayOfStrings);

        System.out.println("mostVowels test 1: expected: " + expected +
                " actual: "+ actual);
        if (actual == expected){
            System.out.println("mostVowels test 1 passed!");
        }else{
            System.out.println("mostVowels test 1 failed");
        }

        newLine();

        //mostVowels test 2

        String[] arrayOfStrings1 = {"no vowels", null, "wow", "how many vowels are in this sentance?", "",
                "f fr rxpct", "hook'em", null};
        expected = 3;
        actual = CodeCamp.mostVowels(arrayOfStrings1);

        System.out.println("mostVowels test 2: expected: " + expected +
                " actual: "+ actual);
        if (actual == expected){
            System.out.println("mostVowels test 2 passed!");
        }else{
            System.out.println("mostVowels test 2 failed!");
        }

        newTest();

        System.out.println("sharedBirthday TESTS");
        newLine();

        //sharedBirthday test 1

        int pairs = CodeCamp.sharedBirthdays(1000000, 1);
        expected = 887459712;

        System.out.println("sharedBirthday test 1: expected: " + expected +
                " actual: " + pairs);

        if(pairs == expected){
            System.out.println("sharedBirthday test 1 passed!");
        }else{
            System.out.println("sharedBirthday test 1 failed");
        }

        newLine();

        //sharedBirthday test 2

        pairs = CodeCamp.sharedBirthdays(50, 1);
        expected = 1225;
        System.out.println("sharedBirthday test 2: expected: " + expected +  " actual: " + pairs);

        if(pairs == expected){
            System.out.println("sharedBirthday test 2 passed!");
        }else{
            System.out.println("sharedBirthday test 2 failed");
        }

        newTest();

        System.out.println("queensAreSafe TESTS");

        newLine();

        //queensAreSafe test 1

        char[][] board =  {
                { '.', '.', '.', '.', '.', '.', '.', '.', '.', 'q' },
                { '.', '.', '.', '.', '.', '.', '.', '.', '.', '.' },
                { '.', '.', '.', '.', '.', '.', '.', '.', '.', '.' },
                { '.', '.', '.', '.', '.', '.', '.', '.', '.', '.' },
                { '.', '.', '.', '.', '.', '.', '.', '.', '.', '.' },
                { '.', '.', '.', '.', '.', '.', '.', '.', '.', '.' },
                { '.', '.', '.', '.', '.', '.', '.', '.', '.', '.' },
                { '.', '.', '.', '.', '.', '.', '.', '.', '.', '.' },
                { '.', '.', '.', '.', '.', '.', '.', '.', '.', '.' },
                { 'q', '.', '.', '.', '.', '.', '.', '.', '.', '.' }, };

        boolean isQueenSafe = CodeCamp.queensAreSafe(board);
        boolean expected1 = false;
        System.out.println("queensAreSafe test 1: expected: " + expected1 +
                " actual: " + isQueenSafe);

        if(isQueenSafe == expected1){
            System.out.println("queensAreSafe test 1 passed!");
        }else{
            System.out.println("queensAreSafe test 1 failed");
        }


        newLine();

        //queensAreSafe test 2

        char [][] board1 = {
                { '.', '.', '.', '.', '.', '.', '.', '.', '.', 'q' },
                { '.', '.', '.', '.', '.', '.', '.', 'q', '.', '.' },
                { '.', '.', '.', '.', '.', '.', '.', '.', '.', '.' },
                { '.', '.', '.', '.', '.', '.', '.', '.', 'q', '.' },
                { '.', '.', '.', '.', '.', '.', '.', '.', '.', '.' },
                { '.', '.', '.', '.', '.', '.', '.', '.', '.', '.' },
                { '.', '.', '.', '.', '.', '.', 'q', '.', '.', '.' },
                { '.', '.', '.', '.', '.', '.', '.', '.', '.', '.' },
                { '.', '.', '.', '.', '.', '.', '.', '.', '.', '.' },
                { '.', '.', '.', '.', '.', '.', '.', '.', '.', '.' }, };

        isQueenSafe = CodeCamp.queensAreSafe(board1);
        expected1 = true;

        System.out.println("queensAreSafe test 2: expected: " + expected1 +
                " actual: " + isQueenSafe);

        if(isQueenSafe == expected1){
            System.out.println("queensAreSafe test 2 passed!");
        }else{
            System.out.println("queensAreSafe test 2 failed");
        }

        newTest();

        System.out.println("getValueOfMostValuableProperty TESTS");
        newLine();

        //getValueOfMostValuableProberty test 1

        int[][] city = { { 0, -2, -7, 0, 0 },
                { 9, 2, -6, 2, 0 },
                { -1000, 1, 20, 1, 0 },
                { -1600, 8, 100, 10, 1 },
                { -1000, 1, 500, 10, -6 },
                { -1500, -1, 1, 5, 4 } };
        expected = 656;
        actual = CodeCamp.getValueOfMostValuablePlot(city);
        System.out.println("getValueOfMostValuableProperty test 1: expected: " + expected +
                " actual: " + actual);

        if (actual == expected){
            System.out.println("getValueOfMostValuableProperty test 1 passed!");
        }else{
            System.out.println("getValueOfMostValuableProperty test 1 failed");
        }

        newLine();

        //getValueOfMostValuableProperty test 2

        int[][] city1 = {{-100,-100,-100,-100},
                        {-100,-100,-100,-100},
                        {-10,  -10,  -1,  -10},
                        {-100,-100,-100,-100}};

        expected = -1;
        actual = CodeCamp.getValueOfMostValuablePlot(city1);
        System.out.println("getValueOfMostValuableProperty test 2: expected: "+ expected +
                " actual: " + actual);

        if (actual == expected){
            System.out.println("getValueOfMostValuableProperty test 2 passed!");
        }else{
            System.out.println("getValueOfMostValuableProperty test 2 failed");
        }










//        //Get value of most valuable plot test 1
//        // change size this to your liking
//        int colSize = 20;
//        int rowSize = 30;
//        int[][] city = new int[rowSize][colSize];
//        // change range and startingNum of the random generator as you like
//        int range = 100;
//        int startingNum = -10;
//        for (int i = 0; i < rowSize; i++) {
//            for (int j = 0; j < colSize; j++) {
//                city[i][j] = r.nextInt(range) + startingNum;
//            }
//        }
//
//        // print city so you can manually see
//        for (int row = 0; row < rowSize; row++) {
//            for (int col = 0; col < colSize; col++) {
//                System.out.printf("%4d", city[row][col]);
//            }
//            System.out.println();
//        }
//
//        System.out.println();
//        System.out.println("Your code result is: " + CodeCamp.getValueOfMostValuablePlot(city));
//
//    }
//
//
    }
    private static void newTest(){
        System.out.println("-----------------------------------------------------------------\n\n");
    }

    private static void newLine(){
        System.out.println("\n");
    }


}
