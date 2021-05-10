package com.edu;

public class SubNode implements AbstractNode {
    private final AbstractNode left;
    private final AbstractNode right;
    public SubNode(AbstractNode left, AbstractNode right) {
        this.left = left;
        this.right = right;
    }
    @Override
    public int calculate() {
        if (left.calculate() == 0)
        {
            return left.calculate();
        }
        else
            return left.calculate() - right.calculate();
    }
    public String toString() {
        return "(" + left + ") - (" + right + ")";
    }
}