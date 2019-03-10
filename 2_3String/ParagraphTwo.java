class ParagraphTwo{
	public static void main(String args[]){
		if(args.length<2)
			System.out.println("Invalid Paramters");
		else{
			String strArray=args[0];
			String word=args[1];
			int counter=0;
			int checker=strArray.indexOf(word);
     			while(checker != -1){
			
				strArray=strArray.substring( strArray.indexOf(word)+word.length() );
                        	checker=strArray.indexOf(word);
					counter++;	
    		 	}
	System.out.println("number of reps:"+counter);
     		
		}	
	}
}