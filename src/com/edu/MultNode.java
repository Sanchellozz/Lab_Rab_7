package com.edu;
import java.util.*;

public class MultNode implements AbstractNode {
    private final Collection<AbstractNode> list;
    public MultNode(Collection<AbstractNode> list)
    {
        this.list = list;
    }
    @Override
    public int calculate() {
        int result = 1;
        for (AbstractNode node : list) {
            result *= node.calculate();
        }
        return result;
    }

    @Override
    public String toString() {
         String result = "";
         boolean first = true;
         for (AbstractNode node : list) {
             if (!first) result += " * ";
             first = false;

             result += "(" + node + ")";
             }
         return result;
    }

}
