package learn;


class Hacker implements Runnable{
	
	public void run() {
		
		try {
			for(int i=0;i<2;i++) {
				Thread.sleep(1000);
				System.out.println(" "+Thread.currentThread().getName());
			}
		} catch(InterruptedException e) {
			System.out.println("Exception Occured "+e);
		}
	}
}


public class _HackerEarth1 {
	
	private static int $;

	public static void main(String[] args) throws InterruptedException {
		String h_e = null;
		System.out.print($);
		System.out.print(h_e);
		Hacker obj = new Hacker();
		Thread t = new Thread(obj,"Java");
		Thread t1 = new Thread(obj,"Php");
		
		t.start();
		t.join();
		t1.start();
	}

}
