import java.util.Scanner;

public class twomix
{
    public static void main(String[] args) {

        Scanner s1 = new Scanner(System.in);
        int n = s1.nextInt();
        int arr2[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr2[i] = s1.nextInt();
        }
        palin(arr2);

    }

    public static void palin(int arr1[])
    {

     for(int j=0;j< arr1.length;j++)
     {
         for(int i=arr1[j] +1;i<1000000;i++)
         {
             int m = i;
             int sum = 0;
             while (m != 0) {
                 int rem = m % 10;
                 sum = sum * 10 + rem;
                 m = m / 10;
             }
             if(sum==i) {
                 System.out.println(sum);
                 break;
             }

         }
     }

    }
}
