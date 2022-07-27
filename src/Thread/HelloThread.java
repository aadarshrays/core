package Thread;

public class HelloThread extends Thread {
	private String name = null;
	 public  HelloThread(String threadName) {
		 name=threadName;
}
	@Override
	public void run() {
		for (int i = 0; i <50; i++) {
			System.out.println( i +"" +name);
			
		}
	}	
			
		
	 }
			
	
