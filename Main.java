import java.util.*;                                             //NAME:AMLAN ANSHUMAN NAYAK
public class Main {                                             //REGISTRATION NUMBER:2341014053
    public static void main(String[]args)                       //PROBLEM STATEMENT LINK: https://cses.fi/problemset/task/1094/
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int []a=new int[n];
        long s=0,r;
        for(int b=0;b<n;b++)
        {
            a[b]=sc.nextInt();
        }
        for (int c=0;c<n-1;c++)
        {
            if(a[c]>a[c+1])
            {
                r=a[c]-a[c+1];
                s+=r;
                a[c+1]+= (int) r;
            }
        }
        System.out.print(s);
    }
}