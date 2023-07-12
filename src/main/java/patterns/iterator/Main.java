package main.java.patterns.iterator;

import main.java.patterns.iterator.Iterator.Iterator;
import main.java.patterns.iterator.Iterator.StringArray;

public class Main {
    public static void main(String[] args) {
        String[] array = {"First", "Second", "Third", "Fourth", "Fifth", "Sixth", "Seventh"};
        StringArray str = new StringArray(array);
        Iterator iterator = str.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next().toString() + " ");
        }
    }
}
