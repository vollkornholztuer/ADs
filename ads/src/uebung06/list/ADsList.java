package uebung06.list;

public interface ADsList {
	int size();

	void insert(int pos, Object element);

	void remove(int pos);

	Object elementAt(int pos);

	int find(Object element);

	boolean isEmpty();
}
