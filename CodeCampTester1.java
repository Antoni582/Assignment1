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
 * Experiment 1: According the the experiment there is on average
 * 0.636 pairs.
 *
 * Experiment 2: According to my data, there needs to be at least 20 people
 * for there to be a 50% chance there is at least one pair.
 *
 * Question 3: it exeeds 50% when there is at least 20 people.
 *
 *
 *
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

        int pairs = CodeCamp.sharedBirthdays(100000, 1);
        expected = 704982704;

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

        newLine();

       // CodeCamp.birthDayExperiment1();
      //  CodeCamp.birthdayExperiment2();
       // CodeCamp.birthdayExperiment3();

        // It Requires at least 20 people so that the probablity that one of them shares a birthday is
        // at least 50%.

//        Num People: 2, number of experiments with one or more shared birthday: 127 percentage: 0.25
//        Num People: 3, number of experiments with one or more shared birthday: 396 percentage: 0.79
//        Num People: 4, number of experiments with one or more shared birthday: 787 percentage: 1.57
//        Num People: 5, number of experiments with one or more shared birthday: 1281 percentage: 2.56
//        Num People: 6, number of experiments with one or more shared birthday: 1950 percentage: 3.90
//        Num People: 7, number of experiments with one or more shared birthday: 2825 percentage: 5.65
//        Num People: 8, number of experiments with one or more shared birthday: 3800 percentage: 7.60
//        Num People: 9, number of experiments with one or more shared birthday: 4917 percentage: 9.83
//        Num People: 10, number of experiments with one or more shared birthday: 6094 percentage: 12.19
//        Num People: 11, number of experiments with one or more shared birthday: 7496 percentage: 14.99
//        Num People: 12, number of experiments with one or more shared birthday: 8997 percentage: 17.99
//        Num People: 13, number of experiments with one or more shared birthday: 10579 percentage: 21.16
//        Num People: 14, number of experiments with one or more shared birthday: 12409 percentage: 24.82
//        Num People: 15, number of experiments with one or more shared birthday: 14308 percentage: 28.62
//        Num People: 16, number of experiments with one or more shared birthday: 16280 percentage: 32.56
//        Num People: 17, number of experiments with one or more shared birthday: 18435 percentage: 36.87
//        Num People: 18, number of experiments with one or more shared birthday: 20684 percentage: 41.37
//        Num People: 19, number of experiments with one or more shared birthday: 23194 percentage: 46.39
//        Num People: 20, number of experiments with one or more shared birthday: 25700 percentage: 51.40
//        Num People: 21, number of experiments with one or more shared birthday: 28329 percentage: 56.66
//        Num People: 22, number of experiments with one or more shared birthday: 31204 percentage: 62.41
//        Num People: 23, number of experiments with one or more shared birthday: 34112 percentage: 68.22
//        Num People: 24, number of experiments with one or more shared birthday: 37161 percentage: 74.32
//        Num People: 25, number of experiments with one or more shared birthday: 40355 percentage: 80.71
//        Num People: 26, number of experiments with one or more shared birthday: 43648 percentage: 87.30
//        Num People: 27, number of experiments with one or more shared birthday: 47008 percentage: 94.02
//        Num People: 28, number of experiments with one or more shared birthday: 50539 percentage: 100.00
//        Num People: 29, number of experiments with one or more shared birthday: 54245 percentage: 100.00
//        Num People: 30, number of experiments with one or more shared birthday: 58061 percentage: 100.00
//        Num People: 31, number of experiments with one or more shared birthday: 62040 percentage: 100.00
//        Num People: 32, number of experiments with one or more shared birthday: 66142 percentage: 100.00
//        Num People: 33, number of experiments with one or more shared birthday: 70279 percentage: 100.00
//        Num People: 34, number of experiments with one or more shared birthday: 74609 percentage: 100.00
//        Num People: 35, number of experiments with one or more shared birthday: 79035 percentage: 100.00
//        Num People: 36, number of experiments with one or more shared birthday: 83657 percentage: 100.00
//        Num People: 37, number of experiments with one or more shared birthday: 88263 percentage: 100.00
//        Num People: 38, number of experiments with one or more shared birthday: 93027 percentage: 100.00
//        Num People: 39, number of experiments with one or more shared birthday: 98051 percentage: 100.00
//        Num People: 40, number of experiments with one or more shared birthday: 103056 percentage: 100.00
//        Num People: 41, number of experiments with one or more shared birthday: 108145 percentage: 100.00
//        Num People: 42, number of experiments with one or more shared birthday: 113510 percentage: 100.00
//        Num People: 43, number of experiments with one or more shared birthday: 118999 percentage: 100.00
//        Num People: 44, number of experiments with one or more shared birthday: 124551 percentage: 100.00
//        Num People: 45, number of experiments with one or more shared birthday: 130213 percentage: 100.00
//        Num People: 46, number of experiments with one or more shared birthday: 135999 percentage: 100.00
//        Num People: 47, number of experiments with one or more shared birthday: 142074 percentage: 100.00
//        Num People: 48, number of experiments with one or more shared birthday: 148018 percentage: 100.00
//        Num People: 49, number of experiments with one or more shared birthday: 154246 percentage: 100.00
//        Num People: 50, number of experiments with one or more shared birthday: 160494 percentage: 100.00
//        Num People: 51, number of experiments with one or more shared birthday: 166891 percentage: 100.00
//        Num People: 52, number of experiments with one or more shared birthday: 173490 percentage: 100.00
//        Num People: 53, number of experiments with one or more shared birthday: 180090 percentage: 100.00
//        Num People: 54, number of experiments with one or more shared birthday: 186823 percentage: 100.00
//        Num People: 55, number of experiments with one or more shared birthday: 193647 percentage: 100.00
//        Num People: 56, number of experiments with one or more shared birthday: 200654 percentage: 100.00
//        Num People: 57, number of experiments with one or more shared birthday: 207773 percentage: 100.00
//        Num People: 58, number of experiments with one or more shared birthday: 215067 percentage: 100.00
//        Num People: 59, number of experiments with one or more shared birthday: 222488 percentage: 100.00
//        Num People: 60, number of experiments with one or more shared birthday: 229961 percentage: 100.00
//        Num People: 61, number of experiments with one or more shared birthday: 237553 percentage: 100.00
//        Num People: 62, number of experiments with one or more shared birthday: 245351 percentage: 100.00
//        Num People: 63, number of experiments with one or more shared birthday: 253039 percentage: 100.00
//        Num People: 64, number of experiments with one or more shared birthday: 261028 percentage: 100.00
//        Num People: 65, number of experiments with one or more shared birthday: 269149 percentage: 100.00
//        Num People: 66, number of experiments with one or more shared birthday: 277411 percentage: 100.00
//        Num People: 67, number of experiments with one or more shared birthday: 285657 percentage: 100.00
//        Num People: 68, number of experiments with one or more shared birthday: 293859 percentage: 100.00
//        Num People: 69, number of experiments with one or more shared birthday: 302331 percentage: 100.00
//        Num People: 70, number of experiments with one or more shared birthday: 310822 percentage: 100.00
//        Num People: 71, number of experiments with one or more shared birthday: 319724 percentage: 100.00
//        Num People: 72, number of experiments with one or more shared birthday: 328559 percentage: 100.00
//        Num People: 73, number of experiments with one or more shared birthday: 337539 percentage: 100.00
//        Num People: 74, number of experiments with one or more shared birthday: 346660 percentage: 100.00
//        Num People: 75, number of experiments with one or more shared birthday: 355900 percentage: 100.00
//        Num People: 76, number of experiments with one or more shared birthday: 365234 percentage: 100.00
//        Num People: 77, number of experiments with one or more shared birthday: 374544 percentage: 100.00
//        Num People: 78, number of experiments with one or more shared birthday: 384006 percentage: 100.00
//        Num People: 79, number of experiments with one or more shared birthday: 393791 percentage: 100.00
//        Num People: 80, number of experiments with one or more shared birthday: 403585 percentage: 100.00
//        Num People: 81, number of experiments with one or more shared birthday: 413426 percentage: 100.00
//        Num People: 82, number of experiments with one or more shared birthday: 423422 percentage: 100.00
//        Num People: 83, number of experiments with one or more shared birthday: 433523 percentage: 100.00
//        Num People: 84, number of experiments with one or more shared birthday: 443673 percentage: 100.00
//        Num People: 85, number of experiments with one or more shared birthday: 454118 percentage: 100.00
//        Num People: 86, number of experiments with one or more shared birthday: 464535 percentage: 100.00
//        Num People: 87, number of experiments with one or more shared birthday: 474938 percentage: 100.00
//        Num People: 88, number of experiments with one or more shared birthday: 485586 percentage: 100.00
//        Num People: 89, number of experiments with one or more shared birthday: 496229 percentage: 100.00
//        Num People: 90, number of experiments with one or more shared birthday: 507027 percentage: 100.00
//        Num People: 91, number of experiments with one or more shared birthday: 518096 percentage: 100.00
//        Num People: 92, number of experiments with one or more shared birthday: 529152 percentage: 100.00
//        Num People: 93, number of experiments with one or more shared birthday: 540166 percentage: 100.00
//        Num People: 94, number of experiments with one or more shared birthday: 551528 percentage: 100.00
//        Num People: 95, number of experiments with one or more shared birthday: 562839 percentage: 100.00
//        Num People: 96, number of experiments with one or more shared birthday: 574543 percentage: 100.00
//        Num People: 97, number of experiments with one or more shared birthday: 586124 percentage: 100.00
//        Num People: 98, number of experiments with one or more shared birthday: 597908 percentage: 100.00
//        Num People: 99, number of experiments with one or more shared birthday: 609554 percentage: 100.00
//        Num People: 100, number of experiments with one or more shared birthday: 621453 percentage: 100.00











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
