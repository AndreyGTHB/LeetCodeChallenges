package tag.explore.leetcode.ordinary

class TwoSum1 {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        val targetMap = HashMap<Int, Int>()
        for (i in nums.indices) {
            val diff = target - nums[i]
            if (targetMap[nums[i]] != null) return intArrayOf(targetMap[nums[i]]!!, i)
            targetMap[diff] = targetMap[diff] ?: i
        }
        return intArrayOf(-1, -1)
    }
}