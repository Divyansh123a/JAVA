public class subarray {
    public static void main(String[] args) {
        int x[] = new int[]{1,2,3};
        for(int i=0; i<x.length; i++)
    {
        for(int group=i; group<x.length; group++)
        {
            for(int j=i; j<=group; j++)
            {
                System.out.print(x[j]);
            }
            System.out.println();
        }
    }
    }
}
