import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

import org.junit.jupiter.api.Test;

public class FinalPracticeTest {
    @Test
    void testOddIndexSum_oddLengthList() {
        ListNode list = new ListNode(4, new ListNode(8, new ListNode(15, new ListNode(16, new ListNode(23, new ListNode(42, new ListNode(11, new ListNode(29, new ListNode(34)))))))));
        int actual = FinalPractice.oddIndexSum(list);
        assertEquals(95, actual);
    }

    // TODO: Make more tests for oddIndexSum

    //oddIndexSum
    @Test
    void testOddIndexSum_nullList() {
        assertEquals(0, FinalPractice.oddIndexSum(null));
    }

    @Test
    void testOddIndexSum_oneNode() {
        ListNode list = new ListNode(10);
        assertEquals(0, FinalPractice.oddIndexSum(list));
    }

    @Test
    void testOddIndexSum_twoNodes() {
        ListNode list = new ListNode(5, new ListNode(7));
        assertEquals(7, FinalPractice.oddIndexSum(list));
    }

    // TODO: Make thorough tests for ALL the questions on the study guide

    //largestLast3
    @Test
    void testLargestLast3_exactlyThreeNodes() {
        ListNode list = new ListNode(8,
                new ListNode(3,
                new ListNode(6)));

        assertEquals(8, FinalPractice.largestLast3(list));
    }

    @Test
    void testLargestLast3_withNegatives() {
        ListNode list = new ListNode(-10, 
                new ListNode(-3,
                new ListNode(-7,
                new ListNode(-2))));

        assertEquals(-2, FinalPractice.largestLast3(list));
    }

    @Test
    void testLargestLast3_middleOfLast3IsLargest() {
        ListNode list = new ListNode(10,
                new ListNode(20,
                new ListNode(5,
                new ListNode(99,
                new ListNode(7)))));

        assertEquals(99, FinalPractice.largestLast3(list));
    }

    //sumEvenLeafNodes
    @Test
    public void sumEvenLeafNodes_AllOddLeaves() {
        TreeNode root =new TreeNode(10,
                new TreeNode(3),
                new TreeNode(5));

        assertEquals(0, FinalPractice.sumEvenLeafNodes( root));
    }

    @Test
    public void sumEvenLeafNodes_NullTree() {
        assertEquals(0, FinalPractice.sumEvenLeafNodes(null));
    }

    @Test
    public void sumEvenLeafNodes_SingleEvenLeaf() {
        TreeNode root = new TreeNode(8);
        assertEquals(8, FinalPractice.sumEvenLeafNodes(root));
    }

    //sumOddBranchNodes
    @Test
    public void sumOddBranchNodes_SingleNodeEven() {
        TreeNode root = new TreeNode(8);

        assertEquals(0, FinalPractice.sumOddBranchNodes(root));
    }

    @Test
    public void sumOddBranchNodes_OneOddBranch() {
        TreeNode root =
            new TreeNode(7,
                new TreeNode(4),
                null);

        assertEquals(7, FinalPractice.sumOddBranchNodes(root));
    }

    @Test
    public void sumOddBranchNodes_AllEvenBranches() {
        TreeNode root =
            new TreeNode(10,
                new TreeNode(8,
                    new TreeNode(1),
                    new TreeNode(2)),
                new TreeNode(6));

        assertEquals(0, FinalPractice.sumOddBranchNodes(root));
    }

    //countOccurrences

    @Test
    public void countOccurrences_NullList() {
        Map<Integer, Integer> expected = new HashMap<>();

        assertEquals(expected, FinalPractice.countOccurrences(null));
    }

    @Test
    public void countOccurrences_OneNode() {
        ListNode head = new ListNode(7);

        Map<Integer, Integer> expected = new HashMap<>();
        expected.put(7, 1);

        assertEquals(expected, FinalPractice.countOccurrences(head));
    }
    @Test
    public void countOccurrences_AllSame() {
        ListNode head =
            new ListNode(5,
            new ListNode(5,
            new ListNode(5)));

        Map<Integer, Integer> expected = new HashMap<>();
        expected.put(5, 3);

        assertEquals(expected, FinalPractice.countOccurrences(head));
    }
}