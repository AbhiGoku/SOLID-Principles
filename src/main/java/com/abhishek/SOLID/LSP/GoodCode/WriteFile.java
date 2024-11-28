package com.abhishek.SOLID.LSP.GoodCode;

public class WriteFile extends ReadOnlyFile implements Writable {
    @Override
    public void write() {
        System.out.println("Writing to a file....");
    }
}
