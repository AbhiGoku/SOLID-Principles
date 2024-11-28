package com.abhishek.SOLID.ISP.GoodCode;

import com.abhishek.SOLID.ISP.BadCode.Document;


public class SimplePrinter implements Printer {
    @Override
    public void print(Document doc) {
        System.out.print("Printing the document");
    }

}
