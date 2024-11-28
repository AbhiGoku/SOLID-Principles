package com.abhishek.SOLID.LSP.BadCode;

public class Main {
    public static void main(String[] args){
        File file =new ReadOnlyFile();
        file.read();
        //throws an expection. This is the issue.
        file.write();
    }
}
