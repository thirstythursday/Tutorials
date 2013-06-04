package classes_and_objects;

public class HelloWorldAnonymousClasses {
    
    interface HelloWorld {
        public void greet();
        public void greetSomeone(String someone);
    }
    
    public void sayHello() {
        
        
        // explicitly create an inner class EnglishGreeting
        class EnglishGreeting implements HelloWorld {
            String name = "world";
            public void greet() {
                greetSomeone("world");
            }

            public void greetSomeone(String someone) {
                name = someone;
                System.out.println("Hello, " + name);
            }
        }
        
        // instantiate it
        HelloWorld englishGreeting = new EnglishGreeting();
        
        /*
         * frenchGreeting is done with an anonymous (inner) class. Created at
         * the same time it is instantiated.
         * The anonymous class expression is part of the statement that
         * instantiates the frenchGreeting object.
         * It has a new operator, the name of the interface to implement or
         * class to extend, parenthesis for constructor.
         */
        HelloWorld frenchGreeting = new HelloWorld() {
            String name = "tout le monde";
            public void greet() {
                greetSomeone("tout le monde");
            }

            public void greetSomeone(String someone) {
                name = someone;
                System.out.println("Salut, " + name);
            }
        }; // THe semicolon because we are just finishing the statement.
        
        HelloWorld spanishGreeting = new HelloWorld() {
            String name = "mundo";
            public void greet() {
                greetSomeone("mundo");
            }

            public void greetSomeone(String someone) {
                name = someone;
                System.out.println("Hola, " + name);
            }
        };
        
        englishGreeting.greet();
        frenchGreeting.greetSomeone("Fred");
        spanishGreeting.greet();
        
    }
    
    public static void main(String... args) {
        HelloWorldAnonymousClasses myApp = new HelloWorldAnonymousClasses();
        myApp.sayHello();
        
    }
    
}
