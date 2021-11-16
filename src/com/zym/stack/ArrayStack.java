package com.zym.stack;

/**
 * @author zhouyumeng
 * @date 2021/09/27
 **/
public class ArrayStack {

    private String[] array;

    private int len;

    private int count;

    public ArrayStack(int capacity) {
        if (capacity <= 0) {
            capacity = 10;
        }
        array = new String[capacity];
        len = capacity;
        count = 0;
    }

    public boolean push(String item) {
        if (count < len) {
            array[count++] = item;
            return true;
        }
        return false;
    }

    public String pop() {
        if (count > 0) {
            return array[--count];
        }
        return null;
    }

    public static void main(String[] args) {
        ArrayStack arrayStack = new ArrayStack(3);
        System.out.println(arrayStack.pop());
        arrayStack.push("a");
        arrayStack.push("b");
        arrayStack.push("c");
        System.out.println(arrayStack.pop());
        System.out.println(arrayStack.pop());
        System.out.println(arrayStack.pop());
    }
}
