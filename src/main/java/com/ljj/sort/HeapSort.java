/**
 * 文件名称:          		HeapSort.java
 * 版权所有@ 2017-2018 	liangjinjing
 * 编译器:           		JDK1.8
 */

package com.ljj.sort;

/**
 * 堆排序 分类 -------------- 内部比较排 数据结构 ---------- 数组 最差时间复杂度 ---- O(nlogn) 最优时间复杂度 ---- O(nlogn) 平均时间复杂度 ---- O(nlogn)
 * 所需辅助空间 ------ O(1) 稳定性 ------------ 不稳定
 * 
 * Version 1.0.0
 * 
 * @author liangjinjing
 * 
 * Date 2018-10-16 17:50
 * 
 */
public class HeapSort extends AbstractSort {

    @ Override
    public void doSort(int[] a) {
        int heap_size = buildHeap(a, a.length);
        while (heap_size > 1)
        {
            // 将堆顶元素与堆的最后一个元素互换，并从堆中去掉最后一个元素
            // 此处交换操作很有可能把后面元素的稳定性打乱，所以堆排序是不稳定的排序算法
            SortKit.instance().swap(a, 0, --heap_size);
            // 从新的堆顶元素开始向下进行堆调整，时间复杂度O(logn)
            heapify(a, 0, heap_size);
        }

    }

    /**
     * 
     * @param a
     * @param i
     * @param size
     */
    private void heapify(int a[], int i, int size) {
        int left_child = 2 * i + 1; // 左孩子索引
        int right_child = 2 * i + 2; // 右孩子索引
        int max = i; // 选出当前结点与其左右孩子三者之中的最大值
        if (left_child < size && a[left_child] > a[max])
            max = left_child;
        if (right_child < size && a[right_child] > a[max])
            max = right_child;
        if (max != i) {
            SortKit.instance().swap(a, i, max);
            heapify(a, max, size);
        }
    }

    /**
     * 
     * @param A
     * @param n
     * @return
     */
    private int buildHeap(int a[], int n) {
        int heap_size = n;
        for (int i = heap_size / 2 - 1; i >= 0; i--) {
            heapify(a, i, heap_size);
        }
        return heap_size;
    }
}
