package metadata;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Method;

/**
 * A simple annotation type.
 * First, notice the @ that precedes the keyword interface. This tell the compiler that an annotation type is
 * being declared. Next, notice the two members str() an val(). All annotation consist solely of method declaration.
 * However, you don't provide bodies for these methods. Instead, Java implements these methods. Moreover, these
 * methods act much like a fields, as you will see.
 */
@Retention(RetentionPolicy.RUNTIME)
@interface MyAnno {
    String str();
    int val();
}

class Meta {

    // annotate a method
    @MyAnno(str = "Annotation Example", val = 100)
    public static void myMeth() {
        Meta ob = new Meta();

        // Obtain the annotation for these methods and display the values of the members.
        try {
            // First get a Class object that represents this class
            Class c = ob.getClass();

            // Now get a Method object that represents this method.
            Method m = c.getMethod("myMeth");

            // Next get the annotation for this class
            MyAnno anno = m.getAnnotation(MyAnno.class);

            // Finally, display the values.
            System.out.println(anno.str() + " " + anno.val());
        } catch (NoSuchMethodException e) {
            System.out.println("Method nt found!");
        }
    }

    public static void main(String[] args) {
        myMeth();
    }

}
