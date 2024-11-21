package java_labs.Lab6.ex2;

public class Main {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>(10);

        stack.push("fl4mus");
        stack.push("electronic");
        stack.push("nafany");

        System.out.println(stack.pop());
        System.out.println(stack.peek());

        stack.push("icy");
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.isEmpty());
    }
}