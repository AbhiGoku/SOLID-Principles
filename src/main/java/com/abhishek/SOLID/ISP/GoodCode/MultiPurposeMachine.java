package com.abhishek.SOLID.ISP.GoodCode;

import com.abhishek.SOLID.ISP.BadCode.Document;

public class MultiPurposeMachine implements Printer,Scanner,Copier {
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
