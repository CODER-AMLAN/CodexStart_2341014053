import java.util.*;                                                     //NAME: AMLAN ANSHUMAN NAYAK
public class Main {                                                     //REGISTRATION NUMBER: 2341014053
    public static void towerofHanoi(int n,int f,int m,int l) {          //PROBLEM STATEMENT LINK:https://cses.fi/problemset/task/2165
        if(n==1) {
            System.out.println(f + " " + l);
            return;
        }
        towerofHanoi(n - 1, f, l, m);
        System.out.println(f + " " + l);
        towerofHanoi(n - 1, m, f, l);
    }
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    System.out.println((int)(Math.pow(2,n)-1));
    towerofHanoi(n,1,2,3);
        }
    }
