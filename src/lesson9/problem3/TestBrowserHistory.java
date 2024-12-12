package lesson9.problem3;

import java.util.Stack;

public class TestBrowserHistory {
    String home;
    private Stack<String> stack = new Stack<>();
    private Stack<String> stack2 = new Stack<>();;

    public  TestBrowserHistory(String home) {
        this.home = home;
        this.stack.push(home);
    }


    public String visited(String visit) {
        this.stack.push(visit);
        return visit;
    }

    public String back() {
        if(!this.stack.isEmpty())
        this.stack2.push(this.stack.pop());
        if(this.stack.isEmpty())
            return "No History in the browser";
        return "Back to "+this.stack.peek();
    }

    public String forward() {
        if(!this.stack2.isEmpty())
            this.stack.push(this.stack2.pop());
        if(stack2.isEmpty())
            return "No History in the browser";

        return "Forward to " + this.stack2.peek();
    }

    public static void main(String[] args) {
        TestBrowserHistory testBrowserHistory = new TestBrowserHistory("Home page");
        System.out.println(testBrowserHistory.visited("page 1"));
        System.out.println(testBrowserHistory.visited("page 2"));
        System.out.println(testBrowserHistory.back());
        System.out.println(testBrowserHistory.back());
        System.out.println(testBrowserHistory.back());
        System.out.println(testBrowserHistory.forward());
        System.out.println(testBrowserHistory.forward());
        System.out.println(testBrowserHistory.forward());
        System.out.println(testBrowserHistory.visited("page 3"));

    }
}

