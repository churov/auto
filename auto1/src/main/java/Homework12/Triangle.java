package Homework12;

public class Triangle {
    private static void main(String[] args) {
        double a,b,c,p,s;
        a = 3;
        b = 4;
        c = 5;
        p = (a+b+c)/2;
        s=Math.sqrt(p*(p-a)*(p-b)*(p-c));

        System.out.println(s);
    }
}