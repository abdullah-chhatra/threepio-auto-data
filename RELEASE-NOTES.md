

###Version - 1.0.0###

####Automate implementation of Android Parcelable interface.
1. Support encode and decode of following data types
    * Primitive types and their arrays
    * String, String array and String list
    * Parcelable, Parcelable array and Parcelable list.
    * Bundle and Bundle array.

####Auto generate JSON parsable definition for Java value objects.
1. Support encode and decode of following data types
    * Primitive types and their arrays
    * String, String array and String list
    * JSONParsable, JSONParsable array and list.
2. Support for optional fields.
3. Following field namings with regard to variable names are supported:
    * Lower camel case (lowerCamelCase)
    * Upper camel case (UpperCamelCase)
    * Lower snake case (lower_snake_case)
    * Upper snake case (UPPER_SNAKE_CASE)
    * Lower hyphen case (lower-hyphen-case)

####Common features

1. Listen to read and write events to do extra processing if required.
2. Generating public and protected constructors of base class for easy use.
3. Options to control adding or removing suffix of generated class.

