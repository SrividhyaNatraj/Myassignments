package week1.day2asg;

public class Missingarray {

	public static void main(String[] args) {
		
			 
	        int[] arr1={1,2,3,4,7,6,8};//Here is the input
	        System.out.println("Missing number from array arr1: "+missingNumber(arr1));
	        
	 
	    }
	 
	    public static int missingNumber(int[] arr)
	    {
	        int n=arr.length+1;
	        int sum=n*(n+1)/2;
	        int restSum=0;
	        for (int i = 0; i < arr.length; i++)// loop through the array (start i from arr[0] till the length of the array)
	        {
	            restSum+=arr[i];
	        }
	        int missingNumber=sum-restSum;
	        return missingNumber;
	    }
	}
	 
		

