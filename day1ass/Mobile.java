package week1.day1ass;
//Create package name as week1.day1 under src/main/java
public class Mobile {
// Create a  new class as "Mobile" under week1.day1	
	public void makeCall() {
// Create 2 methods (makeCall() , sendMsg()) with simple print statement
		System.out.println("Make Call");
	}
	
 void sendMsg() {
	System.out.println("Send Msg");
}

public void Mobilemodel(String name,float weight) {
	// In first method create variable  mobileModel (String),mobileWeight (float)
	
	System.out.println(name+"\n"+weight);
}
	public void Fullycharged(boolean fullycharged,int cost) {
		// In second method create variable  isFullCharged (boolean),mobileCost (int)
		System.out.println(fullycharged+"\n"+cost);
	}


	public static void main(String[] args) {
		//Create main method
		Mobile m=new Mobile();//Create object for class 
		System.out.println("This is my mobile");// print a statement---->"This is my mobile";
		m.makeCall();//and call  from main method and print them
		m.sendMsg();
		m.Mobilemodel("Redmi",90.2f);
		m.Fullycharged(true, 15000);
}
}







