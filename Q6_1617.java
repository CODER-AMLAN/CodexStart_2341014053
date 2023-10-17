import java.util.*;                                         //NAME: AMLAN ANSHUMAN NAYAK
public class Main                                           //REGISTRATION NUMBER: 2341014053
{                                                           //PROBLEM STATEMENT LINK: https://cses.fi/problemset/task/1617
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        long n= sc.nextInt();
        long p=1,M=1000000007;
        for(long k=1;k<=n;k++)
        {
            p=(p%M*2%M)%M;
        }
        System.out.print(p);
    }
}
