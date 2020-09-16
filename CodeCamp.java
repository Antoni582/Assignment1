//  CodeCamp.java - CS314 Assignment 1

/*  Student information for assignment:
 * 
 *  replace <NAME> with your name.
 *
 *  On my honor, <NAME>, this programming assignment is my own work
 *  and I have not provided this code to any other student.
 *
 *  Name:
 *  email address:
 *  UTEID:
 *  Section 5 digit ID: 
 *  Grader name:
 *  Number of slip days used on this assignment:
 */

import java.util.Random;

public class CodeCamp {

    /**
     * Determine the Hamming distance between two arrays of ints. 
     * Neither the parameter <tt>aData</tt> or
     * <tt>bData</tt> are altered as a result of this method.<br>
     * @param aData != null, aData.length == aData.length
     * @param bData != null
     * @return the Hamming Distance between the two arrays of ints.
     */    
    public static int hammingDistance(int[] aData, int[] bData) {
        // check preconditions
        if (aData == null || bData == null || aData.length != bData.length) { 
            throw new IllegalArgumentException("Violation of precondition: " +
                    "hammingDistance. neither parameter may equal null, arrays" +
                    " must be equal length.");
        }

        //Creating variable for hamming distance
        int hammingDist = 0;

        //Checking hamming distance
        for (int i = 0; i < aData.length; i++){
            if (aData[i] != bData[i])
                hammingDist += 1;
        }



        /* CS314 STUDENTS: INSERT YOUR CODE HERE AND DELETE THIS COMMENT.*/

        return hammingDist;
    }


    /**
     * Determine if one array of ints is a permutation of another.
     * Neither the parameter <tt>aData</tt> or 
     * the parameter <tt>bData</tt> are altered as a result of this method.<br>
     * @param aData != null
     * @param bData != null
     * @return <tt>true</tt> if aData is a permutation of bData, 
     * <tt>false</tt> otherwise
     * 
     */
    public static boolean isPermutation(int[] aData, int[] bData) {
        // check preconditions
        if (aData == null || bData == null) {
            throw new IllegalArgumentException("Violation of precondition: " +
                    "isPermutation. neither parameter may equal null.");
        }
        // checking if the length of the first array matches the second.
        if (aData.length != bData.length)
            return false;
        else {
            int indexNum = bData.length;
            //Creating a copy of both arrays

            int[] copyBData = new int[indexNum];
            int[] copyAData = new int[indexNum];
            for (int i = 0; i < indexNum; i++){
                copyBData[i] = bData[i];
                copyAData[i] = aData[i];
            }

            //Sorting both arrays

            for(int i = 0; i < indexNum; i++){
                for (int j = 0; j < indexNum - i - 1; j++){
                    if (copyBData[j] < copyBData[j+1]){
                        int temp = copyBData[j];
                        copyBData[j] = copyBData[j+1];
                        copyBData[j+1] = temp;
                    }
                }
            }
            for(int i = 0; i < indexNum; i++){
                for (int j = 0; j < indexNum - i - 1; j++){
                    if (copyAData[j] < copyAData[j+1]){
                        int temp = copyAData[j];
                        copyAData[j] = copyAData[j+1];
                        copyAData[j+1] = temp;
                    }
                }
            }

            //Comparing both arrays

            for (int i = 0; i < indexNum; i++){
                if (copyAData[i] != copyBData[i])
                    return false;
            }




        }


        /* CS314 STUDENTS: INSERT YOUR CODE HERE AND DELETE THIS COMMENT.*/        

        return true;
    }


    /**
     * Determine the index of the String that 
     * has the largest number of vowels. 
     * Vowels are defined as <tt>'A', 'a', 'E', 'e', 'I', 'i', 'O', 'o', 
     * 'U', and 'u'</tt>.
     * The parameter <tt>arrayOfStrings</tt> is not altered as a result of this method.
     * <p>pre: <tt>arrayOfStrings != null</tt>, <tt>arrayOfStrings.length > 0</tt>, 
     * there is an least 1 non null element in arrayOfStrings.
     * <p>post: return the index of the non-null element in arrayOfStrings that has the 
     * largest number of characters that are vowels.
     * If there is a tie return the index closest to zero. 
     * The empty String, "", has zero vowels.
     * It is possible for the maximum number of vowels to be 0.<br>
     * @param arrayOfStrings the array to check
     * @return the index of the non-null element in arrayOfStrings that has 
     * the largest number of vowels.
     */
    public static int mostVowels(String[] arrayOfStrings) {
        // check preconditions
        if (arrayOfStrings == null || arrayOfStrings.length == 0 || !atLeastOneNonNull(arrayOfStrings)) { 
            throw new IllegalArgumentException("Violation of precondition: " +
                    "mostVowels. parameter may not equal null and must contain " +
                    "at least one none null value.");
        }

        //Creating an array of integers to keep track of the vowel count in each index of the array of strings
        int[] vowelCount = new int[arrayOfStrings.length];

        //Creating int variable that will store the index of the array with most vowels.

        int mostVowelsIndex = 0;

        //

        String testString;
        for (int i = 0; i < arrayOfStrings.length; i++){

            if (arrayOfStrings[i] == null) {
                vowelCount[i] = -1;
            }
            else{
                testString = arrayOfStrings[i];
                char[] charArray = testString.toCharArray();
                for (char j = 0; j < charArray.length; j++){
                    if (charArray[j] == 'A' || charArray[j] == 'a' || charArray[j] == 'E' || charArray[j] == 'e' || charArray[j] == 'I'
                            || charArray[j] == 'i' || charArray[j] == 'O' || charArray[j] == 'o' || charArray[j] == 'U' || charArray[j] == 'u')
                        vowelCount[i] += 1;
                }
            }

        }

        //Creating variable to keep track of the highest number
        int highestNum = vowelCount[0];

        //Comparing the highest number with the number of i index and storing the index in mostVowelsIndex
        for (int i = 0; i < vowelCount.length; i++){
            if ( highestNum < vowelCount[i]){
                highestNum = vowelCount[i];
                mostVowelsIndex = i;
            }
        }

        /* CS314 STUDENTS: INSERT YOUR CODE HERE AND DELETE THIS COMMENT.*/
        //  You can use all methods from the String class and native arrays.

        return mostVowelsIndex;
    }



    /**
     * Perform an experiment simulating the birthday problem.
     * Pick random birthdays for the given number of people. 
     * Return the number of pairs of people that share the
     * same birthday.<br>
     * @param numPeople The number of people in the experiment.
     * This value must be > 0
     * @param numDaysInYear The number of days in the year for this experiement.
     * This value must be > 0
     * @return The number of pairs of people that share a birthday 
     * after running the simulation.
     */
    public static int sharedBirthdays(int numPeople, int numDaysInYear) {
        // check preconditions
        if (numPeople <= 0 || numDaysInYear <= 0) {
            throw new IllegalArgumentException("Violation of precondition: " +
                    "sharedBirthdays. both parameters must be greater than 0. " +
                    "numPeople: " + numPeople + 
                    ", numDaysInYear: " + numDaysInYear);
        }


        //Assigning birthday to each person.
        Random rand = new Random();
        int[] people = new int[numPeople];
        for (int i = 0; i < numPeople; i++){
            people[i] = 1 + rand.nextInt(numDaysInYear);
        }

        //Sorting the people by their birthday
/*
        for (int i = 0; i < people.length; i++){
            for (int j = 0; j < people.length - i - 1; j++){
                if (people[j] > people[j+1]){
                    int temp = people[j];
                    people[j] = people[j+1];
                    people[j+1] = temp;
                }
            }
        }
*/
        //
        int sameBirthday = 0;
        for (int i = 0; i < people.length; i++){
            if (people[0] == people[i]){
                sameBirthday++;
            }
        }
        //

        sameBirthday = (sameBirthday*(sameBirthday - 1)) / 2;

        /* CS314 STUDENTS: INSERT YOUR CODE HERE AND DELETE THIS COMMENT.*/

        return sameBirthday;
    }


    /**
     * Determine if the chess board represented by board is a safe set up.
     * <p>pre: board != null, board.length > 0, board is a square matrix.
     * (In other words all rows in board have board.length columns.),
     * all elements of board == 'q' or '.'. 'q's represent queens, '.'s
     * represent open spaces.<br>
     * <p>post: return true if the configuration of board is safe,
     * that is no queen can attack any other queen on the board.
     * false otherwise.
     * the parameter <tt>board</tt> is not altered as a result of 
     * this method.<br>
     * @param board the chessboard
     * @return true if the configuration of board is safe,
     * that is no queen can attack any other queen on the board.
     * false otherwise.
     */
    public static boolean queensAreSafe(char[][] board) {
        char[] validChars = {'q', '.'};
        // check preconditions
        if (board == null || board.length == 0 || !isSquare(board) 
                || !onlyContains(board, validChars)) {
            throw new IllegalArgumentException("Violation of precondition: " +
                    "queensAreSafe. The board may not be null, must be square, " +
                    "and may only contain 'q's and '.'s");        
        }



        for(int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j] == 'q') {
                    for (int x = j + 1; x < board.length; x++) {
                        if (board[i][x] == 'q') {
                            return false;
                        }
                    }
                    for (int y = i + 1; y < board.length; y++) {
                        if (board[y][j] == 'q') {
                            return false;
                        }
                    }
                    if (j >= i) {
                        int q = i + 1;
                        for (int k = j + 1; k <= board.length - 1; k++) {
                            if (board[q][k] == 'q') {
                                return false;
                            } else {
                                q++;
                            }
                        }

                    }
                    if (j < i) {
                        int q = j + 1;
                        for (int k = i + 1; k < board.length; k++) {
                            if (board[k][q] == 'q') {
                                return false;
                            } else {
                                q++;
                            }
                        }
                    }

                    if (i + j <= (board.length - 1)) {
                        int x = i + 1;
                        int y = j - 1;
                        for (int k = i; k < i + j; k++) {
                            if (board[x][y] == 'q') {
                                return false;
                            } else {
                                x++;
                                y--;
                            }
                        }
                    }

                    //camparing the queen with
                    if (i + j > (board.length - 1)) {
                        int x = i + 1;
                        int y = j - 1;
                        for (int k = i; k < board.length - 1; k++) {
                            if (board[x][y] == 'q') {
                                return false;
                            } else {
                                x++;
                                y--;
                            }
                        }
                    }
                }
            }
        }

        return true;
}


    /**
     * Given a 2D array of ints return the value of the
     * most valuable contiguous sub rectangle in the 2D array.
     * The sub rectangle must be at least 1 by 1. 
     * <p>pre: <tt>mat != null, mat.length > 0, mat[0].length > 0,
     * mat</tt> is a rectangular matrix.
     * <p>post: return the value of the most valuable contiguous sub rectangle
     * in <tt>city</tt>.<br>
     * @param city The 2D array of ints representing the value of
     * each block in a portion of a city.
     * @return return the value of the most valuable contiguous sub rectangle
     * in <tt>city</tt>.
     */
    public static int getValueOfMostValuablePlot(int[][] city) {
        // check preconditions
        if (city == null || city.length == 0 || city[0].length == 0 
                || !isRectangular(city) ) {
            throw new IllegalArgumentException("Violation of precondition: " +
                    "getValueOfMostValuablePlot. The parameter may not be null," +
                    " must value at least one row and at least" +
                    " one column, and must be rectangular."); 
        }

        int rows = city.length;
        int cols = city[0].length;
        int currentSum = 0;
        int maxSum = -1000000;


        for (int r = 0; r < rows; r++){
            for(int c = 0; c < cols; c++){


                //bottom corner
                int r2 = 0;
                int c2 = 0;
                while(r2 < rows) {
                    currentSum = 0;
                    for (int k = r; k <= r2; k++) {
                        for (int x = c; x <= c2; x++) {
//                            System.out.println("current index int: " + city[k][x]);
                            currentSum = currentSum + city[k][x];
                            }
                        }


                    if(currentSum > maxSum && currentSum != 0){
                        maxSum = currentSum;
                    }



//                    System.out.println("currentsum in loop: " + currentSum);
//                    System.out.println("current max in loop: " + maxSum);
//                    System.out.println("-------------------------------------------------\n");
                    c2++;
                    if (c2 == cols){
                        r2++;
                        c2 = 0;


                    }
                }
            }
        }
        return maxSum;
    }


    // !!!!! ***** !!!!! ***** !!!!! ****** !!!!! ****** !!!!! ****** !!!!!!
    // CS314 STUDENTS: Put your birthday problem experiment code here:


    /* 
     * pre: arrayOfStrings != null
     * post: return true if at least one element in arrayOfStrings is 
     * not null, otherwise return false. 
     */
    private static boolean atLeastOneNonNull(String[] arrayOfStrings) {
        // check precondition
        if (arrayOfStrings == null) {
            throw new IllegalArgumentException("Violation of precondition: " +
                    "atLeastOneNonNull. parameter may not equal null.");
        }
        boolean foundNonNull = false;
        int i = 0;
        while( !foundNonNull && i < arrayOfStrings.length ) {
            foundNonNull = arrayOfStrings[i] != null;
            i++;
        }
        return foundNonNull;
    }


    /* 
     * pre: mat != null
     * post: return true if mat is a square matrix, false otherwise
     */
    private static boolean isSquare(char[][] mat) {
        if (mat == null) {
            throw new IllegalArgumentException("Violation of precondition: " +
                    "isSquare. Parameter may not be null.");
        }
        final int numRows = mat.length;
        int row = 0;
        boolean isSquare = true;
        while (isSquare && row < numRows) {
            isSquare = ( mat[row] != null) && (mat[row].length == numRows);
            row++;
        }
        return isSquare;
    }


    /* 
     * pre: mat != null, valid != null
     * post: return true if all elements in mat are one of the 
     * characters in valid
     */
    private static boolean onlyContains(char[][] mat, char[] valid) {
        // check preconditions
        if (mat == null || valid == null) {
            throw new IllegalArgumentException("Violation of precondition: " +
                    "onlyContains. Parameters may not be null.");
        }
        String validChars = new String(valid);
        int row = 0;
        boolean onlyContainsValidChars = true;
        while (onlyContainsValidChars && row < mat.length) {
            int col = 0;
            while(onlyContainsValidChars && col < mat[row].length) {
                int indexOfChar = validChars.indexOf(mat[row][col]);
                onlyContainsValidChars = indexOfChar != -1;
                col++;
            }
            row++;
        }
        return onlyContainsValidChars;
    }


    /*
     * pre: mat != null, mat.length > 0
     * post: return true if mat is rectangular
     */
    private static boolean isRectangular(int[][] mat) {
        // check preconditions
        if (mat == null || mat.length == 0) {
            throw new IllegalArgumentException("Violation of precondition: " +
                    "isRectangular. Parameter may not be null and must contain" +
                    " at least one row.");
        }
        boolean correct = mat[0] != null;
        int row = 0;
        while(correct && row < mat.length) {
            correct = (mat[row] != null) 
                    && (mat[row].length == mat[0].length);
            row++;
        }
        return correct;
    }

    // make constructor private so no instances of CodeCamp can not be created
    private CodeCamp() {

    }
}