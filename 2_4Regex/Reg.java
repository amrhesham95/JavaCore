import java.util.regex.*;
class Reg{
	public static void main (String args[]){
		int counter=0;
		if(args.length<2)
			System.out.println("Invalid Paramters");
		else{
			String paragraph=args[0];
			String word=args[1];
			Pattern p=Pattern.compile(word);
			Matcher m=p.matcher(paragraph);
			while(m.find()){
				counter++;
			}
		System.out.println("number of reps:"+counter);
		}
	}
}