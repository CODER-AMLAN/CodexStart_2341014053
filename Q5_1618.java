import java.util.*;                                 //NAME: AMLAN ANSHUMAN NAYAK
public  class Main                                  //REGISTRATION NUMBER: 2341014053
{                                                   //PROBLEM STATEMENT LINK:https://cses.fi/problemset/task/1618
    static int s=0;
    public static void Trailingzeroes(int n)
    {
        s=s+n;
        if(n<5)
        {
            System.out.println(s);
            return;
        }
        Trailingzeroes(n/5);
    }
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Trailingzeroes(n/5);
    }
}
