public class Main {
    public static void main(String[] args) {
        MyStack<String> stack = new MyStack<>();

        stack.push("First");
        stack.push("Second");
        stack.push("Third");

        System.out.println("Stack size: " + stack.size());
        System.out.println("Peek: " + stack.peek());
        System.out.println("Pop: " + stack.pop());
        System.out.println("Stack size after pop: " + stack.size());

        stack.remove(0);
        System.out.println("Stack size after remove: " + stack.size());

        stack.clear();
        System.out.println("Stack size after clearing: " + stack.size());
    }
}
