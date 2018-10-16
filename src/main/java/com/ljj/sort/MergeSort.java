/**
 * 文件名称:          		MergeSort.java
 * 版权所有@ 2017-2018 	liangjinjing
 * 编译器:           		JDK1.8
 */

package com.ljj.sort;

/**
 * 归并排序 分类 -------------- 内部比较排序 数据结构 ---------- 数组 最差时间复杂度 ---- O(nlogn) 最优时间复杂度 ---- O(nlogn) 平均时间复杂度 ---- O(nlogn)
 * 所需辅助空间 ------ O(n) 稳定性 ------------ 稳定
 * 
 * Version 1.0.0
 * 
 * @author liangjinjing
 * 
 * Date 2018-10-16 16:14
 * 
 */
public class MergeSort extends AbstractSort {

    @ Override
    public void doSort(int[] a) {
        mergeSortRecursion(a, 0, a.length - 1);
    }

    /**
     * 递归实现的归并排序(自顶向下)
     * 
     * @param A
     * @param left
     * @param right
     */
    private void mergeSortRecursion(int a[], int left, int right) {
        
        if (left == right) {
            return;
        }
        int mid = (left + right) / 2;
        mergeSortRecursion(a, left, mid);
        mergeSortRecursion(a, mid + 1, right);
        merge(a, left, mid, right);
    }

    /**
     * (迭代)实现的归并排序
     * 
     * @param A
     * @param len
     */
    @ SuppressWarnings("unused")
    private void mergeSortIteration(int a[]) {
        int left, mid, right;
        int len = a.length;
        for (int i = 1; i < len; i *= 2)
        {
            left = 0;
            while (left + i < len)
            {
                mid = left + i - 1;
                right = mid + i < len ? mid + i : len - 1;
                merge(a, left, mid, right);
                left = right + 1;
            }
        }
    }

    /**
     * 合并两个已排好序的数组A[left...mid]和A[mid+1...right]
     * 
     * @param a
     * @param left
     * @param mid
     * @param right
     */
    private void merge(int a[], int left, int mid, int right) {
        System.out.println("left = " + left + ", mid = " + mid + ", right = " + right);
        int len = right - left + 1;
        int[] temp = new int[len];
        int index = 0;
        int i = left;
        int j = mid + 1;
        while (i <= mid && j <= right) {
            temp[index++] = a[i] <= a[j] ? a[i++] : a[j++];
        }
        while (i <= mid) {
            temp[index++] = a[i++];
        }
        while (j <= right) {
            temp[index++] = a[j++];
        }
        for (int k = 0; k < len; k++) {
            a[left++] = temp[k];
        }
    }
}
