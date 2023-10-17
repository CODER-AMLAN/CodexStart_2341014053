import java.util.*;                                         //NAME: AMLAN ANSHUMAN NAYAK
public class Main {                                        //REGISTRATION NUMBER: 2341014053
                                                           //PROBLEM STATEMENT LINK:https://cses.fi/problemset/task/1083

     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int s=0,s1=0; 
        int[] b = new int[n - 1];
        for (int a = 0; a < b.length; a++) {
            b[a] = sc.nextInt();
            s+=b[a];
        }
        for(int i=1;i<=n;i++)
        {
           s1+=i;
        }
        System.out.print(s1-s);      
    }
}

