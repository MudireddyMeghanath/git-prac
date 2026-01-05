import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to Simple Java Program");

        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        greetUser(name, age);

        System.out.println("\nEnter 5 numbers:");
        int[] numbers = new int[5];

        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Number " + (i + 1) + ": ");
            numbers[i] = sc.nextInt();
        }

        int sum = calculateSum(numbers);
        int max = findMax(numbers);

        System.out.println("\nResults:");
        System.out.println("Sum = " + sum);
        System.out.println("Maximum = " + max);

        System.out.println("\nEven numbers:");
        for (int num : numbers) {
            if (num % 2 == 0) {
                System.out.println(num);
            }
        }

        System.out.println("\nOdd numbers:");
        for (int num : numbers) {
            if (num % 2 != 0) {
                System.out.println(num);
            }
        }

        System.out.println("\nCounting from 1 to 10:");
        for (int i = 1; i <= 10; i++) {
            System.out.print(i + " ");
        }

        System.out.println("\n\nChecking age category:");
        if (age < 18) {
            System.out.println("You are a minor");
        } else if (age < 60) {
            System.out.println("You are an adult");
        } else {
            System.out.println("You are a senior citizen");
        }

        sc.close();
        System.out.println("\nProgram Ended Successfully");
    }

    static void greetUser(String name, int age) {
        System.out.println("\nHello " + name);
        System.out.println("Your age is " + age);
    }

    static int calculateSum(int[] arr) {
        int total = 0;
        for (int num : arr) {
            total += num;
        }
        return total;
    }

    static int findMax(int[] arr) {
        int max = arr[0];
        for (int num : arr) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }
}
