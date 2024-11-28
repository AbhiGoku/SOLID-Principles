package com.abhishek.SOLID.LSP.GoodCode;

public class Main {

    public static void readAnyFile(Readable file){
        file.read();
    }

    public static void main(String[] args) {
        ReadOnlyFile readOnlyFile=new ReadSubClass();
        readOnlyFile.read();
        //we cannot do write function for this file.
        // Therefore, Liskov Substitution Principle is maintained

        WriteFile writable=new WriteFile();
        writable.write();
        writable.read();

        readAnyFile(writable);
        readAnyFile(readOnlyFile);
    }
}
