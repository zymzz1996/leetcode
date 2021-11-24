package com.zym.queue;

/**
 * 循环队列
 * @author zhouyumeng
 * @date 2021/11/23
 **/
public class CircularQueue {
    /**
     * 容器
     */
    private final String[] array;
    /**
     * 头指针
     */
    private int head;
    /**
     * 尾指针
     */
    private int tail;
    /**
     * 队列大小
     */
    private final int n;

    public CircularQueue(int capacity) {
        this.array = new String[capacity];
        this.n = capacity;
    }

    public boolean enqueue(String value) {
        if ((tail + 1) % n == head) {
            return false;
        }
        array[tail] = value;
        tail = (tail + 1) % n;
        return true;
    }

    public String dequeue() {
        if (head == tail) {
            return null;
        }
        String result = array[head];
        head = (head + 1) % n;
        return result;
    }

    public static void main(String[] args) {
        CircularQueue queue = new CircularQueue(5);
        queue.enqueue("a");
        queue.enqueue("b");
        queue.enqueue("c");
        queue.enqueue("d");
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
    }
}
