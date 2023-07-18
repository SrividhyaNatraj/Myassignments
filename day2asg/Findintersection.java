package week1.day2asg;

public class Findintersection {
	 public static void main(String args[]) {
	      int myArray1[] = {3,2,11,4,6,7};//Declare An array for {3,2,11,4,6,7};
	      int myArray2[] = {1,2,8,4,9,7};//Declare another array for {1,2,8,4,9,7};
	      System.out.println("Intersection of the two arrays ::");
	     
	      for(int i = 0; i<myArray1.length; i++ )// Declare for loop iterator from 0 to array length
	      {
	         for(int j = 0; j<myArray2.length; j++) //Declare a nested for another array from 0 to array length
	            {
	        	 if(myArray1[i]==myArray2[j])//Compare Both the arrays using a condition statement 
	            {
	               System.out.println(myArray2[j]);
	            }
	         }
	      }
	   }
	}

