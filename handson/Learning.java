import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.NotActiveException;
import java.util.EmptyStackException;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Properties;

public class Learning {
    public static void main(String[] args) {

    }
}

class ArrayStack {
    private String[] stack;
    private int top;

    public ArrayStack(int capacity) {
        stack = new String[capacity];
    }

    public void push(String str) {
        if (top == stack.length) {
            String[] newArray = new String[2 * stack.length];
            System.arraycopy(stack, 0, newArray, 0, stack.length);
            stack = newArray;
        }
        stack[top++] = str;
    }

    public String pop() throws EmptyStackException {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        String str = stack[--top];
        stack[top] = null;
        return str;
    }

    public boolean isEmpty() {
        return top == 0;
    }
}

class StackLinkedList {
    private LinkedList<String> stack;

    public StackLinkedList() {
        stack = new LinkedList<String>();
    }

    public void push(String str) {
        stack.push(str);
    }

    public String pop() {
        return stack.pop();
    }

    public String peek() {
        return stack.peek();
    }

    public boolean isEmpty() {
        return stack.isEmpty();
    }

    public void printStack() {
        ListIterator<String> iterator = stack.listIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}

class Main {

    public static void main(String[] args) {
        // should return true
        System.out.println(checkForPalindrome("abccba"));
        // should return true
        System.out.println(checkForPalindrome("Was it a car or a cat I saw?"));
        // should return true
        System.out.println(checkForPalindrome("I did, did I?"));
        // should return false
        System.out.println(checkForPalindrome("hello"));
        // should return true
        System.out.println(checkForPalindrome("Don't nod"));
    }

    public static boolean checkForPalindrome(String string) {
        LinkedList<Character> stack = new LinkedList<>();
        StringBuilder noPunctuation = new StringBuilder(string.length());
        for (int i = 0; i < string.length(); i++) {
            char c = string.charAt(i);
            c = Character.toLowerCase(c);
            if (c >= 'a' && c <= 'z') {
                noPunctuation.append(c);
                stack.push(c);
            }
        }
        StringBuilder reversedString = new StringBuilder();
        while (!stack.isEmpty()) {
            reversedString.append(stack.pop());
        }
        if (reversedString.toString().equals(noPunctuation.toString()))
            return true;
        return false;
    }
}

class Queue {
    private String[] queue;
    private int front = 0;
    private int back = 0;

    public Queue(int capacity) {
        queue = new String[capacity];
    }

    public void add(String str) {
        if (back == queue.length) {
            String[] newArray = new String[2 * queue.length];
            System.arraycopy(queue, 0, newArray, 0, queue.length);
            queue = newArray;
        }
        queue[back++] = str;
    }

    public String remove() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        String removed = queue[front++];
        queue[front - 1] = null;
        return removed;
    }

    public String peek() {
        return queue[front];
    }

    public boolean isEmpty() {
        if (front == back)
            return true;
        return false;
    }

    public void printQueue() {
        int i = front;
        while (i < back) {
            System.out.println(queue[i++]);
        }
    }

    public static void main(String[] args) {
        Queue queue = new Queue(10);
        queue.add("Jones");
        queue.add("Joana");
        queue.add("Bill");
        queue.add("Vic");
        // queue.printQueue();
        queue.remove();
        // queue.printQueue();
        System.out.println(queue.peek());
    }
}

class ErrorStream {
    public static void main(String[] args) {
        int i = 0;
        try {
            int a = 234 / i;
        } catch (Exception e) {
            System.err.println("Arithmetic exception");
        }
    }
}

class getProperties {
    public static void main(String[] args) {
        Properties x = System.getProperties();
        System.out.println(x.getProperty("os.name"));
        // x.list(System.out);
    }
}

class CopyFile {

    public static void main(String args[]) throws IOException {
        FileReader in = null;
        FileWriter out = null;

        try {
            in = new FileReader("input.txt");
            out = new FileWriter("output.txt");

            int c;
            while ((c = in.read()) != -1) {
                out.write(c);
            }
        } finally {
            if (in != null) {
                in.close();
            }
            if (out != null) {
                out.close();
            }
        }
    }
}

class WrapperClass {
    public static void main(String args[]) {
        double d = 100.675;
        double e = 100.500;
        double f = 100.200;

        System.out.println((int) Math.rint(d));
        System.out.println((int) Math.rint(e));
        System.out.println(Math.rint(f));
    }
}