public class FinalPractice {
    public static void main(String[] args) {
        // Feel free to call your methods here to experiment

        // YOU MUST ALSO MAKE THOROUGH TESTS FOR EVERY METHOD 
    }

    /**
     * Return the sum of the values at odd indexes in a linked list.
     * 
     * Assumes head is at index 0.
     * 
     * If passed a null head, returns 0.
     * 
     * @param head the head of the linked list
     * @return the sum of the values at odd indexes
     */
    public static int oddIndexSum(ListNode head) {
        // TODO: implement this AND MAKE MORE UNIT TESTS FOR IT
        int sum = 0;
        int index = 0;

        while (head != null) {
            if (index % 2 == 1) {
                sum += head.data;
            }

            head = head.next;
            index++;
        }

        return sum;
    }

    // TODO: implement the rest of the study guide AND MAKE GOOD UNIT TESTS

    public static int largestLast3(ListNode head) {
        int count = 0;
        ListNode curr = head;

        while (curr != null) {
            count++;
            curr = curr.next;
        }

        int start = count - 3;
        int index = 0;
        int max = Integer.MIN_VALUE;

        curr = head;
        while (curr != null) {
            if (index >= start) {
                max = Math.max(max, curr.data);
            }
            curr = curr.next;
            index++;
        }

        return max;
    }

    public static int sumEvenLeafNodes(TreeNode root) {
        if (root == null) {
            return 0;
        }

        if (root.left == null && root.right == null) {
            if (root.data % 2 == 0) {
                return root.data;
            } else {
                return 0;
            }
        }
        
        return sumEvenLeafNodes(root.left) + sumEvenLeafNodes(root.right);
    }
}
