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


    // Метод для возврата строки с числами от x до 0
    public String reverseListNums(int x) {
        StringBuilder result = new StringBuilder();
        for (int i = x; i >= 0; i--) {
            result.append(i).append(" ");
        }
        return result.toString().trim();
    }

    // Метод для возведения числа x в степень y
    public int pow(int x, int y) {
        int result = 1;
        for (int i = 0; i < y; i++) {
            result *= x;
        }
        return result;
    }

    // Метод для проверки одинаковости всех знаков числа
    public boolean equalNum(int x) {
        int lastDigit = x % 10;
        x /= 10;
        while (x > 0) {
            if (x % 10 != lastDigit) {
                return false;
            }
            x /= 10;
        }
        return true;
    }

    // Метод для вывода левого треугольника
    public void leftTriangle(int x) {
        for (int i = 1; i <= x; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    // Метод для игры "Угадайка"
    public void guessGame() {
        Scanner scanner = new Scanner(System.in);
        int randomNumber = (int) (Math.random() * 10);
        int attempts = 0;
        int guess;

        do {
            System.out.print("Угадайте число от 0 до 9: ");
            guess = scanner.nextInt();
            attempts++;
            if (guess == randomNumber) {
                System.out.println("Вы угадали число! Количество попыток: " + attempts);
            } else {
                System.out.println("Не угадали, попробуйте еще раз.");
            }
        } while (guess != randomNumber);
    }

    // Метод для поиска последнего вхождения числа в массив
    public int findLast(int[] arr, int x) {
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] == x) {
                return i;
            }
        }
        return -1;
    }

    // Метод для добавления элемента в массив на определенную позицию
    public int[] add(int[] arr, int x, int pos) {
        int[] newArr = new int[arr.length + 1];
        for (int i = 0; i < pos; i++) {
            newArr[i] = arr[i];
        }
        newArr[pos] = x;
        for (int i = pos; i < arr.length; i++) {
            newArr[i + 1] = arr[i];
        }
        return newArr;
    }

    // Метод для реверса массива
    public void reverse(int[] arr) {
        int left = 0;
        int right = arr.length - 1;
        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }

    // Метод для объединения двух массивов
    public int[] concat(int[] arr1, int[] arr2) {
        int[] newArr = new int[arr1.length + arr2.length];
        System.arraycopy(arr1, 0, newArr, 0, arr1.length);
        System.arraycopy(arr2, 0, newArr, arr1.length, arr2.length);
        return newArr;
    }

    // Метод для удаления отрицательных элементов из массива
    public int[] deleteNegative(int[] arr) {
        int count = 0;
        for (int num : arr) {
            if (num >= 0) {
                count++;
            }
        }
        int[] newArr = new int[count];
        int index = 0;
        for (int num : arr) {
            if (num >= 0) {
                newArr[index++] = num;
            }
        }
        return newArr;
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

        // Тестирование метода reverseListNums
        System.out.print("Введите число для вывода чисел от него до 0: ");
        int input12 = scanner.nextInt();
        String result12 = solver.reverseListNums(input12);
        System.out.println("Числа от " + input12 + " до 0: " + result12);

        // Тестирование метода pow
        System.out.print("Введите число для возведения в степень: ");
        int input13a = scanner.nextInt();
        System.out.print("Введите степень: ");
        int input13b = scanner.nextInt();
        int result13 = solver.pow(input13a, input13b);
        System.out.println(input13a + " в степени " + input13b + " = " + result13);

        // Тестирование метода equalNum
        System.out.print("Введите число для проверки одинаковости знаков: ");
        int input14 = scanner.nextInt();
        boolean result14 = solver.equalNum(input14);
        System.out.println("Все знаки числа " + input14 + " одинаковы: " + result14);

        // Тестирование метода leftTriangle
        System.out.print("Введите высоту треугольника: ");
        int input15 = scanner.nextInt();
        solver.leftTriangle(input15);

        // Тестирование метода guessGame
        solver.guessGame();

        // Тестирование метода findLast
        System.out.print("Введите размер массива для поиска последнего вхождения: ");
        int size1 = scanner.nextInt();
        int[] array1 = new int[size1];
        System.out.println("Введите элементы массива:");
        for (int i = 0; i < size1; i++) {
            array1[i] = scanner.nextInt();
        }
        System.out.print("Введите число для поиска последнего вхождения: ");
        int input16 = scanner.nextInt();
        int result16 = solver.findLast(array1, input16);
        System.out.println("Индекс последнего вхождения числа " + input16 + ": " + result16);

        // Тестирование метода add
        System.out.print("Введите размер массива для добавления элемента: ");
        int size2 = scanner.nextInt();
        int[] array2 = new int[size2];
        System.out.println("Введите элементы массива:");
        for (int i = 0; i < size2; i++) {
            array2[i] = scanner.nextInt();
        }
        System.out.print("Введите число для добавления в массив: ");
        int input17a = scanner.nextInt();
        System.out.print("Введите позицию для добавления: ");
        int input17b = scanner.nextInt();
        int[] result17 = solver.add(array2, input17a, input17b);
        System.out.println("Новый массив после добавления: ");
        for (int num : result17) {
            System.out.print(num + " ");
        }
        System.out.println();

        // Тестирование метода reverse
        System.out.print("Введите размер массива для реверса: ");
        int size3 = scanner.nextInt();
        int[] array3 = new int[size3];
        System.out.println("Введите элементы массива:");
        for (int i = 0; i < size3; i++) {
            array3[i] = scanner.nextInt();
        }
        solver.reverse(array3);
        System.out.println("Массив после реверса: ");
        for (int num : array3) {
            System.out.print(num + " ");
        }
        System.out.println();

        // Тестирование метода concat
        System.out.print("Введите размер первого массива для объединения: ");
        int size4 = scanner.nextInt();
        int[] array4 = new int[size4];
        System.out.println("Введите элементы первого массива:");
        for (int i = 0; i < size4; i++) {
            array4[i] = scanner.nextInt();
        }
        System.out.print("Введите размер второго массива для объединения: ");
        int size5 = scanner.nextInt();
        int[] array5 = new int[size5];
        System.out.println("Введите элементы второго массива:");
        for (int i = 0; i < size5; i++) {
            array5[i] = scanner.nextInt();
        }
        int[] result18 = solver.concat(array4, array5);
        System.out.println("Объединенный массив: ");
        for (int num : result18) {
            System.out.print(num + " ");
        }
        System.out.println();

        // Тестирование метода deleteNegative
        System.out.print("Введите размер массива для удаления отрицательных элементов: ");
        int size6 = scanner.nextInt();
        int[] array6 = new int[size6];
        System.out.println("Введите элементы массива:");
        for (int i = 0; i < size6; i++) {
            array6[i] = scanner.nextInt();
        }
        int[] result19 = solver.deleteNegative(array6);
        System.out.println("Массив после удаления отрицательных элементов: ");
        for (int num : result19) {
            System.out.print(num + " ");
        }
        System.out.println();

        scanner.close();
    }
}