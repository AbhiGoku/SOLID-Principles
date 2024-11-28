package com.abhishek.SOLID.ISP.BadCode;

public class MultiPurposeMachine implements Machine{
    @Override
    public void scan(Document doc) {
        System.out.println("Scanning the document");
    }

    @Override
    public void print(Document doc) {
        System.out.println("Printing the document");
    }

    @Override
    public void copy(Document doc) {
        System.out.println("Copying the document");
    }
}
