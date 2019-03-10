
package mydictionary;

import java.util.*;
import java.util.Map.Entry;

public class MyDictionary {

    public MyDictionary() {
    
        SortedSet<Word> aWords = new TreeSet<>();
        aWords.add(new Word("Apple","food","food bardo"));
        aWords.add(new Word("Army","group of ppl protect the country","military"));
        aWords.add(new Word("Almond","item of yameesh ramadan","ta3mo 7elw"));
        
        SortedSet<Word> bWords = new TreeSet<>();
        bWords.add(new Word("Banana","yellow fruit","Causes slipping"));
        bWords.add(new Word("Ball","rounded shape","i love it"));
        bWords.add(new Word("Bridge","a way to cross between two banks","kobry"));
        
        SortedSet<Word> cWords = new TreeSet<>();
        cWords.add(new Word("Cat","an animal","bt5rbsh"));
        cWords.add(new Word("Crew","working on a ship","mgmo3a"));
        cWords.add(new Word("Crown","queen item","shee2 byml3"));
        
        TreeMap<String,SortedSet<Word>> myDictionary = new TreeMap<>();
        myDictionary.put("A",aWords);
        myDictionary.put("B",bWords);
        myDictionary.put("C",cWords);
        
        printAll(myDictionary);
        
        printOnChar("A", myDictionary);
    }
    
    public static void printAll(TreeMap<String,SortedSet<Word>> argDictionary){
        argDictionary.forEach( (k, v) -> {System.out.println(k);
                                          v.forEach( (word) -> {
                                          word.myPrint(); 
                                          });
                             });
    }
    
    public static void printOnChar(String key,TreeMap<String,SortedSet<Word>> argDictionary){
        System.out.println("words of char "+ key);
        argDictionary.get(key).forEach(Word::myPrint);
    }
    
    public static void main(String[] args) {
        
        
        MyDictionary m=new MyDictionary();

    
    }
}
