public class pro1
{
    public static void main(String[] args) {
        int sum=0;
        for(int i=1;i<=1000;i++)
        {
            int count=0;

            for(int j=1;j<=1000;j++)
            {
                if(i%j ==0)
                {
                    count++;
                }

            }
            if(count==9)
            {
                sum++;

            }
        }
        System.out.println(sum);
    }
}
