package com.company;

public class Main {

    /*
    * Allen Higgins
    * 09/June/2018
    *
    * Part 1:
    * Check if a word is a palindrome
    * Note: A palindrome word is not the same as a palindrome sentence
    *
    * Part 2:
    * Count how may digits of a number divide into that number with remainder of zero
    *
    * Part 3:
    * Swap two int values, one using a temp and another without using a temp
    * */
    public static void main(String[] args) {
        /*
        * Part 1:
        * */
        String word = "Rotator";
        /*
        *  Case sensitive
        *   --> My choice is to treat an uppercase char the same as a lowercase char for a palindrome
        * */
        word = word.toLowerCase();
        /*
        * Get the end char index
        * */
        int indexFromEnd = word.length()-1;
        /*
        *  Search from beginning char comparing each with the corresponding end char
        *  if chars are the same then take one away from end position (moving backwards) and compare again
        *       if over have way through the length of the word then the word must be a palindrome
        *           no need to compare any more chars as they all have been compared at this point
        *  else char has not matched and the word cannot be a palindrome
        * */
        for (int i = 0; i <= word.length()-1; i++){

            if(word.charAt(i) == word.charAt(indexFromEnd)){
                indexFromEnd--;
                if(indexFromEnd < i){
                    System.out.print("Is a palindrome");
                    break;
                }
            }else{
                System.out.print("Not a palindrome");
                break;
            }
        }

        /////////////////////////////////////////////////////////////////////////////////////////////////////////
        System.out.println();
        /////////////////////////////////////////////////////////////////////////////////////////////////////////

        /*
        * Part 2:
        * Count how may digits of a number divide into that number with remainder of zero
        *   --> convert number to string
        *   --> loop through the string
        *           --> for each char get its int value
        *           --> if the number mod the current digit equals zero count it
        * */
        int n = 453000312, count = 0, num = 0;
        String numStr = Integer.toString(n);

        for(int i = 0; i <= numStr.length()-1;i++){
            num = Integer.parseInt(String.valueOf(numStr.charAt(i)));
            try{
                if( n % num == 0){
                    count++;
                }
            }catch (ArithmeticException e){
                // Divide by zero error
                System.out.println("Exception Handled -->> " + e);
            }
        }
        System.out.println("The divide count of " + n + " by it's singal digits is: " + count);

        /////////////////////////////////////////////////////////////////////////////////////////////////////////
        System.out.println();
        /////////////////////////////////////////////////////////////////////////////////////////////////////////

        /*
        * Part 3:
        * Swap two int values, one using a temp and another without using a temp
        * */
        int a = 5, b = 6;
        swapWithtemp(a,b);
        swapWithoutTemp(a,b);
    }
    /*
    * Part 3
    * swapWithtemp(int a, int b)
    *    --> Using a temp var
    * */
    public static void swapWithtemp(int a, int b){
        printValBeforeSwap(a, b);
        int temp = 0;
        temp = a;
        a = b;
        b = temp;
        printValAfterSwap(a,b);
    }
    /*
    * Part 3
    * swapWithoutTemp(int a, int b)
    *    --> Using no temp var
    * */
    public static void swapWithoutTemp(int a, int b){
        printValBeforeSwap(a, b);
        a = a+b;
        b = a-b;
        a = a-b;
        printValAfterSwap(a,b);
    }
    /*
    * Part 3
    * Print statements of values before swap
    * */
    public static void printValBeforeSwap(int a, int b){
        System.out.println("(a) was: " + a + " and (b) was:" + b);
    }
    /*
     * Part 3
     * Print statements of values after swap
     * */
    public static void printValAfterSwap(int a, int b){
        System.out.println( "(a) is now: " + a + " and (b) is now: " + b + " after swapping");
    }



}
