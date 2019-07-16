package metadata;

/**
 * A simple annotation type.
 * First, notice the @ that precedes the keyword interface. This tell the compiler that an annotation type is
 * being declared. Next, notice the two members str() an val(). All annotation consist solely of method declaration.
 * However, you don't provide bodies for these methods. Instead, Java implements these methods. Moreover, these
 * methods act much like a fields, as you will see.
 */
@interface MyAnno {
    String str();
    int val();
}
