
class RepeatElement
{
	public int printRepeating(int arr[], int size)
	{
		int i, j;
        int max = 0 ,min = 9999;
        int value_max1 = 0; 
        int value_min1 = 0;
        int count[] = new int[size];
        for(int x =0; x<size; x++)
        {
            count[x] =1;
        }
		for (i = 1; i < size; i++)
		{
			for (j = 0; j < i; j++)
			{
				if (arr[i] == arr[j]){
                    count[i]++;
                }
                if(arr[i-1] == arr[i])
                {
                    count[i-1]++;
                }
                if(arr[0] == arr[1])
                {
                    count[0]++;
                }
			}
		}
        for(int y = 0; y<size; y++)
        {
            if(max < count[y])
            {
                max = count[y];
                value_max1=arr[y];
            }
            if(min > count[y])
                    {
                        min = count[y];
                        value_min1 = arr[y];
                    }  
        }
        return value_min1;
	}
}
public class Character_Count {
	public static void main(String[] args)
	{
		RepeatElement repeat = new RepeatElement();
		int arr[] = {1,1,1,1,2,2,4,4,4,4,5};
		int arr_size = arr.length;
        System.out.println(repeat.printRepeating(arr, arr_size));
	}
}


