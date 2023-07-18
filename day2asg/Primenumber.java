package week1.day2asg;

public class Primenumber {
	public static void main(String[] args) {
		int num = 13;// Declare an int Input and assign a value 13

	    boolean flag = false;// Declare a boolean variable flag as false
	    for (int i = 2; i <= num / 2; ++i) {// Iterate from 2 to half of the input
	      // condition for nonprime number
	    	// Divide the input with each for loop variable and check the remainder
	      if (num % i == 0) {
	        flag = true;// Set the flag as true when there is no remainder
	        break;// break the iterator
	      }
	    }

	    if (!flag)
	      System.out.println(num + " is a prime number.");// Print 'Prime' when the condition matches
	    else
	      System.out.println(num + " is not a prime number.");		// Print 'Not a Prime' when the condition doesn't match
	  }
	}



		
		

		

		

		

		

			

			

			

				
			


		

		

			

			

	 

  
