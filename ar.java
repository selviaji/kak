import java.util.Scanner;

public class Array {
	public static void main(String[] args){
		  int n;int b=0;
	    Scanner s = new Scanner(System.in);
	    System.out.print("Enter no. of elements you want in array:");
	    n = s.nextInt();
	    int a[] = new int[n];
	    System.out.println("Enter all the elements:");
	    for(int i = 0; i < n; i++)
	    {
	        a[i] = s.nextInt();
	    }
	    for(int j=0;j<n;j++)
	    {
	    	for(int k=0;k<n;k++)
	    	{
	    		if(j!=k)
	    	{
	    			if(a[j]==a[k])
	    			{
	    				b=1;
	    				break;
	    			}
	    			}}
	    	if(b==1)
	    	{
	    		System.out.println("first element repeated is:"+a[j]);
	    		break;
	    	}
	    }} }      

