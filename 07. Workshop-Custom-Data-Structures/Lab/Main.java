package Lab;

public class Main {
    public static void main(String[] args) {

//        Lab.SmartArray smartArray = new Lab.SmartArray();
//
//        smartArray.add(1);
//        smartArray.add(2);
//        smartArray.add(3);
//        smartArray.add(4);
//        smartArray.add(5);
//
//        smartArray.remove(0);
//        smartArray.remove(1);
//        smartArray.remove(2);
//
//        smartArray.add(0, 27);
//        smartArray.add(2, 27);
//
//        smartArray.add(90);
//
//        smartArray.add(5, 100);
//
//        System.out.println();
//
//        System.out.println(smartArray.contains(2));
//        System.out.println(smartArray.contains(22));
//
//        smartArray.forEach(e -> System.out.println(e));

        CustomStack customStack = new CustomStack();

        customStack.push(1);
        customStack.push(2);
        customStack.push(3);

        System.out.println();

        System.out.println(customStack.peek());

        customStack.push(4);

        System.out.println(customStack.peek());

        customStack.pop();

        System.out.println(customStack.peek());

        customStack.forEach(e -> System.out.println(e));
        customStack.pop();
        customStack.pop();
        customStack.pop();
        customStack.pop();






    }
}
