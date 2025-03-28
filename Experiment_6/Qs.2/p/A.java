package p;

public class A {

    public void publicMethod() {
        System.out.println("Public method in A");
    }

    protected void protectedMethod() {
        System.out.println("Protected method in A");
    }

    private void privateMethod() {
        System.out.println("Private method in A");
    }

    public void callPrivateMethod() {
        privateMethod();
    }
}
