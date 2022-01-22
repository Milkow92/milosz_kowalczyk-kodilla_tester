package com.kodilla.school;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Grades {

        private int[] values;
        private int size;

        public Grades() {
            this.size = 0;
            this.values = new int[0];
        }

        public void add(int value) {
            this.size++;
            int[] newTab = new int[this.size];
            System.arraycopy(values, 0, newTab, 0, values.length);
            newTab[this.size - 1] = value;
            this.values = newTab;
        }

        public int[] getValues() {
            return values;
        }
    public double getAverage() {
        if (this.values.length == 0) {
            return 0;
        }
        double sum = 0;
        for(int i = 0; i < this.values.length; i++) {
            sum += this.values[i];
        }
        return sum/this.values.length;

    }
    @Test
    public void shouldCalculateAverage() {
        Grades grades = new Grades();
        grades.add(4);
        grades.add(2);
        grades.add(5);

        assertEquals(3.66, grades.getAverage(), 0.01);
    }
}



