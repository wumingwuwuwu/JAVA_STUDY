package wofuhuola.jinjie.List.LISTlist;

import java.util.LinkedList;

public class LinkedListStack {
    public static void main(String[] args) {
        // 使用 LinkedList 模拟栈
        LinkedList<String> stack = new LinkedList<>();

        // 1. 入栈（push）
        // addFirst(e);
        stack.push("Java");
        stack.push("Python");
        stack.push("C++");

        System.out.println("当前栈内容: " + stack); // [C++, Python, Java]

        // 2. 查看栈顶元素（peek）
        String topElement = stack.peek();
        System.out.println("栈顶元素: " + topElement); // C++

        // 3. 出栈（pop）
        // return removeFirst();
        String poppedElement = stack.pop();
        System.out.println("弹出的元素: " + poppedElement); // C++
        System.out.println("弹出后的栈: " + stack); // [Python, Java]

        // 4. 判断栈是否为空
        System.out.println("栈是否为空: " + stack.isEmpty()); // false

        // 5. 继续弹出所有元素
        while (!stack.isEmpty()) {
            System.out.println("弹出: " + stack.pop());
        }
        System.out.println("最终栈是否为空: " + stack.isEmpty()); // true
    }
}
