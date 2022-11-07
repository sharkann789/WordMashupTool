package wordMashup;

import java.util.ArrayList;
import java.util.HashSet;

public class wordMashupTool{


    ArrayList<String> listOfNames;
    HashSet<String> combinations;
    private String strOne;
    private String strTwo;
    private int strOneLen;
    private int strTwoLen;
    private static int vowelList[] = {'a', 'e', 'i', 'o', 'u'};

    // only starts with two names...add more later.
    public wordMashupTool(String one, String two){
        this.strOne = one;
        this.strTwo = two;
        strOneLen = one.length();
        strTwoLen = two.length();
        combinations = new HashSet<String>();
    }

    public wordMashupTool(ArrayList<String> list){
        //refer to the original, so dynamic changing can be used.
        listOfNames = list;
    }

    // function to get flag of all things, put it in a list.
    // function to combine all possibilies of flags (even @ 0!)


    private String[] getBestNames(){
        return null;
    }


    // using the math to show off lmao
    // A "flag" is a substring of the string form the beginning.
    // need one for the end lol.
    private String[] getFlagBegin(String word){
        // find all possible name flag combinations
        int len = 0;
        for (int i = 0; i < word.length(); i++){
            len += i;
        }

        
        String[] out = new String[0];
        
        
        return out;
    }

    // 2,3,4...n combinations. where n is the length of listOfNames
    private void FindAllCombinationsAux(){



    }


    //For the combinations list
    private void FindAllCominationsList(){
        for (int i = 0; i < listOfNames.size(); i++){

        }
    }

    // all combinations for two names
    // very simple, the other alg is much harder.
    private boolean FindCombsTwoNames(){
        //check if variable length > 1
        if (strOneLen <= 0 || strTwoLen <= 0){
            return false;
        }
        //variables to keep track of word.
        String newName;
        String firstnc;
        String secnc;
        // outer loop
        for (int i = 1; i < strOneLen; i++){
            newName = strOne.substring(0,i);
            
            // inner loop
            for (int j = 1; j < strTwoLen; j++){
                firstnc = newName + strTwo.substring(0,j);
                secnc = newName + strTwo.substring(j, strTwoLen);
                combinations.add(firstnc);
                combinations.add(secnc);
            }
        }
        //start with 2nd word
        for (int i = 1; i < strTwoLen; i++){
            newName = strTwo.substring(0,i);
            // innter loop
            for (int j = 1; j < strOneLen; j++){
                firstnc = newName + strOne.substring(0,j);
                secnc = newName + strOne.substring(j, strOneLen);
                combinations.add(firstnc);
                combinations.add(secnc);
            }
        }
        return true;
    }


    //return all names from combtwo names lol
    public HashSet<String> getAllNames(){
        FindCombsTwoNames();
        return combinations;
    }
}