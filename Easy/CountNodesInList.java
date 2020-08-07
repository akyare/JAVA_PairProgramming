package be.intecbrussel.Easy;

public class CountNodesInList {

    public Integer count(ListNode node) {

        int count = 0;
        ListNode current = node;

        while (current != null){
            count++;
            current = current.next();
        }
        return count;
    }
}
