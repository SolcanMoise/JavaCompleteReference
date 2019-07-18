package metadata;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Method;

/**
 * A marker annotation is a special kind of annotation that contains no members.
 */
@Retention(RetentionPolicy.RUNTIME)
@interface MyMarker {}

public class Marker {
    /**
     * Annotate a method using a marker.
     */
    @MyMarker
    public static void myMethod() {
        Marker ob = new Marker();

        try {
            Method m = ob.getClass().getMethod("myMethod");

            // determine if the annotation is present
            if(m.isAnnotationPresent(MyMarker.class)) {
                System.out.println("MyMarker is present");
            }
        } catch (NoSuchMethodException e) {
            System.out.println("Method not found");
        }
    }

    public static void main(String[] args) {
        myMethod();
    }

}
