package lb4;

import java.util.Arrays;
import java.util.Vector;
import java.util.Iterator;

public class VectorOperations {
    private Vector<Double> vector;

    public VectorOperations() {
        this.vector = new Vector<>();
    }

    public void addElement(double element) {
        vector.add(element);
    }

    public void sortVector() {
        Double[] array = vector.toArray(new Double[0]);
        Arrays.sort(array);
        vector = new Vector<>(Arrays.asList(array));
    }

    public double getMedian() {
        sortVector();
        int size = vector.size();
        if (size % 2 == 0) {
            return (vector.get(size / 2 - 1) + vector.get(size / 2)) / 2;
        } else {
            return vector.get(size / 2);
        }
    }

 public double getAverage() {
        double sum = 0;
        for (Double num : vector) {
            sum += num;
        }
        return Math.round((sum / vector.size()) * 10000.0) / 10000.0; 
    }
 
    public Vector<Double> getVector() {
        return vector;
    }


}
