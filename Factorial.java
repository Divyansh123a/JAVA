import java.util.Scanner;


public class Factorial {
    public int fact(int num)
    {
        if(num==1||num ==0)
        {
            return 1;
        }
        else
        {
         return num*fact(num-1);
        }
    }

	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		// Fill the code
		System.out.println("Enter the size of an array:");
		boolean flag =false;
		int n = sc.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter the elements:");
		Factorial f = new Factorial();
		
		for (int i = 0; i<n ;i++ )
		{
		    arr[i] = sc.nextInt();
		}
		int sum = 0;
		for(int i = 0; i<n; i++)
		{
		    if(arr[i]>0 && arr[i]<=9)
		    {
		        sum = sum+f.fact(arr[i]);
		        flag = true;
		    }
		}
		if(flag)
		{
		    System.out.println(sum);
		}
		else{
		    System.out.println("No positive and single digit numbers found in an array");
		}
	}

}
