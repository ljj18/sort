/**
 * 文件名称:          		InsertionSortDichotomy.java
 * 版权所有@ 2017-2018 	liangjinjing
 * 编译器:           		JDK1.8
 */

package com.ljj.sort;

/**
 * 二分插入排序 
 * 分类 -------------- 内部比较排序
 * 数据结构 ---------- 数组
 * 最差时间复杂度 ---- O(n^2)
 * 最优时间复杂度 ---- O(nlogn)
 * 平均时间复杂度 ---- O(n^2)
 * 所需辅助空间 ------ O(1)
 * 稳定性 ------------ 稳定
 * 
 * Version 1.0.0
 * 
 * @author liangjinjing
 * 
 * Date 2018-10-16 15:27
 * 
 */
public class InsertionSortDichotomy extends AbstractSort {

    @ Override
    public void doSort(int[] a) {
        for (int i = 1; i < a.length; i++) {
            int k = a[i]; 
            int left = 0; 
            int right = i - 1; 
            while (left <= right) 
            {
                int mid = (left + right) / 2;
                if (a[mid] > k)
                    right = mid - 1;
                else
                    left = mid + 1;
            }
            for (int j = i - 1; j >= left; j--) 
            {
                a[j + 1] = a[j];
            }
            a[left] = k; 
        }

    }

}
