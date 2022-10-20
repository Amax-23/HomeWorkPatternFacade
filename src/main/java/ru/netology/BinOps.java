package ru.netology;

public class BinOps {
    protected String target;

    public String sum(String a, String b) {
        target = Integer.toBinaryString(Integer.parseInt(a.trim()) + Integer.parseInt(b.trim()));
        return target;
    }

    public String mult(String a, String b) {
        target = Integer.toBinaryString(Integer.parseInt(a.trim()) * Integer.parseInt(b.trim()));
        return target;

    }
}

