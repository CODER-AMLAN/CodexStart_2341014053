import java.util.*;                                       // NAME: AMLAN ANSHUMAN NAYAK
public class Main                                          //REGISTRATION NUMBER: 2341014053
{                                                          //PROBLEM STATEMENT LINK:https://cses.fi/problemset/task/1068/
    public static void weird(long n) {
        System.out.print(n + " ");
        if (n == 1)
        {
            return;
        }
        if(n%2==0)
        {
             weird(n/2);
        }
        else
        {
            weird((3*n)+1);
        }
    }
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        long n= sc.nextInt();
        weird(n);

    }
}
