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

    // Метод для безопасного деления
    public double safeDiv(int x, int y) {
        if (y == 0) {
            return 0;
        }
        return (double) x / y;
    }

    // Метод для строки сравнения
    public String makeDecision(int x, int y) {
        if (x > y) {
            return x + " > " + y;
        } else if (x < y) {
            return x + " < " + y;
        } else {
            return x + " = " + y;
        }
    }

    // Метод для тройной суммы
    public boolean sum3(int x, int y, int z) {
        return x + y == z || x + z == y || y + z == x;
    }

    // Метод для возраста
    public String age(int x) {
        int lastDigit = x % 10;
        if (lastDigit == 1 && x != 11) {
            return x + " год";
        } else if ((lastDigit == 2 || lastDigit == 3 || lastDigit == 4) && (x < 10 || x > 20)) {
            return x + " года";
        } else {
            return x + " лет";
        }
    }

    // Метод для вывода дней недели
    public void printDays(String x) {
        switch (x.toLowerCase()) {
            case "понедельник":
                System.out.println("Понедельник, Вторник, Среда, Четверг, Пятница, Суббота, Воскресенье");
                break;
            case "вторник":
                System.out.println("Вторник, Среда, Четверг, Пятница, Суббота, Воскресенье");
                break;
            case "среда":
                System.out.println("Среда, Четверг, Пятница, Суббота, Воскресенье");
                break;
            case "четверг":
                System.out.println("Четверг, Пятница, Суббота, Воскресенье");
                break;
            case "пятница":
                System.out.println("Пятница, Суббота, Воскресенье");
                break;
            case "суббота":
                System.out.println("Суббота, Воскресенье");
                break;
            case "воскресенье":
                System.out.println("Воскресенье");
                break;
            default:
                System.out.println("это не день недели");
                break;
        }
    }

    // Метод для последовательного сложения пяти чисел
    public void sequentialSum() {
        Scanner scanner = new Scanner(System.in);

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

        int sum = lastNumSum(input6a, input6b);
        System.out.println(input6a + " + " + input6b + " = " + sum);

        sum = lastNumSum(sum, input6c);
        System.out.println(sum + " + " + input6c + " = " + sum);

        sum = lastNumSum(sum, input6d);
        System.out.println(sum + " + " + input6d + " = " + sum);

        sum = lastNumSum(sum, input6e);
        System.out.println(sum + " + " + input6e + " = " + sum);

        System.out.println("Итого: " + sum);
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
        // Тестирование метода sequentialSum
        solver.sequentialSum();

        // Тестирование метода safeDiv
        System.out.print("Введите первое число для безопасного деления: ");
        int input7a = scanner.nextInt();
        System.out.print("Введите второе число для безопасного деления: ");
        int input7b = scanner.nextInt();
        double result7 = solver.safeDiv(input7a, input7b);
        System.out.println("Результат безопасного деления " + input7a + " на " + input7b + ": " + result7);

        // Тестирование метода makeDecision
        System.out.print("Введите первое число для сравнения: ");
        int input8a = scanner.nextInt();
        System.out.print("Введите второе число для сравнения: ");
        int input8b = scanner.nextInt();
        String result8 = solver.makeDecision(input8a, input8b);
        System.out.println("Результат сравнения: " + result8);

        // Тестирование метода sum3
        System.out.print("Введите первое число для проверки тройной суммы: ");
        int input9a = scanner.nextInt();
        System.out.print("Введите второе число для проверки тройной суммы: ");
        int input9b = scanner.nextInt();
        System.out.print("Введите третье число для проверки тройной суммы: ");
        int input9c = scanner.nextInt();
        boolean result9 = solver.sum3(input9a, input9b, input9c);
        System.out.println("Можно ли сложить два числа из трех, чтобы получить третье: " + result9);

        // Тестирование метода age
        System.out.print("Введите возраст: ");
        int input10 = scanner.nextInt();
        String result10 = solver.age(input10);
        System.out.println("Возраст: " + result10);

        // Тестирование метода printDays
        System.out.print("Введите день недели: ");
        String input11 = scanner.next();
        solver.printDays(input11);

        scanner.close();
    }
}
