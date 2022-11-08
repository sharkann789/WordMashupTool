import wordMashup.wordMashupTool;

//apparently the outer wordMashup is the default package...???
//dunno how that happened, but hey, it works.

// Run command (must be in default package): javac wordMashup/wordMashupTool.java Test.java

public class Test {
    //make a bunch of random shit and run it on this!
    public static void main(String[] args){
	    wordMashupTool test = new wordMashupTool("lamborghini","ferrari");
        System.out.println(test.getAllNames());
    }
}