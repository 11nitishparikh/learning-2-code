package learn;

//A simple Java program to demonstrate the use of reflection 
import java.lang.reflect.Method; 
import java.lang.reflect.Field; 
import java.lang.reflect.Constructor; 

class Test 
{ 
	private String s; 
	public Test() { s = "GeeksforGeeks"; } 
	public void method1() { 
		System.out.println("The string is " + s); 
	} 
} 

class ReflectionExp 
{ 
	public static void main(String args[]) throws Exception 
	{ 
		Test obj = new Test(); 
		Class cls = obj.getClass(); 
		System.out.println("The name of class is " + cls.getName()); 
		Constructor constructor = cls.getConstructor(); 
		System.out.println("The name of constructor is " + 
							constructor.getName()); 
		System.out.println("The public methods of class are : "); 
		Method[] methods = cls.getMethods(); 
		for (Method method:methods) 
			System.out.println(method.getName()); 
		Field field = cls.getDeclaredField("s"); 
		field.setAccessible(true); 
		field.set(obj, "JAVA"); 
		Method methodcall2 = cls.getDeclaredMethod("method1"); 
		methodcall2.invoke(obj); 
		} 
} 
