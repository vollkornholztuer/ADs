package uebung06.list.linkedvariant1;

import uebung06.list.ADsList;

public class ADsLinkedList implements ADsList {

    private ADsListNode head;

    public ADsLinkedList() {
        // intentionally left blank
    }

    public ADsLinkedList(Object... elements) {
        ADsListNode node = null;
        for (int i = 0; i < elements.length; i++) {
            if (i == 0) {
                head = new ADsListNode(elements[i]);
                node = head;
            } else {
                ADsListNode next = new ADsListNode(elements[i]);
                node.next = next;
                node = next;
            }
        }
    }

    @Override
    public int size() {
        int count = 0;
        ADsListNode node = head.next;
        while (node != null) {
            count++;
            node = node.next;
        }
        return count;
    }

    @Override
    public void insert(int pos, Object elem) {

        if (pos == 0) {
            if (head == null) {
                head = new ADsListNode(elem);
            } else {
                ADsListNode node = new ADsListNode(elem);
                node.next = head;
                head = node;
            }
        } else if (pos > 0) {
            ADsListNode iterator = head;
            int count = 0;
            while ((count != pos - 1) && (iterator != null)) {
                count++;
                iterator = iterator.next;
            }
            if (iterator != null) {
                ADsListNode node = new ADsListNode(elem);
                node.next = iterator.next;
                iterator.next = node;
            } else {
                ; // Error: pos > number of elements: invalid position
            }
        } else {
            ; // Error: pos < 0: invalid position
        }

    }

    @Override
    public void remove(int pos) {

    }

    @Override
    public Object elementAt(int pos) {
        return null;
    }

    @Override
    public int find(Object element) {

        return 0;
    }

    @Override
    public boolean isEmpty() {

        return false;
    }
}
