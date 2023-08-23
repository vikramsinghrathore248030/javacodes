import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.Serializable;

class Customer implements Serializable {
	int cust_id;
	String name;
	int accno;
	String pwd;
	int balance;

	public Customer(int cust_id, String name, int accno, String pwd, int balance) {
		super();
		this.cust_id = cust_id;
		this.name = name;
		this.accno = accno;
		this.pwd = pwd;
		this.balance = balance;
	}

	void display() {
		System.out.println(cust_id);
		System.out.println(name);
		System.out.println(accno);
		System.out.println(pwd);
		System.out.println(balance);
	}

}

public class Launch2 {
	public static void main(String[] args) throws Exception {
		//Customer c = new Customer(1, "sai",123,"pallu@143", 70000);
		String path = "D:\\FileProgs\\customer.text";
		FileInputStream fis = new FileInputStream(path);
		ObjectInputStream ois = new ObjectInputStream(fis);
		//Customer c1 = new Customer(0, path, 0, path, 0);
		Customer c = new Customer(ois.readObject());
		c.display();
	}

}