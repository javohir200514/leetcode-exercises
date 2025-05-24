package medium.minstack_98;

import java.util.ArrayList;
import java.util.List;

public class MinStack {

    private static record Element(int val, int prevMin) {
    }

    List<Element> list;
    int min;

    public MinStack() {
        this.list=new ArrayList<>();
        this.min=Integer.MAX_VALUE;
    }

    public void push(int val) {
        list.add(new Element(val,min));
        if(min>val){
            min=val;
        }
    }

    public void pop() {
        min=list.getLast().prevMin;
        list.removeLast();
    }

    public int top() {
        return list.getLast().val;
    }

    public int getMin() {
        return min;
    }
}
