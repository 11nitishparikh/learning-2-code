package learn;

import java.lang.annotation.ElementType;
import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

public class HackerEarth {
	
	/*static int val = 3;
	static int getvalue() {
		return val--;
	}

	public static void main(String[] args) {
		int n;
		for(int i=0;i<5;i++) {
			n = getvalue();
			assert n>2;
			System.out.println(" "+n);
		}
	}*/
	@Target({ElementType.TYPE_PARAMETER, ElementType.TYPE_USE})
	@interface MyAnnotation{
		
	}
	
	
	@Retention(RetentionPolicy.RUNTIME)
	@interface Hints{
		Hint[] value();
	}
	
	@Repeatable(Hints.class)
	@Retention(RetentionPolicy.RUNTIME)
	@interface Hint{
		String value();
	}
	
	@Hint("hint1")
	@Hint("hint2")
	class Person{
		
	}
	public static void main(String[] args) {
		Hint hint = Person.class.getAnnotation(Hint.class);
		System.out.println(hint);
		Hints hints1 = Person.class.getAnnotation(Hints.class);
		System.out.println(hints1.value().length);
		Hint[] hint2 = Person.class.getAnnotationsByType(Hint.class);
		System.out.println(hint2.length);
	}
}
