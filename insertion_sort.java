public class Main
{
	public static void main(String[] args) {
		System.out.println("Hello World");
			int arr[] = new int[]{1 ,2 ,3 ,5 ,6,4};
			for(int i=1; i<arr.length; i++)
			{
			    int temp = arr[i]; 
			    int position = i;
			    for(int j=i-1; j>=0; j--)
			    {
			        if(temp<arr[j])
			        {
			            position = j;
			            arr[j+1] = arr[j];
			            arr[position] = temp;
			            
			        }
			    }
			}
			for(int i=0; i<arr.length; i++)
			{
			    System.out.println(arr[i]);
			}
	}
}
