# Instructions  

### Description:
In this activity, you'll familiarize yourself with Java data types. A *Data Type* is a term used in programming to describe the context given to information in our program. As humans, we typically understand information when given some context. For example, `10` and `"ten"`, represent the same idea, but we would use the number representation and the word representation in different contexts. Similarly, we can provide this type of context in our programs.

In the exercise, we will create a number of different variables. Below are a list of naming rules and conventions to keep in mind when creating variables:
  - reserved keywords cannot be used. See list of keywords in references section below.
  - names cannot start with a digit (but can be used after the first character)
  - names can start with a letter, an underscore `_` or a dollar sign `$`
  - names cannot user other symbols or spaces
  - you cannot re-use the same variable name within the same scope (more on scopes later!).
  - variable names should meaningfully describe or relate to the context of your data
  - variable names should always begin with a lowercase letter
  - if a variable name is made up of multiple words, then each subsequent word should start with a capital letter
  - no two variables can have the same name

In Java, there are two categories of variables that can be created, *primitives* and *references*. Java has eight (8) primitive datatypes as follows:
1. `byte`
2. `short`
3. `int`
4. `long`
5. `char`
6. `float`
7. `double`
8. `boolean`

If a variable is created using a datatype other than the eight (8) specified above, the variable is a *reference* variable, based on a class that has either been defined within the ***JRE*** or by another developer.

### Steps:
1. Inside of the **main** method in **Main.java**, add the following code and run the program:
```Java
byte by = 127;
System.out.println(by);
```
You should see the following output:
```
127
```
A byte is a datatype that can represent whole number (non-decimal) values between -128 to 127. This range is due to the number of binary digits (bits) that a byte represents (8 bits). For any numerical datatype in Java, the maximum negative value is always one number greater than the maximum positive value.

2. Now it's your turn! Create a byte with the lowest negative byte value possible and print it out. Make sure any variables you create have unique names.

3. Next, add the following code into your **main** method:
```Java
short s = 32_767;
System.out.println(s);
```
Here, we've created a variable with a datatype of `short` called **s** and initialized the variable with a value of `32,767`.

In this example we've included an underscore to help with readability. In Java, you can include underscores when writing a whole number literal to provide better readability for the code, typically these underscores are placed after every three (3) digits, similar to how a comma is traditionally used in mathematics. Keep in mind that these underscores are not required, the example above would execute exactly the same if we rewrote the value without any underscores.

The value we've showcased in this example is the maximum positive number that a `short` datatype can represent. As stated above, the maximum negative value for a `short` is one greater than the positive value, meaning that the range for a `short` is -32768 to 32767.

4. Now its your turn! Create a variable with a datatype of `short` and initialize it's value to the lowest negative number a `short` can represent and print it out.

5. Next, add the following code into your **main** method:
```Java
int i = 2_147_483_647;
System.out.println(i);
```
Here, we have an `int` variable called **i** initialized with `2,147,483,647`. Similar to the previous examples, this is the largest whole number an `int` can represent. It is worth noting that `int` is the default datatype Java assigned to whole numbers. The range for a `int` is
`2,147,483,647` to `-2,147,483,648`.

6. Now it's your turn! Create an `int` variable with the lowest negative value and print it.

7. Add the following code into your **main** method:
```Java
long l = 9_223_372_036_854_775_807L;
System.out.println(l);
```
Here, we've created the variable **l** with a datatype of `long`, and initialized it to `9,223,372,036,854,775,807` (the maximum number a `long` can represent). In this example, notice that our `long` value requires the use of the character `L` at the end of the number. In Java, whole numbers are defaulted to the datatype `int`, and an `L` is needed to change the datatype to a `long` value. Remove the `L` and notice the resulting error when you try to run the program. Add the `L` back in before moving forward.

8. Add the following code to your **main** method and run the program:
```Java
double d = 3839.34839;
System.out.println(d);

float f = 3839.34839F;
System.out.println(f);
```
`float` and `double` datatypes allow us to represent decimal numbers. In Java `double` is the default datatype assigned to demical numbers. As such, we have to add the letter `F` to the end of a `float` value to indicate its type. Notice that the `float` value rounds off at the end versus the `double` value that keeps its precision.
  
9. Now its your turn! Create a float with the value 3.14f and print it.

10. Add the following code to your **main** method and run the program:
```Java
boolean on = false;
System.out.println(on);

``` 
The `boolean` is a datatype used often in programming to create and manage logical flow. A `boolean` can hold a datatype of `true` or `false`.

11. Now it's your turn! Create a boolean set to true and print it.

12. Add the following code to your **main** method and run the program:
```Java
char c = 'a';
System.out.println(c);
```
Here we've assigned the value of `a` to our variable **c** which is a `char` datatype. Notice that we surrounded the letter with single quotation marks `'`. By definition a `char` is a single Unicode character. If you try to place multiple letters in between the quotation marks you'll get an error. 

13. Now its your turn! Create a char with the value of 'z' and print it out.

14. Thats all for the primitive datatypes! but another very common datatype that you will see in Java is called a `String`. As mentioned above, a `String` is not a primitive datatype, instead we create `String` objects using the built-in `String` class in the JRE. We'll discuss objects and String in more detail in another lesson. For now, just know that Strings are used to create a sequence of characters all at once.

Add the following code to your **main** method and run the program:
```Java
String sentence = "the quick brown fox jumps over the lazy dog";
System.out.println(sentence);
```
Notice that we now use double quotes to surround all of the characters. Additionally, unlike a single `char` value, we can include multiple characters in our `String`.

15. Now its your turn! Create a string with the phrase: `I mastered Java data types!`, and print it out.

### Test:
Use the test provided. 

#### Sample output:
```
127
-128
32767
-32768
2147483647
-2147483648
9223372036854775807
3839.34839
3839.3484
3.14
false
true
a
z
the quick brown fox jumps over the lazy dog
I mastered Java data types!
```

  ## References
[Java Reserved Words](https://docs.oracle.com/javase/tutorial/java/nutsandbolts/_keywords.html)