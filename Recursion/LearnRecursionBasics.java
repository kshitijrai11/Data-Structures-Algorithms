package Recursion;

public class LearnRecursionBasics {
    public static void main(String[] args) {

//        fun(4);
//        foo(4);
        bar(3);
    }

    static void fun(int n) {
        if (n > 0) {
            System.out.println(n);
            fun(n - 1);
        }
    }

    static void foo(int n) {
        if (n > 0) {
            foo(n - 1);
            System.out.println(n);
        }
    }

    static void bar(int n) {
        if(n>0){
            System.out.println(n);
            bar(n-1);
            bar(n-1);
        }
    }

}
