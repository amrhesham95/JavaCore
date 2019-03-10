import java.lang.annotation.*; // e7tmal ytl3 error hena
import java.lang.reflect.*;


@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE,ElementType.METHOD,ElementType.FIELD})
@interface Author{
	String str();
}