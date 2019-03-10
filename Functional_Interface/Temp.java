package TempPack;
import java.util.function.Function;

class Temp{
	public static void main(String args[]){
		if(args.length!=1)
			System.out.println("Invalid paramaters");
		
		else{
			Function<Double,Double> myFunc = (c)->c*1.80+32.0;
			String input=new String(args[0]);
			Double c=new Double(0);
			c=Double.parseDouble(input);
			Double d=new Double(myFunc.apply(c));
			System.out.println(d);
		}
	}
	
}