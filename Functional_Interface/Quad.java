import java.util.function.Consumer;
class Quad{
	public static void main(String args[]){
		if(args.length!=3)
			System.out.println("Invalid Paramters");
		else{
			double arr []=new double[3];
			arr[0]=Double.parseDouble(args[0]);
			arr[1]=Double.parseDouble(args[1]);
			arr[2]=Double.parseDouble(args[2]);
			//int res;
			Consumer<double []> myFunc =(t)->{
							double a=t[0];	
					 		double b=t[1];
							double c=t[2];
							double res=( (b*b)-(4*a*c) );
							double root1;
							double root2;
							double halfRoot;
						
							if(res>0){
								root1=( (-b + Math.sqrt(res) ) / (2*a) );
								root2=( (-b - Math.sqrt(res) ) / (2*a) );
								System.out.println(root1);
								System.out.println(root2);
							}
						
							else if(res<0){
								root1=Math.sqrt( res*-1 ) / (2*a);
								halfRoot= -b / (2*a);
								root2=Math.sqrt( res*-1 ) / (2*a);
								System.out.println(halfRoot+ "+" + root1+"i");
								System.out.println(halfRoot+"-"+root2+"i");
							}
							else if(res==0){
							root1= -b / (2*a);
							System.out.println(root1);
							}
						};

			myFunc.accept(arr);
		
	
	}
		
	}
}