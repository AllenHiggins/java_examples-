package com.company;

public class Main {

    /*
    * Allen Higgins
    * 09/June/2018
    * Small programme to check if a word is a palindrome
    * Note: A palindrome word is not the same as a palindrome sentence 
    * */
    public static void main(String[] args) {

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

    }
}
