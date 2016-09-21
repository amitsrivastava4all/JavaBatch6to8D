class MainWays
{
    // Main Overloading
    // when main is more than once 
    // so compiler identify by arguments
    // and this main is consider as user define main
    
    public static void main(){
        System.out.println("this is no args main");
    }
    
    public static void main(int x){
        System.out.println("this is int args main");
}
    
    // ... is called var-args  (Java 1.5)
static public  void main(String []arr){
    // Digital 0, 1
    // 0 - Low Voltage <5 Volt
    // 1 - High Voltage >= 5 Volt
   // 1 Byte - 8 Bit
    // 4 Byte - 32 Bit
    // 31 Bit - Number
    // 1 Bit - (+ -)
    // - 2 ^ 31 to 2 ^ 31 - 1
    byte w ;// 1 Byte - 8 bit , 7 Bit number  1 bit + -
   // - 2 ^ 7 to 2 ^ 7 - 1
    // -128 to 127
    short e ; // 2 Byte- 16 Bit , 15 Bit Numbe
    int a=Integer.parseInt(arr[0]);  // "1000" // 4 Byte
    int b=Integer.parseInt(arr[1]); // "2000"
    long ee; // 8 Byte
    int c =  a + b;
    System.out.println("Sum is  "+c);
    main();
    main(1000);
}
}