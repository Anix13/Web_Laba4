package lb4;

import java.util.Scanner;

public class UiClass {
    public static void main(String[] args) {
        VectorOperations vectorOperations = new VectorOperations();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Введите массив double (разделяйте числа пробелами) или 'EXIT' для выхода: ");
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("EXIT")) {
                System.out.println("Выход из программы.");
                break;
            }

            String[] inputs = input.split("\\s+");

            // Очищаем вектор перед новым вводом
            vectorOperations = new VectorOperations();
            boolean validInput = true;

            for (String arg : inputs) {
                try {
                    double value = Double.parseDouble(arg);
                    vectorOperations.addElement(value);
                } catch (NumberFormatException e) {
                    System.err.println("Ошибка: Аргумент '" + arg + "' не является числом.");
                    validInput = false;
                }
            }

            if (validInput) {
                // Записываем результаты в файл
                FileWriterUtil.writeToFile("results.txt", vectorOperations);

                // Выводим информацию в консоль
                System.out.println("Вектор создан. Результаты записаны в файл 'results.txt'.");
            }
        }

        scanner.close();
    }
}
