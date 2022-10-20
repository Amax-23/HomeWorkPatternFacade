package ru.netology;

public class Calculator {
    public Formula newFormula() {
        return new Formula();
    }

    public static enum Operation {
        SUM, MULT;
    }

    public static class Formula {
        protected Integer a, b, result;

        protected Formula() {
        }

        public Formula addOperand(int operand) {
            if (a == null) {
                a = operand;
            } else if (b == null) {
                b = operand;
            } else {
                throw new IllegalStateException("Formula is full of operands");
            }
            return this;
        }

        public Formula calculate(Operation op) {
            if (a == null || b == null)
                throw new IllegalStateException("Not enough operands!");
            switch (op) {
                case SUM:
                    result = a + b;
                    break;
                case MULT:
                    result = a * b;
                    break;
            }
            return this;
        }

        public int result() {
            if (result == null)
                throw new IllegalStateException("Formula is not computed!");
            return result;
        }
    }
}
