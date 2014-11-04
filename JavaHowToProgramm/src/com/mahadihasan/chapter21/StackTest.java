package com.mahadihasan.chapter21;

/**
 *
 * @author MAHADI HASAN NAHID
 */
public class StackTest {

    public static void main(String[] args) {

        double[] doubleElements = {1.1, 2.2, 3.3, 4.4, 5.5};
        int[] integerElements = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        Stack<Double> doubleStack = new Stack<Double>(5);
        Stack<Integer> integerStack = new Stack<Integer>();

        testPushDouble(doubleStack, doubleElements);
        testPopDouble(doubleStack);

        testPushInteger(integerStack, integerElements);
        testPopInteger(integerStack);



    }

    private static void testPushDouble(Stack<Double> stack,
            double[] values) {

        System.out.println("\nPushing elements onto doubleStack");

        for (double value : values) {
            System.out.printf("%.1f ", value);
            stack.push(value);
        }
    }

    private static void testPopDouble(Stack<Double> stack) {

        try {

            System.out.println("\nPoping elements from doubleStack");
            double popValue;

            while (true) {
                popValue = stack.pop();
                System.out.printf("%.1f ", popValue);
            }
        } catch (EmptyStackException e) {

            System.out.println();
        }

    }

    private static void testPushInteger(Stack<Integer> stack,
            int[] values) {

        System.out.println("\nPushing element onto integerStack");


        for (int value : values) {
            System.out.print("" + value + " ");
            stack.push(value);
        }
    }

    private static void testPopInteger(Stack<Integer> stack) {
        try {
            System.out.println("\nPoping elements from integerStack");
            int popvalue;


            while (true) {
                popvalue = stack.pop();

                System.out.print("" + popvalue + " ");

            }
        } catch (EmptyStackException e) {

            System.out.println();
        }
    }
}
