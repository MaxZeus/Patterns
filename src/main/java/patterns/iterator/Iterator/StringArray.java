package main.java.patterns.iterator.Iterator;

public class StringArray {
    final private String[] strArray;

    public StringArray(String[] array) {
        strArray = array;
    }
    public Iterator iterator() {
        return new InnerIterator();
    }
    private class InnerIterator implements Iterator {
        int ind;
        @Override
        public boolean hasNext() {
            return ind < strArray.length;
        }

        @Override
        public Object next() {
            if (this.hasNext()) return strArray[ind++];
            return null;
        }
    }
}
