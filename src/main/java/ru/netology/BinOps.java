package ru.netology;

public class BinOps implements BinOpsInterfase {

    protected final Calculator target;

    public BinOps() {
        this.target = new Calculator();
    }
    @Override
    public String sum(String a, String b) {
        return Integer.toBinaryString(target.newFormula()
                .addOperand(Integer.parseInt(a.trim()))
                .addOperand(Integer.parseInt(b.trim()))
                .calculate(Calculator.Operation.SUM)
                .result());
    }
    @Override
    public String mult(String a, String b) {
        return Integer.toBinaryString(target.newFormula()
                .addOperand(Integer.parseInt(a.trim()))
                .addOperand(Integer.parseInt(b.trim()))
                .calculate(Calculator.Operation.MULT)
                .result());

    }
}

