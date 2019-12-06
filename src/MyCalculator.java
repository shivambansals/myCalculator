import java.util.Scanner;

public class MyCalculator {
    double p;
    double n;

    public void calculation() throws NegativeCustomException, ZeroCustomException {
        long power = (long) Math.pow(n, p);

        if (n < 0) {
            throw new NegativeCustomException((int) n);
        } else if (p < 0) {
            throw new NegativeCustomException((int) n);
        } else if (n == 0 | p == 0) {
            throw new ZeroCustomException();
        }
        System.out.println(power);


    }

    public MyCalculator(int n, int p) {
        this.n = n;
        this.p = p;
    }
}

class NegativeCustomException extends Exception {
    int number;

    public NegativeCustomException(int number) {
        this.number = number;

    }

    public String toString() {
        return "n or p must not be negative";
    }
}

class ZeroCustomException extends Exception {


    public String toString() {
        return "n and p must not be zero";
    }
}

class Main {
    public static void main(String[] args) throws NegativeCustomException, ZeroCustomException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("the number n = ");
        int num1 = scanner.nextInt();
        System.out.println("the number p =");
        int num2 = scanner.nextInt();
        MyCalculator myCalculator = new MyCalculator(num1, num2);
        myCalculator.calculation();

    }
}
