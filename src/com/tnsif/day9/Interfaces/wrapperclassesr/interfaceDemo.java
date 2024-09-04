package com.tnsif.day9.Interfaces.wrapperclassesr;
interface one {
    int age = 20;
    void show();
}

class two implements one {
    @Override
    public void show() {
        System.out.println("Interface method one");
    }
}

public class interfaceDemo {
    public static void main(String[] args) {
       
        two obj = new two();

        obj.show();
    }
}
