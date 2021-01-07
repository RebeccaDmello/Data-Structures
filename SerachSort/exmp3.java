package SerachSort;
import java.util.Scanner;

abstract class Cell{
	String phno;
	double price;	
	Cell(String phno){
		this.phno = phno;
		price = 0.0;
	}	
	public void setPrice(double price) {
		this.price = price;
	}	
	public abstract String getPhno();
	public abstract double getPrice();
	public abstract void getData();
}

class Incoming extends Cell{
	Incoming(String phno){
		super(phno);	
		super.setPrice(0.02);
	}
	
	public String getPhno() {
		return phno;
	}
	
	public double getPrice() {
		return price;
	}
	
	public void getData() {
		System.out.println("Phone no is "+phno+" Price is "+price+" rate which is same as price "+price);
	}
}

class Outgoing extends Cell{
	double addMin;
	Outgoing(String phno, double addMin){
		super(phno);
		this.addMin = addMin;
		super.setPrice(0.04);
	}
	
	public String getPhno() {
		return phno;
	}
	public double getPrice() {
		return price;
	}
	public void getData() {
		double total = price * addMin;
		System.out.println("Phone number is "+phno+" rate is "+price+" minutes are "+addMin+" total price is "+total);
	}
	
}

class exmp3{
	public static void main(String args[]) throws MyExp {
		Cell[] c = new Cell[2];
		Scanner sc = new Scanner(System.in);
		for(int i = 0; i < c.length ; i++) {
			System.out.println("Incoming I or Outgoing O");
			String choice = sc.next();
			switch(choice) {
			case "I":
			case "i":
				System.out.println("Enter Phone Number");
				Incoming in = new Incoming(sc.next());
				c[i] = in;
				break;
			case "O":
			case "o":
					System.out.println("Enter Phone no");
					String phno = sc.next();
					System.out.println("Enter Call duration");
					double addMin = sc.nextDouble();
					Outgoing ou = new Outgoing(phno, addMin);
					c[i] = ou;
					break;
			}	
		}
		for(int j=0; j<c.length; j++) {
			c[j].getData();
		}
	}
}

class MyExp extends Exception{
	MyExp(String s){
		super(s);
	}
}
