import java.util.Scanner;
class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(fib(n));
    }
    public static int fib(int n){
        int a = 0;
        int b = 1;
        int sum = 0;
        if(n==0){
            return a;
        }
        if(n==1){
            return b;
        }
        return fib(n-1)+fib(n-2);
        
    }
}