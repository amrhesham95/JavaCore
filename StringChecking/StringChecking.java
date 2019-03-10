import java.util.function.*;
class StringChecking{
	
	
	public static void main(String args[]){
		Boolean boolIsAlpha = isAlpha("amr5",Character::isLetter);
		
		if(!boolIsAlpha) System.out.println("not all letters");
		else System.out.println("all letters");
	}
	
	public static Boolean isAlpha(String string1,Predicate<Character> predicate){
		int flag=0;
		char[] strToChar=string1.toCharArray();
		
		predicate=(x)-> Character.isLetter(x);
		
		for(int i=0;i<strToChar.length;i++){
			if(!predicate.test(strToChar[i])) flag=1;
			
		}
		
		if (flag ==0) return true;
		else return false;
	}
}

