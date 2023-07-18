package week1.day2asg;

public class Palindrome {
	public static void main(String[] args)
	{
		{
		    int num=34343,t,s,rem;//Int num =34343
		    //Initialize a  temporary variable.
		    t=num;
		    for(s=0;num>0;num/=10)//Reverse the number (using for loop and )
		    {
		    rem=num%10;
		    s=(s*10)+rem;//add to the temporary variable
		    }
		   if(s==t)//Compare the temporary number with reversed number
			System.out.println(t+" is a palindrome number ");
	                  else
			System.out.println(t+" is not a palindrome number ");
	                  
		}
	}
}