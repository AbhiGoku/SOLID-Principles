package com.abhishek.SOLID.LSP.BadCode;

public class ReadOnlyFile extends File {
    public void read(){
        System.out.println("Reading from a file");
    }
    //If it doesn't perform this operation then why are we even providing this.
    public void write(){
        throw new UnsupportedOperationException("Cannot perform write operation");
    }
}
