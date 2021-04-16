/* Copyright 2020 Beijing Calorie Information Technology Co. Ltd. */
/* 版权所有 2020 北京卡路里信息技术有限公司 */
package doublepoint;

/**
 * RemoveDuplicatesFromSortedArray
 *
 * @author zhangkai
 * @date 2021/3/17 1:51 下午
 * @since 1.0.0
 * 给你一个有序数组 nums ，请你 原地 删除重复出现的元素，使每个元素 只出现一次 ，返回删除后数组的新长度。
 * <p>
 * 不要使用额外的数组空间，你必须在 原地 修改输入数组 并在使用 O(1) 额外空间的条件下完成。
 * <p>
 *  
 * <p>
 * 说明:
 * <p>
 * 为什么返回数值是整数，但输出的答案是数组呢?
 * <p>
 * 请注意，输入数组是以「引用」方式传递的，这意味着在函数里修改输入数组对于调用者是可见的。
 * <p>
 * 你可以想象内部操作如下:
 * <p>
 * // nums 是以“引用”方式传递的。也就是说，不对实参做任何拷贝
 * int len = removeDuplicates(nums);
 * <p>
 * // 在函数里修改输入数组对于调用者是可见的。
 * // 根据你的函数返回的长度, 它会打印出数组中 该长度范围内 的所有元素。
 * for (int i = 0; i < len; i++) {
 *     print(nums[i]);
 * }
 *  
 * 示例 1：
 * <p>
 * 输入：nums = [1,1,2]
 * 输出：2, nums = [1,2]
 * 解释：函数应该返回新的长度 2 ，并且原数组 nums 的前两个元素被修改为 1, 2 。不需要考虑数组中超出新长度后面的元素。
 * 示例 2：
 * <p>
 * 输入：nums = [0,0,1,1,1,2,2,3,3,4]
 * 输出：5, nums = [0,1,2,3,4]
 * 解释：函数应该返回新的长度 5 ， 并且原数组 nums 的前五个元素被修改为 0, 1, 2, 3, 4 。不需要考虑数组中超出新长度后面的元素。
 *  
 * <p>
 * 提示：
 * <p>
 * 0 <= nums.length <= 3 * 104
 * -104 <= nums[i] <= 104
 * nums 已按升序排列
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/remove-duplicates-from-sorted-array
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class RemoveDuplicatesFromSortedArray {

    int[] nums = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};

    public int removeDuplicates(int[] nums) {
        // 慢指针
        int p = 0;
        // 快指针
        int q = 1;
        while (q < nums.length) {
            if (nums[p] != nums[q]) {
                //不重复
                //慢指针前进
                nums[p + 1] = nums[q];
                p++;
            }
            //快指针前进
            q++;
        }
        return p + 1;
    }

    public static void main(String[] args) {
        RemoveDuplicatesFromSortedArray instance = new RemoveDuplicatesFromSortedArray();
        int length = instance.removeDuplicates(instance.nums);
        for (int i = 0; i< length; i++) {
            System.out.println(instance.nums[i]);
        }
    }
}
