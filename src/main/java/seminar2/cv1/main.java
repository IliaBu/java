package seminar2.cv1;

public class main {

    /*

    Implement pow(x, n),
    which calculates x raised to the power n
    (i.e., xn).

     */
    public static void main(String[] args) {
        //System.out.println(myPow(2.000, -2144489858));
        System.out.println(myPow2(2.000, -2144489858));
    }

    public static double myPow(double x, int n) {
        //if (Math.abs(x - 1) < 0.00000001) return 1;
/*
        boolean isNegative = n < 0;
        if (isNegative) n *= -1;
        double result = 1;
        while (n > 0) {
            result *= x;
            n--;
        }
        if (isNegative)
            return 1 / result;
        return result;



        if (n < 0)
            return 1 / x * myPow(1 / x, -(n + 1));
        if (n == 0)
            return 1;
        double half = myPow(x, n / 2);
        if (n % 2 == 0)
            return half * half;
        else
            return x * half * half;
*/
        if (n == 0) {
            return x;
        }
        if (n < 0) {
            return 1 / x * myPow(1 / x, -(n + 1));
        }
        double half = myPow(x, n / 2);
        if (n % 2 == 0)
            return half * half;
        else
            return x * half * half;
        //return x * myPow(x, n - 1);


    }

    public static double myPow2(double x, int n) {
        if (n < 0) {
            n = -n;
            x = 1 / x;
        }
        double pow = 1;
        while (n != 0) {
            if ((n & 1) != 0) {
                pow *= x;
            }
            x *= x;
            n >>>= 1;
        }
        return pow;
    }

}
