package com.cipher.algorithm.line;

import static com.cipher.algorithm.line.SortTestHelper.*;

/**
 * 冒泡排序 O(n*n)
 * 循环 n 趟，每一趟依次比较每个元素与下一个元素的大小，把最大的元素“沉”到最后
 * Created by cipher on 2017/9/12.
 */
public class BubbleSort {

    public static void sort(Comparable[] data) {
        int n = data.length;
        // 循环 n 趟
        for (int i = 0; i < data.length; i++) {
            // 每一趟，下标从 1 开始递增，依次与前一个元素比较大小，大的交换到后面
            for (int j = 1; j < n; j++) {
                if (data[j - 1].compareTo(data[j]) > 0) {
                    swap(data, j - 1, j);
                }
            }
            // 结束一趟后，最大的元素后沉到最后，因此下次循环不需再比较此元素
            n--;
        }
    }

    public static void main(String[] args) {
        Integer[] data = generateRandomArray(100, 1, 100);
        printArray(data);
        sort(data);
        System.out.println(isSorted(data));
        printArray(data);
    }

}