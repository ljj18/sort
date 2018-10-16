/**
 * 文件名称:          		QuickSort.java
 * 版权所有@ 2017-2018 	liangjinjing
 * 编译器:           		JDK1.8
 */

package com.ljj.sort;

/**
 * 快速排序 分类 ------------ 内部比较排序 数据结构 --------- 数组 最差时间复杂度 ----
 * 每次选取的基准都是最大（或最小）的元素，导致每次只划分出了一个分区，需要进行n-1次划分才能结束递归，时间复杂度为O(n^2) 最优时间复杂度 ----
 * 每次选取的基准都是中位数，这样每次都均匀的划分出两个分区，只需要logn次划分就能结束递归，时间复杂度为O(nlogn) 平均时间复杂度 ---- O(nlogn) 所需辅助空间 ------
 * 主要是递归造成的栈空间的使用(用来保存left和right等局部变量)，取决于递归树的深度，一般为O(logn)，最差为O(n) 稳定性 ---------- 不稳定
 * 
 * Version 1.0.0
 * 
 * @author liangjinjing
 * 
 * Date 2018-10-16 18:03
 * 
 */
public class QuickSort extends AbstractSort {

    @ Override
    public void doSort(int[] a) {
        quickSort(a, 0, a.length - 1);
    }

    
    /**
     * 
     * @param a
     * @param left
     * @param right
     */
    private void quickSort(int a[], int left, int right) {
        if (left >= right) {
            return;
        }
        // 基准的索引
        int pivot_index = partition(a, left, right);
        quickSort(a, left, pivot_index - 1);
        quickSort(a, pivot_index + 1, right);
    }

    /**
     * 划分函数
     * 
     * @param a
     * @param left
     * @param right
     * @return
     */
    private int partition(int a[], int left, int right) {
        // 这里每次都选择最后一个元素作为基准
        int pivot = a[right];
        // tail为小于基准的子数组最后一个元素的索引
        int tail = left - 1;
        // 遍历基准以外的其他元素
        for (int i = left; i < right; i++) {
            // 把小于等于基准的元素放到前一个子数组末尾
            if (a[i] <= pivot) {
                SortKit.instance().swap(a, ++tail, i);
            }
        }
        // 最后把基准放到前一个子数组的后边，剩下的子数组既是大于基准的子数组
        SortKit.instance().swap(a, tail + 1, right);
        // 该操作很有可能把后面元素的稳定性打乱，所以快速排序是不稳定的排序算法。返回基准的索引
        return tail + 1;
    }
}
