package manipulatestring;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class solution {

    static HashMap<Character, Integer> counterLetters = new HashMap<Character, Integer>();

    public static void sortedByKey(){
        ArrayList<Character> sortedKeys = new ArrayList<Character>(counterLetters.keySet());

        Collections.sort(sortedKeys);
        for(Character x: sortedKeys)
            System.out.println(Character.toLowerCase(x)+" ="+counterLetters.get(x)); 
    }

    public static void main(String[] args){
        //Print string
        String hello = "Hello World!";

        System.out.println(hello);

        //Reverse string
        StringBuilder stringBuilder = new StringBuilder(hello);
        stringBuilder.reverse();

        System.out.println(stringBuilder.toString());

        //Replace world
        if(hello.toLowerCase().contains("world")){
            String result = hello.toLowerCase().replace("world", "Samuel");

            System.out.println(result);
        }

        //Count all letters
        for(int i=0;i<hello.length();i++){
            char c = hello.charAt(i);
            if(c!=' '){
                if(counterLetters.containsKey(c)){
                    counterLetters.put(c, counterLetters.get(c) + 1);
                }else{
                    counterLetters.put(c, 1);   
                }
            }
        }

        sortedByKey();

        //Remove all vocals
        String removedVocals = hello;

        removedVocals = removedVocals.replace("a", "");
        removedVocals = removedVocals.replace("e", "");
        removedVocals = removedVocals.replace("i", "");
        removedVocals = removedVocals.replace("o", "");
        removedVocals = removedVocals.replace("u", "");

        System.out.println(removedVocals);

        //Convert uppercase letters to lowercase and viceversa
        String conversion = "";

        for(char c: hello.toCharArray()){
            if(Character.isUpperCase(c)){
                conversion = conversion+ Character.toLowerCase(c);
            }else{
                conversion = conversion+ Character.toUpperCase(c);
            }
        }

        System.out.println(conversion);
    }

}
