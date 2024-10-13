import java.util.Scanner;

public class TaskSolver {

    // Метод для суммы двух последних цифр числа
    public int sumLastNums(int x) {
        int lastDigit = x % 10;
        int secondLastDigit = (x / 10) % 10;
        return lastDigit + secondLastDigit;
    }

    // Метод для проверки, является ли число положительным
    public boolean isPositive(int x) {
        return x > 0;
    }

    // Метод для проверки, является ли символ заглавной буквой
    public boolean isUpperCase(char x) {
        return x >= 'A' && x <= 'Z';
    }

    // Метод для проверки, делится ли одно число на другое нацело
    public boolean isDivisor(int a, int b) {
        return a % b == 0 || b % a == 0;
    }

    // Метод для суммы цифр из разряда единиц двух чисел
    public int lastNumSum(int a, int b) {
        int lastDigitA = a % 10;
        int lastDigitB = b % 10;
        return lastDigitA + lastDigitB;
    }

    public static void main(String[] args) {
        TaskSolver solver = new TaskSolver();
        Scanner scanner = new Scanner(System.in);

        // Тестирование метода sumLastNums
        System.out.print("Введите число для суммы двух последних цифр: ");
        int input1 = scanner.nextInt();
        int result1 = solver.sumLastNums(input1);
        System.out.println("Сумма двух последних цифр числа " + input1 + ": " + result1);

        // Тестирование метода isPositive
        System.out.print("Введите число для проверки на положительность: ");
        int input2 = scanner.nextInt();
        boolean result2 = solver.isPositive(input2);
        System.out.println("Число " + input2 + " положительное: " + result2);

        // Тестирование метода isUpperCase
        System.out.print("Введите символ для проверки на заглавную букву: ");
        char input3 = scanner.next().charAt(0);
        boolean result3 = solver.isUpperCase(input3);
        System.out.println("Символ '" + input3 + "' является заглавной буквой: " + result3);

        // Тестирование метода isDivisor
        System.out.print("Введите первое число для проверки делимости: ");
        int input4a = scanner.nextInt();
        System.out.print("Введите второе число для проверки делимости: ");
        int input4b = scanner.nextInt();
        boolean result4 = solver.isDivisor(input4a, input4b);
        System.out.println("Число " + input4a + " делится на " + input4b + " нацело: " + result4);

        // Тестирование метода lastNumSum
        System.out.print("Введите первое число для суммы цифр из разряда единиц: ");
        int input5a = scanner.nextInt();
        System.out.print("Введите второе число для суммы цифр из разряда единиц: ");
        int input5b = scanner.nextInt();
        int result5 = solver.lastNumSum(input5a, input5b);
        System.out.println("Сумма цифр из разряда единиц чисел " + input5a + " и " + input5b + ": " + result5);

        // Последовательное сложение пяти чисел
        System.out.print("Введите первое число для последовательного сложения: ");
        int input6a = scanner.nextInt();
        System.out.print("Введите второе число для последовательного сложения: ");
        int input6b = scanner.nextInt();
        System.out.print("Введите третье число для последовательного сложения: ");
        int input6c = scanner.nextInt();
        System.out.print("Введите четвертое число для последовательного сложения: ");
        int input6d = scanner.nextInt();
        System.out.print("Введите пятое число для последовательного сложения: ");
        int input6e = scanner.nextInt();

        int sum = solver.lastNumSum(input6a, input6b);
        System.out.println(input6a + " + " + input6b + " = " + sum);

        sum = solver.lastNumSum(sum, input6c);
        System.out.println(sum + " + " + input6c + " = " + sum);

        sum = solver.lastNumSum(sum, input6d);
        System.out.println(sum + " + " + input6d + " = " + sum);

        sum = solver.lastNumSum(sum, input6e);
        System.out.println(sum + " + " + input6e + " = " + sum);

        System.out.println("Итого: " + sum);

        scanner.close();
    }
}





