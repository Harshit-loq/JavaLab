// File: Q/B.java
package Q;
import p.A; // Import class A from package p

public class B extends A {
    public void accessMethods() {
        publicMethod();  
        protectedMethod(); 
        // defaultMethod(); 
        // privateMethod(); 
        
        callPrivateMethod(); 
    }
}
