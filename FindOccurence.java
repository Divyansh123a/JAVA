import java.util.Scanner;

public class FirstOccurence {

	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		// Fill the code
		System.out.println("Enter the string:");
		boolean flag = true;
		char[] str = sc.nextLine().toCharArray();
		System.out.println("Enter the character to be searched:");
		char s1 = sc.next().charAt(0);
		
		System.out.println("Enter the character to replace");
		char s2 = sc.next().charAt(0);
		for (int i = 0;i<str.length ;i++ )
		{
		    char r = str[i];
		    if(r==s1)
		    {
		        str[i]=s2;
		        flag = false;
		        break;
		    }
		}
		if(flag)
		{
		    System.out.println("character not found");
		}
		else{
		    for(int i=0; i<str.length; i++)
		    {
		        System.out.print(str[i]);
		    }
		}
	}

}
