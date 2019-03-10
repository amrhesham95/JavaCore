package mydictionary;

import java.util.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author AmrHesham
 */
public class Word implements Comparable<Word>{
    String word;
    List <String> meaningList=new ArrayList<>() ;
    
    public Word(String w,String s1,String s2){
        word=w;
        meaningList.add(s1);
        meaningList.add(s2);
    }
    
    public String getWord(){
        return word;
    }
    
    public List getMeaning(){
        return meaningList;
    }
    
    public void myPrint(){
        System.out.println(this.word);
        System.out.println(this.meaningList.get(0));
        System.out.println(this.meaningList.get(1));
        System.out.println("");
    }
    @Override
    public int compareTo(Word s){ 
        return word.compareTo(s.getWord());
    }
}
