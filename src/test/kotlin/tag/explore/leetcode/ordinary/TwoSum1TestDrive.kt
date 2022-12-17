package tag.explore.leetcode.ordinary
import kotlin.test.Test
import kotlin.test.assertContentEquals

class TwoSum1TestDrive {
    val testSample = TwoSum1()
    @Test
    fun test() {
        val actual = testSample.twoSum(intArrayOf(3, 2, 4), 6)
        val expected = intArrayOf(1, 2)
        assertContentEquals(expected, actual)
    }
}
