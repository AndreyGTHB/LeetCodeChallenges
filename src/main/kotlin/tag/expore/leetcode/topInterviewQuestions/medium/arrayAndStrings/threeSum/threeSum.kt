package tag.expore.leetcode.topInterviewQuestions.medium.arrayAndStrings.threeSum
import tag.expore.leetcode.toStr


fun main() {
    val nums = intArrayOf(-1,0,1,2,-1,-4)
    val result = threeSum(nums)
    result.forEach { println(it.toStr()) }
}


fun threeSum(nums: IntArray): List<IntArray> {
    val triplets: MutableList<IntArray> = mutableListOf()
    for (iFirst in nums.indices) {
        for (iSec in iFirst+1 until nums.size) {
            for (iThird in iSec+1 until nums.size) {
                if (nums[iFirst] + nums[iSec] + nums[iThird] == 0) {
                    triplets.add(intArrayOf(nums[iFirst], nums[iSec], nums[iThird]))
                }
            }
        }
    }
    return triplets
}
