import java.lang.annotation.*; // e7tmal ytl3 error hena
import java.lang.reflect.*;


@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE,ElementType.METHOD,ElementType.FIELD,ElementType.CONSTRUCTOR})
@interface Author{
	String str();
}


@Author(str="Amr_class")
class AnnoMain{
	@Author(str="Amr_con")
	AnnoMain(){};
	@Author(str="Amr_field")
	public int dummy=0;
	@Author(str="Amr_method")
	public static void myMeth() throws NoSuchFieldException,NoSuchMethodException{
		
		
		AnnoMain ob =new AnnoMain();
		
		Class c = ob.getClass();
		Author classAnno=(Author)c.getAnnotation(Author.class); // leh msht8lsh mn gher casting ?
		
		Method m = c.getMethod("myMeth");
		
		Author methodAnno =m.getAnnotation(Author.class);
		
		Field f = c.getDeclaredField("dummy");
		Author fieldAnno=f.getAnnotation(Author.class);

		Constructor Con = c.getDeclaredConstructor();

		Author conAnno =(Author) Con.getAnnotation(Author.class);
		

		System.out.println(classAnno.str()+" "+methodAnno.str()+ " " + fieldAnno.str()+" "+conAnno.str());
		
		
		
		
		
		
	}
	
	
	public static void main(String args[]) throws NoSuchFieldException,NoSuchMethodException{
		
		
		myMeth();
	
		
		
	}
}

