package se.lexicon.ReineMoberg;


import java.util.Arrays;
import java.util.Scanner;

public class App
{
    public static void main( String[] args )
    {

        //Exercise 1
        /*int numbers[] = new int[]{11,23,39,65};     //initialize array
        for (int number : numbers) {                //print whole array
            System.out.println(number);
        }*/


        //Exercise 2
        /*int numbers[] =new int[]{1,6,9,8,7,5,3,2,5,0};  //array to be checked
        int searchNumber = 5;                           //number to search for
        int indexFound;                                 //found or not
        indexFound = indexOf(searchNumber, numbers);    //call method
        if (indexFound == -1) {                         //if not found
            System.out.println("Number could not be found");
        }*/


        //Exercise 3
        /*String[] cities = new String[]{"Paris","London","New York","Stockholm"};
        System.out.println("Unsorted: " + Arrays.toString(cities));     //print array of strings
        Arrays.sort(cities, String.CASE_INSENSITIVE_ORDER);             //sort array
        System.out.println("Sorted: " + Arrays.toString(cities));       //print sorted array*/


        //Exercise 4
        /*int[] original = new int[]{1,15,20};
        int[] copy = Arrays.copyOf(original, original.length);          //create copy of array
        System.out.println("Original:" + Arrays.toString(original));    //print both arrays
        System.out.println("Copy: " + Arrays.toString(copy));*/


        //Exercise 5
        /*String[][] location = new String[2][2];
        Scanner userInput = new Scanner(System.in);
        for(int i=0; i< location.length; i++){          //put user input in 2-d array
            int j=0;
            System.out.println("Enter Country: ");
            location[i][j] = userInput.next();
            j++;
            System.out.println("Enter City: ");
            location[i][j] = userInput.next();
        }
        System.out.println("Sorry, you can't enter more.");     //can only enter two posts
        for(int i=0; i<location.length; i++){                   //print resulting array
            for(int j=0; j<location[i].length; j++){
                System.out.print(location[i][j] + " ");
            }
            System.out.println();                               //print on new line
        }*/


        //Exercise 6
        /*int[] numbers = new int[]{43,5,23,17,2,14};
        int sum =0;
        float averageResult = 0;
        for (int number : numbers) {
            sum += number;
        }
        averageResult = (float)sum / (float)numbers.length;
        System.out.println("Average result is: " + averageResult);*/


        //Exercise 7
        /*int[] numbers = new int[10];                        //array to hold ten numbers
        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter ten numbers");            //read ten inputs from user
        for(int i=0; i<numbers.length; i++) {
            System.out.println("Enter number " + (i+1) + ":");
            numbers[i] = userInput.nextInt();
        }
        System.out.println("Original numbers: " + Arrays.toString(numbers));    //print array as string
        System.out.println("Odd numbers: ");
        for (int number : numbers) {                    //print only odd numbers
            if ((number % 2) != 0) {
                System.out.print(number + " ");         //print as numbers
            }
        }
        System.out.println();*/


        //Exercise 8
        //(How do I delete element in array? How do I set int value to null?)
        /*int[] numbers = new int[]{20,20,40,20,30,40,50,60,50};
        int duplicateCounter = 0;
        System.out.println("This function can not handle 0 yet");
        System.out.println("Original numbers :" + Arrays.toString(numbers));
        for (int i=0; i< numbers.length-1; i++){            //Search from beginning
            for(int j=i+1; j< numbers.length; j++){         //of array and set
                if(numbers[i] == numbers[j]){               //duplicates to 0
                    numbers[j] = 0;
                }
            }
        }
        for(int number : numbers){                          //count numbers of 0 in array
            if(number == 0){
                duplicateCounter++;
            }
        }
        int[] noDuplicates = new int[numbers.length - duplicateCounter];    //create shorter array
        for (int i=0, j=0; i<numbers.length; i++){                          //copy values to new array
            if(numbers[i] != 0){
                noDuplicates[j] = numbers[i];
                j++;
            }
        }
        System.out.println("Without duplicates: " + Arrays.toString(noDuplicates));*/


        //Exercise 9
        /*int[] numbers = new int[]{3,58};
        numbers = addANumber(numbers, 5);         //call method to add a 5
        System.out.println(Arrays.toString(numbers));       //print new array*/


        //Exercise 10
        /*int[][] multiplicationTable = new int[][]{{1,2,3,4,5,6,7,8,9,10},{1,2,3,4,5,6,7,8,9,10}};
        for(int i=0; i< multiplicationTable[0].length; i++){            //length of a row
            for(int j=0; j< multiplicationTable[0].length; j++){        //multiply rows one at a time
                int result = multiplicationTable[0][i] * multiplicationTable[1][j];
                System.out.print(result + "\t");                        //print as matrix
            }
            System.out.println();
        }*/


        //Exercise 11
        /*Scanner userInput = new Scanner(System.in);
        int[] userNumbers = new int[7];                                     //size of array
        System.out.println("Enter " + userNumbers.length + " integers.");   //ask user for numbers
        for (int i = 0; i < userNumbers.length; i++) {
            System.out.println("Enter number " + (i + 1) + ":");
            userNumbers[i] = userInput.nextInt();
        }
        System.out.println("Your entered numbers: " + Arrays.toString(userNumbers));    //print array
        int i, temp, halfArray = userNumbers.length / 2;                    //reverse order in array
        for (i = 0; i < halfArray; i++) {
            temp = userNumbers[i];
            userNumbers[i] = userNumbers[(userNumbers.length - 1) - i];
            userNumbers[(userNumbers.length - 1) - i] = temp;
        }
        System.out.println("Your numbers reversed: " + Arrays.toString(userNumbers));   //print array*/


        //Exercise 12
        int[][] numbers=new int[][]{{1,2,3},{2,4,6},{3,6,9}};
            for(int i=0;i< numbers[0].length;i++){              //assumed square 2-d array
                System.out.print(numbers[i][i] + "\t");         //print diagonal numbers
            }
        System.out.println();                                   //print new line
        

    }



    //Exercise 2
    /*public static int indexOf(int number, int numbers[]) {
        int[] copy = Arrays.copyOf(numbers,numbers.length);     //array have to be sorted
        Arrays.sort(copy);                                      //for the binarySearch
        int indexNotFound = Arrays.binarySearch(copy, number);  //to work
        if (indexNotFound < 0){
            return -1;                                          //return -1 if not found
        }else{
            for(int i=0; i<numbers.length; i++) {               //search array for number
                if (numbers[i] == number) {                     //and where they are
                    System.out.println("Index position of number " + number + " is: " + i);
                }
            }
        }
        return 0;
    }*/


    //Exercise 9
    /*public static int[] addANumber(int[] originalArray, int addNumber){
        int[] newArray = Arrays.copyOf(originalArray, originalArray.length + 1); //copy array
        newArray[newArray.length - 1] = addNumber;                               //and add a post
        return newArray;
    }*/



}
