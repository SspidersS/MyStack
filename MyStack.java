class MyStack<E> {
    private static class Node<E> {
        E value;
        Node<E> next;

        Node(E value, Node<E> next) {
            this.value = value;
            this.next = next;
        }
    }

    private Node<E> top;
    private int size;

    public MyStack() {
        top = null;
        size = 0;
    }

    public void push(E value) {
        top  = new Node<>(value, top);
        size++;
    }

    public E remove(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
        if (index == 0) {
            return pop();
        }
        Node<E> current = top;
        for (int i = 0; i < index - 1; i++) {
            current = current.next;
        }
        E removedValue = current.next.value;
        current.next = current.next.next;
        size--;
        return removedValue;
    }

    public void clear() {
        top = null;
        size = 0;
    }

    public int size() {
        return size;
    }

    public E peek() {
        if (top == null) {
            return null;
        }
        return top.value;
    }

    public E pop() {
        if (top == null) {
            return null;
        }
        E value = top.value;
        top = top.next;
        size--;
        return value;
    }
}
