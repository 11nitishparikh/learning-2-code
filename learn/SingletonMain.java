package learn;

class Singleton {
	
	private static Singleton single_instance = null;
	
	public String str = "";
	
	Singleton(){
		str = "Hello!!!";
	}
	
	public static Singleton getInstance() {
		if(single_instance == null) {
			single_instance = new Singleton(); 
		}
		return single_instance;
	}
}

class SingletonMain {
	
	public static void main(String[] args) {
		
		Singleton x = Singleton.getInstance();
		x.str = x.str.toUpperCase();
		System.out.println("String from x is " + x.str); 
	}
}
