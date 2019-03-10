class ParagraphStr{
	public static void main(String args[]){
		String strArray="test test this is a test";
		String word="test";
		int counter=0;
		String compareVar;
		int checker;
		String[] arrOfStr=strArray.split(" ");
     		
       		for (int i=0;i<arrOfStr.length;i++){ 
			compareVar=arrOfStr[i];
			checker=word.compareTo(compareVar);
         		if(checker==0)
				counter++;	
    		}
		System.out.println("number of reps:"+counter);
     		
	}
}