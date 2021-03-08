import java.util.ArrayList;

public class ProblemSet12 {
    public static void main(String[] args) {
    }
    public static long factorial(int n) {
        if (n < 0){
            return -1;
        } else{
            if( n == 0){
                return 1;
            } else {
                return n * factorial(n - 1);
            }
        }
    }

    public static long fibonacci(int n) {
        long fib = 0;
        if (n < 0){
            return -1;
        } else {
            if ( n == 0 || n == 1){
                return n;
            }
            fib = fibonacci(n - 1) + fibonacci(n -2);
        }
        return fib;
    }

    public static long triangle(int rows) {
        long row;
        if( rows < 0){
            return -1;
        } else {
            if ( rows == 0 || rows == 1){
                return rows;
            }
            row = triangle( rows - 1) +2;
        }
        return row;
    }

    public static long sumDigits(int n) {
        long sum;
        if (n < 0){
            return -1;
        } else {

            if (n < 10){
                return n;
            }
            sum = n % 10 + sumDigits(n / 10);
        }
        return sum;
    }

    public static long powerN(int base, int exponent) {
        long value;
        if( base < 1 || exponent < 1){
            return -1;
        } else {
            if (exponent == 1){
                return base;
            }
            value = base * powerN(base, exponent - 1);
        }
        return value;
    }

    public String changeXY(String text) {
        if(text == null){
            return null;
        }
        if(text.length() == 0){
            return text;
        }
        if(text.charAt(0) == 'x'){
            return 'y' + changeXY(text.substring(1));
        }
        return text.charAt(0) + changeXY(text.substring(1));
    }

    public int array11(int[] data, int index) {
        if (data == null){
            return -1;
        }
        if(index<0){
            return -1;
        }
        if(index >= data.length){
            return 0;
        }
        if(data[index] == 11){
            return 1 + array11(data, index+1);
        }
        return array11(data, index+1);
    }

    public int strCount(String text, String sub) {
        if(text == null){
            return -1;
        }
        if(sub == null ){
            return -1;
        }
        if(sub.length() == 0){
            return -1;
        }
        if(text.length() < sub.length())
            return 0;

        if(text.substring(0, sub.length()).equals(sub))
            return 1 + strCount(text.substring(sub.length()), sub);

        return strCount(text.substring(1), sub);
    }

    public boolean strCopies(String text, String sub, int n) {
        if(text == null){
            return false;
        }
        if(sub == null ){
            return false;
        }
        if(sub.length() == 0){
            return false;
        }
        if(n<0){
            return false;
        }
        if(n == 0) {
            return true;
        }
        if(text.length() < sub.length()) {
            return false;
        }
        if(text.substring(0, sub.length()).equals(sub))
            return strCopies(text.substring(1), sub, n-1);

        return strCopies(text.substring(1), sub, n);
    }

    public int strDist(String text, String sub) {
        if(text == null){
            return -1;
        }
        if(sub == null ){
            return -1;
        }
        if(sub.length() == 0){
            return -1;
        }

        if(text.length() < sub.length()) {
            return 0;
        }
        if(text.substring(0, sub.length()).equals(sub) && text.substring(text.length() - sub.length()).equals(sub)) {
            return text.length();
        }
        if(!text.substring(0, sub.length()).equals(sub))
            return strDist(text.substring(1), sub);

        return strDist(text.substring(0, text.length()-1), sub);
    }
}