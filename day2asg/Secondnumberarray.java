package week1.day2asg;

public class Secondnumberarray {
	public static void main(String[] args) {
	int[] x ={23,45,67,32,89,22};
	{ 
    int small=x[0];

for(int i=0;i<x.length;i++)
{
    if(x[i]<small)
    {
    small=x[i];
    }
}

int sec_Small=x[0];

for(int i=0;i<x.length;i++)
{
    if(x[i]<sec_Small && x[i]!=small)
    {
    sec_Small=x[i];
    }
}

    System.out.println("Second Smallest Number: "+sec_Small);
    }
}
}