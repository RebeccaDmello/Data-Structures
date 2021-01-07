package SerachSort;
interface Runner{
	public void run();
}

class Machine implements Runner{
	public void run(){
		System.out.println("Machine starts performing activity");
	}
}

class Athlete implements Runner{
	public void run() {
		System.out.println("Runs");
	}
}

class PoliticalCandidate implements Runner{
	public void run() {
		System.out.println("Votes");
	}
}

public class Inteerfaces {
	public static void main(String args[]) {
		Machine m = new Machine();
		m.run();
		Athlete a = new Athlete();
		a.run();
		PoliticalCandidate pc = new PoliticalCandidate();
		pc.run();
	}
}
