import java.io.IOException;
class MyTest{

	public static void throwExceptionMethod() throws MyException{throw new myException();}
	
	public static void tryCatchMethod(){
		try{throwExceptionMethod();}
		catch(MyException ex){System.out.println("exception is caught");}
	}

	public static void callAnotherMethod(){
		try{throwExceptionMethod();}
		catch(MyException ex){
		try{
		throw new IOException();
		}
		catch(IOException e){System.out.println("IO EX");}
		}
	}
	public static void main(String args[]) throws MyException{
		
		tryCatchMethod();
		callAnotherMethod();
		
		throwExceptionMethod();
		
		
		
	}
}