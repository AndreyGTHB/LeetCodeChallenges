package tag.explore.leetcode.ordinary

class AddTwoNumbers2 {
    fun addTwoNumbers(l1: ListNode?, l2: ListNode?) {
        val head = ListNode(0, null)
        var curr1 = l1
        var curr2 = l2
        var curr3 = head
        while (curr1 != null || curr2 != null) {
            curr3.`val` = (curr1?.`val` ?: 0) + (curr2?.`val` ?: 0)
        }
    }

    class ListNode(
        var `val`: Int,
        var next: ListNode?
    )
}
