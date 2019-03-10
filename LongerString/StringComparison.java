import java.util.function.*;

class StringComparison{
	public static String getLongerString(String string1,String string2,BiPredicate <String,String> predicate ){
		if(predicate.test(string1,string2)) return string1; 
		else return string2;
	}
	
	public static void main (String args[]){
		String name1=new String("Amr");
		String name2=new String("Ahmed");
		String longerString = getLongerString(name1,name2,(s1,s2) -> s1.length() > s2.length());
		System.out.println("The longer name is:"+longerString);
	}
}