package Thread;

public class TestThread {
	public static void main(String[] args) {
		HelloThread t1 = new HelloThread("virat");
		HelloThread t2 = new HelloThread("Dhoni");
		t1.start();
		t2.start();
		for (int i = 0; i <50; i++) {
			System.out.println( i+ "Raina ");
			
		}
	}

}
