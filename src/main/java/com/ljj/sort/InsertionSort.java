/**
 * 文件名称:          		InsertionSort.java
 * 版权所有@ 2017-2018 	liangjinjing
 * 编译器:           		JDK1.8
 */

package com.ljj.sort;

/**
 * 分类 ------------- 内部比较排序
 * 数据结构 ---------- 数组
 * 最差时间复杂度 ---- 最坏情况为输入序列是降序排列的,此时时间复杂度O(n^2)
 * 最优时间复杂度 ---- 最好情况为输入序列是升序排列的,此时时间复杂度O(n)
 * 平均时间复杂度 ---- O(n^2)
 * 所需辅助空间 ------ O(1)
 * 稳定性 ------------ 稳定
 * 
 * Version		1.0.0      
 * 
 * @author		liangjinjing
 * 
 * Date			2018-10-16 15:11
 * 
 */
public class InsertionSort extends AbstractSort {

    @ Override
    public void doSort(int[] a) {
        for (int i = 1; i < a.length; i++) {
            int k = a[i];
            int j = i - 1;
            while (j >= 0 && a[j] > k){
                a[j + 1] = a[j];
                j--;
            }
            a[j + 1] = k;
        }
        
    }

}
