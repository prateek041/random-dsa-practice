// every file that ends with .java is a class itself
public class Main{
    // public is a part of access modifiers and it signifies that the data in this file can be accessed from anywhere outside.

    // class means named group of functions and properties.
    public static void main(String [] args) {
        // we use static here because this main function needs to be run without object creation.
        // void is the return type.
        // string [] args are the command line arguments. i.e whatever arguments you are giving in command line, they will be stored in that 
        // array.
        
        System.out.println(args[1]);
    }

}