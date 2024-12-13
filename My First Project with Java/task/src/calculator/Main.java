package calculator;
import java.util.stream.IntStream;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] earnedAmount = {202, 118, 2250, 1680, 1075, 80};

        int income = IntStream.of(earnedAmount).sum();

        System.out.println("Earned amount:");
        System.out.println(
                "Bubblegum: $202\n" +
                "Toffee: $118\n" +
                "Ice cream: $2250\n" +
                "Milk chocolate: $1680\n" +
                "Doughnut: $1075\n" +
                "Pancake: $80\n"
        );

        System.out.println("Income: " + income);

        Scanner sc = new Scanner(System.in);
        System.out.println("Staff expenses:");
        int staffExpenses = sc.nextInt();

        System.out.println("Other expenses:");
        int otherExpenses = sc.nextInt();

        sc.close();

        int netIncome = staffExpenses + otherExpenses;

        System.out.println("Net income: $" + (income - netIncome));
    }
}