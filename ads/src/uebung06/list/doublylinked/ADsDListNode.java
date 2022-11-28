package uebung06.list.doublylinked;

public class ADsDListNode {
	ADsDListNode next;
	ADsDListNode previous;

	// die zu speichernden Daten
	Object element;

	ADsDListNode(Object element) {
		this.element = element;
	}
}
