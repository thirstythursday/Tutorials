package georgeoross;

public class InterfaceCollision {
    
    public static void main(String[] args) {
        
    }
    
    interface Interface1 { void f(); }
    interface Interface2 { int f(int i); }
    interface Interface3 { int f(); }
    class CBase { public int f() { return 1; } }
    
    // need to implement all methods declared in the implemented interfaces
    class D implements Interface1, Interface2 {
        @Override
        public void f() {}
        @Override
        public int f(int i) { return 1; } 
    }
    
    class C2 extends CBase implements Interface2 {
        @Override
        public int f(int i) { return i; }
    }
    
    class C3 extends CBase implements Interface3 {
        @Override
        public int f() { return 1; }
    }
    
    class C4 extends CBase implements Interface3 {
        @Override
        public int f() { return 1; }
    }
    
    /*
     * The following cannot work because their necessary methods differ
     * only by return type:
     */
    
     // class C5 extends CBase implements Interface1 {} 
    
     // interface Interface4 extends Interface1, Interface3 {}
}
