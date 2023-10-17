import java.util.*;                                     //NAME: AMLAN ANSHUMAN NAYAK
public class Main                                       //REGISTRATION NUMBER: 2341014053
{                                                       //PROBLEM STATEMENT LINK: https://cses.fi/problemset/task/1069
    public static void main(String[]Args)
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        long b,d=0;
        for(char c='A';c<='Z';c++)
        {
            b=0;
            for(int a=0;a<s.length();a++)
            {
                if(c==s.charAt(a))
                {
                    b++;
                }
                else if(b>=d)
                {
                    d=b;
                    b=0;
                }
                else {
                    b=0;
                }
            }
            if(b>d)
            {
                d=b;
            }
        }
        System.out.println(d);
    }
}
