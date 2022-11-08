package wordMashup;

import java.util.ArrayList;
import java.util.HashSet;


/*
 * WordMashupTool
 * NOTE! This is a work in progress, so it is pretty messy.
 * Takes 2+ words and combines them in various ways
 * Useful for creating usernames.
 */

public class wordMashupTool{

    //one thread per word?
    ArrayList<String> listOfNames;
    HashSet<String> combinations;
    private String strOne;
    private String strTwo;
    private int strOneLen;
    private int strTwoLen;

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


    // A "flag" is a substring of the string form the beginning.
    // need one for the end lol.
    private String[] getFlagBegin(String word){
        // arrays are faster, so we use them here
        // total amount of possibilites is just the length of the string + 1
        String[] out = new String[word.length()];
        int idx = 0;
        
        for (int i = 0; i < word.length(); i++){
            out[i] = word.substring(0, i);
        }
        return out;
    }

    //same thing for end.
    private String[] getFlagEnd(String word){
        // arrays are faster, so we use them here
        // total amount of possibilites is just the length of the string + 1
        String[] out = new String[word.length()];
        int idx = 0;
        

        for (int i = word.length() - 1; i >= 0; i--){
            String temp = word.substring(i, word.length());
            out[i] = temp;
        }
        return out;
    }

    private HashSet<String> AllCombs(String init, String[] rest){
        HashSet<String> out = new HashSet<String>();

        //create arrays of end and start for other words
        //only start for init.
        //loop through array of arrays of other words
        //do init + word + word + ... word (n) in other words, return in the end?
        //n is size of largest array?

        // new init -> add to colleciton
        // combine with largeset first
        // no..tree would be good here right?
        // split by options, in the end, get all possibilities lol
        // ^^ worth!
        // root split is init.




        String[] preInit = getFlagBegin(init);
        String[][] multList = new String[0][0];



        for (int i = 0; i < rest.length; i++){

        }
        



        for (int i = 0; i < preInit.length; i++){

        }



        return null;
    }


    // 2 words.
    private HashSet<String> FindAllCombsTwo(String init, String back){
        HashSet<String> out = new HashSet<String>();
        String newName;
        String firstnc;
        String secnc;
        int initLen = init.length();
        int backLen = back.length();

        // outer loop, first word
        for (int i = 1; i < initLen; i++){
            newName = init.substring(0,i);
            
            // inner loop
            for (int j = 1; j < backLen; j++){
                firstnc = newName + back.substring(0,j);
                secnc = newName + back.substring(j, backLen);
                combinations.add(firstnc);
                combinations.add(secnc);
            }
        }
        //start with 2nd word
        for (int i = 1; i < backLen; i++){
            newName = back.substring(0,i);
            // inner loop
            for (int j = 1; j < initLen; j++){
                firstnc = newName + init.substring(0,j);
                secnc = newName + init.substring(j, initLen);
                combinations.add(firstnc);
                combinations.add(secnc);
            }
        }  
        return out;
    }


    //For the combinations list
    private void FindAllCominationsList(){
        // run find all combinations aux for all the words
        
        for (int i = 0; i < listOfNames.size(); i++){

        }
    }

    //return all combinations from 2 words
    public HashSet<String> getAllNames(){
        
        combinations.addAll(FindAllCombsTwo(strOne, strTwo));

        
        getFlagEnd(strOne);

        return null;
    }

    //return all combinations from 2+ words
    public HashSet<String> getAllNamesPlus(){
        FindAllCombsTwo(strOne, strTwo);
        return combinations;
    }


    //simple testing 
    public void TestAll(){

    }
}