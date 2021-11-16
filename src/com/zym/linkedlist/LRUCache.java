package com.zym.linkedlist;

/**
 * solution146 最近最少使用策略
 * @author zhouyumeng
 * @date 2021/09/27
 **/
public class LRUCache {

    public static void main(String[] args) {

    }

    private int len;

    private ListNode head;

    private ListNode curr;

    public LRUCache(int capacity) {
        if (capacity <= 0) {
            this.len = 5;
        } else {
            this.len = capacity;
        }
    }

    public int get(int key) {
        return 0;
    }

    public void put(int key, int value) {
        ListNode node = new ListNode(value);

    }

}
