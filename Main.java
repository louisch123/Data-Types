class Main {
  public static void main(String[] args) {
    // Place your code within this method
   byte by =  127;
    System.out.println(by);
    byte aByte = -128;
    System.out.println(aByte);
    short s = 32_767;
    System.out.println(s);
    short k = -32_768;
    System.out.println(k);
    int i = 2_147_483_647;
    System.out.println(i);
    int p = -2_147_483_648;
    System.out.println(p);
    long l = 9_223_372_036_854_775_807L;
    System.out.println(l); //L at the end of the number changes the datatype to a long value, without it the statement will error
    double d = 3839.34839;
    System.out.println(d);//Allow for decimal numbers, double is the default datatype
    float f = 3839.34839F;
    System.out.println(f);// To remove double as the defualt datatype the 'F' will define the value as float
    float t = 3.14F;
    System.out.println(t);
    boolean on = false;
    System.out.println(on);
    boolean off = true;
    System.out.println(off);
    char c = 'a';
    System.out.println(c);
    char w = 'z';
    System.out.println(w);
    String sentence = "the quick brown fox jumps over the lazy dog";
    System.out.println(sentence);
    String datatype = "I mastered Java data types!";
    System.out.println(datatype);
  } // End of Main method
} // End of Main class