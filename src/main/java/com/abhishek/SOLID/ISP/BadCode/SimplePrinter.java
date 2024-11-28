package com.abhishek.SOLID.ISP.BadCode;

public class SimplePrinter implements Machine{
    @Override
    public void scan(Document doc) {
        throw new UnsupportedOperationException("Simple Printer cannot perform Scan operation");
    }

    @Override
    public void print(Document doc) {
        System.out.print("Printing the document");
    }

    @Override
    public void copy(Document doc) {
        throw new UnsupportedOperationException("Simple Printer cannot perform Copy operation");
    }
}
