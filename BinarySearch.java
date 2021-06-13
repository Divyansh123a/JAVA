import java.util.*;
public class BinarySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> a = new ArrayList<>();
        System.out.println("Enter the no of Courses");
        int n = sc.nextInt();
        for(int i =0; i<=n; i++)
        {
            a.add(sc.nextLine());
        }
        System.out.println("Enter the Course You wanna search");
        String ser = sc.nextLine();
        Collections.sort(a);
        int fou = Collections.binarySearch(a , ser);
    if(fou>=0)
    {
        System.out.println(ser+"Course is avaliable.");
    }
    else{
        System.out.println(ser+"Course is not avaliable.");
    }
    }
}
