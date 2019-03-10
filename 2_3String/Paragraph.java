import java.util.StringTokenizer;
class Paragraph{
	public static void main(String args[]){
		String strArray="test test this is a test";
		String word="test";
		int counter=0;
		String compareVar;
		int checker;
		StringTokenizer st = new StringTokenizer(strArray," ");
     		while (st.hasMoreTokens()) {
			compareVar=st.nextToken();
			checker=word.compareTo(compareVar);
         		if(checker==0)
				counter++;	
    		 }
	System.out.println("number of reps:"+counter);
     		
	}
}