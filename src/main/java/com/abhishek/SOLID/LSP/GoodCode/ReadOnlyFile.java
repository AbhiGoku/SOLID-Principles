package com.abhishek.SOLID.LSP.GoodCode;

public class ReadOnlyFile implements Readable{
    @Override
    public void read() {
        System.out.println("Reading from a file");
    }
}
