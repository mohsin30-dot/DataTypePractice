public class Enumerations {

    // lets create enumerations of weekdays.
    // An enumeration representing the days of the week is created with a enum keyword.
    // By convention, Constants are written in uppercase letters
    enum Days {
        MONDAY,
        TUESDAY,
        WEDNESDAY,
        THURSDAY,
        FRIDAY,
        SATURDAY,
        SUNDAY
    }

    public static void main(String[] args) {
        Days day = Days.MONDAY;
        if (day == Days.MONDAY) {
            System.out.println("it is Monday");
        }
        System.out.println(day);
        for (Days d : Days.values()) {
            /*
            this loop prints all days to the console. the static values() method returns an array containing the constants
            of this enum type, in the ordered they are declared. this method maybe used to iterate over the constants with the
            enhanced for statements. The enhanced for goes through the array, element by element, prints them to the terminal.
             */
            System.out.println(d);
        }

    }

}




/*
note : it is possible to give some values to the enumerations constraints

An Enum type is a special type of data that enables for a variable to be set of predefined constants. A variable that has been
declared as having an enumerated type can be assigned any of the enumerators as a value, its make the code more readable & are useful
when we deal with variables that can only take one out of a small set of possible values.
 */
