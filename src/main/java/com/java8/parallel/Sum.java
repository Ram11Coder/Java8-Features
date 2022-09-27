package com.java8.parallel;

public class Sum {
    private int total;

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public  void performValue(int input) {
        total += input;
    }
}
