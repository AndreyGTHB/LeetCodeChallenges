package tag.explore.leetcode.topInterviewQuestions.easy.array.removeDuplicatesFromSortedArray


fun main() {
    val numsArr = intArrayOf(1, 1, 2, 3, 3, 3, 4, 9, 13)
    println("${removeDuplicates(numsArr)} - $numsArr.toStr(")
}


fun removeDuplicates(nums: IntArray): Int {
    var k = 0
    for (i in nums.indices) {
        if (i == 0 || nums[i] != nums[i-1]) {
            nums[k] = nums[i]
            k++
        }
    }
    return k
}
