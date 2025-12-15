package Part2.StaticClass;

/*
    GOAL OF THIS FILE
    -----------------
    We are answering ALL these questions clearly:

    1. NON-STATIC method can call:
       a) non-static inner class
       b) static inner class
       c) outer class

    2. STATIC method can call:
       a) non-static inner class
       b) static inner class
       c) outer class

    IMPORTANT MENTAL MODEL (VERY IMPORTANT):
    ----------------------------------------
    - non-static method HAS an object (this)
    - static method HAS NO object
    - static inner class = NOT dependent on outer object
    - non-static inner class = DEPENDENT on outer object
*/

public class CallMatrixExplained {

    /* ===============================
       STATIC INNER CLASS
       =============================== */
    static class StaticInnerClass {
        void show() {
            System.out.println("I am a STATIC inner class");
        }
    }

    /* ===============================
       NON-STATIC INNER CLASS
       =============================== */
    class NonStaticInnerClass {
        void show() {
            System.out.println("I am a NON-STATIC inner class");
        }
    }

    /* =====================================================
       1️⃣ NON-STATIC METHOD
       =====================================================
       FACT:
       - non-static method already has an object (this)
       - so it can call EVERYTHING
    */
    void nonStaticMethod() {

        System.out.println("---- INSIDE NON-STATIC METHOD ----");

        /* 1a) non-static → non-static inner class */
        // allowed because WE ALREADY HAVE `this`
        NonStaticInnerClass a = this.new NonStaticInnerClass();
        a.show();

        /* 1b) non-static → static inner class */
        // allowed because static inner class has no dependency
        StaticInnerClass b = new StaticInnerClass();
        b.show();

        /* 1c) non-static → outer class */
        // outer class is independent
        OuterClass c = new OuterClass();
        c.show();
    }

    /* =====================================================
       2️⃣ STATIC METHOD
       =====================================================
       FACT:
       - static method has NO object
       - so it CANNOT directly access things that need an object
    */
    static void staticMethod() {

        System.out.println("---- INSIDE STATIC METHOD ----");

        /* 2a) static → non-static inner class */
        // ❌ NOT allowed directly
        // NonStaticInnerClass x = new NonStaticInnerClass(); // COMPILE ERROR

        // ✅ correct way: create outer object first
        CallMatrixExplained outerObj = new CallMatrixExplained();
        NonStaticInnerClass x = outerObj.new NonStaticInnerClass();
        x.show();

        /* 2b) static → static inner class */
        // allowed directly (no dependency)
        StaticInnerClass y = new StaticInnerClass();
        y.show();

        /* 2c) static → outer class */
        // allowed, outer class is independent
        OuterClass z = new OuterClass();
        z.show();
    }

    /* ===============================
       MAIN METHOD (static context)
       =============================== */
    static void main(String[] args) {

        System.out.println("==== PROGRAM START ====");

        // main is static → so first we create an object
        CallMatrixExplained obj = new CallMatrixExplained();

        // calling non-static method
        obj.nonStaticMethod();

        // calling static method
        staticMethod();

        System.out.println("==== PROGRAM END ====");
    }
}
/* ===============================
       OUTER CLASS (independent)
       =============================== */
class OuterClass {
    void show() {
        System.out.println("I am an OUTER class");
    }
}