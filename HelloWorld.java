public class HelloWorld {

    public static void main(String[] args) {
        // Prints "Hello, World" to the terminal window.
        System.out.println("Hello, World");

        int a, b;
        double c;

        a = 5;
        b = 2;

        a++; //the same as a = a + 1;
        
        a += 3;//same as a = a + 2;
        c = ((double) a)/b;

        System.out.println(c++);
        System.out.println(++c);
    }

}
