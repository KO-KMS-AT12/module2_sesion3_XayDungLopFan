package Main;

import Fan.Fan;

public class Main {
    public static void main(String[] args) {
        Fan fan1 = new Fan();
        Fan fan2 = new Fan(Fan.getFAST(), true, 10, "Red");
        fan1.toString();
        System.out.println();
        fan2.toString();
    }
}
