package Thread;

public class Account {
private int balance=0;
public void deposit(String message,int amount) { 
	int bal = getBalance();
	setBalance(bal+amount);
	System.out.println(message +"Now Balance is" + getBalance());
}


}
