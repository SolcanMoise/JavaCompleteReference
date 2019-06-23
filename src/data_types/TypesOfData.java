package data_types;

/**
 * Java defines eight primitive types of data:
 *  ~ integers: - byte    (8 bits)  [–128 to 127]
 *              - short   (16 bits) [–32,768 to 32,767]
 *              - int     (32 bits) [–2,147,483,648 to 2,147,483,647]
 *              - long    (64 bits) [–9,223,372,036,854,775,808 to 9,223,372,036,854,775,807]
 *
 *  ~ floating-point numbers:   - float  (32 bits)  [4.9e–324 to 1.8e+308]
 *                              - double (64 bits)  [1.4e–045 to 3.4e+038]
 *
 *  ~ characters:  - char (16 bits)  [0 to 65,536]
 *
 *  ~ booleans: - boolean (1 bit)
 */
public class TypesOfData {

    // Example - Compute distance light travels using long variables.
    public static void main(String[] args) {

        int lightSpeed;
        long days;
        long seconds;
        long distance;

        // approximate speed of light in miles per second
        lightSpeed = 186000;

        days = 365; // a year

        seconds = days * 24 * 60 * 60; // convert to seconds

        distance = lightSpeed * seconds; // compute distance

        System.out.println("In " + days + " days light will travel about " + distance + " miles!!");

    }

}
