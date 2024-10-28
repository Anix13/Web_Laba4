package lb4;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterUtil {
    public static void writeToFile(String filename, VectorOperations vectorOperations) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename))) {
            writer.write("Начальный вектор: " + vectorOperations.getVector() + "\n");
            vectorOperations.sortVector();
            writer.write("Сортированный вектор: " + vectorOperations.getVector() + "\n");
            writer.write("Медиана: " + vectorOperations.getMedian() + "\n");
            writer.write("Среднее значение: " + vectorOperations.getAverage() + "\n");
        } catch (IOException e) {
            System.err.println("Ошибка при записи в файл: " + e.getMessage());
        }
    }
}

