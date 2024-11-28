package com.abhishek.SOLID.ISP.BadCode;

public interface Machine {
    public void scan(Document doc);
    public void print(Document doc);
    public void copy(Document doc);
}
