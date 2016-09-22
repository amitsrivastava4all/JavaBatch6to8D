strictfp class DataTypes
{
    public static void main(String args[]){
        // Primitive Data Types or Value Data Types
        int p = 100;
        // Non -Decimal byte , short , int , long
        // Decimal - float , double
        float x = 10.20F; // 4 Byte
        double y = 90.99983; // 8 byte
        // IEEE-754 Standard
        // 90.100
        // 90100 (Number)  
        // 3 (Decimal Place)
        // 90100/1000=90.100
        // 10 - 5 = 5
        // 2 ^3  2 ^ 2  2 ^ 1  2^0     
        // 8      4     2       1
        // 1      0     1       0  = 10 
        // 0      1     0       1  = 5
        // 1      0     1       0  = -5
        
        // 1 0  1 0  = 10
        // 1 0  1 0 = -5
        // 0  1  0  1 = 5 
        
        
        
        // 1010 - 0101    
        
        boolean x1 = true; // 1 , false = 0
        // 1 byte , 2 byte , 4 byte dependent on O/S.
        char e = 'A'; // UNICODE (2Byte)
        System.out.println("Welcome User");
        System.out.println("आपका स्वागत है उपयोगकर्ता");
        
        // Reference Data Types
        // String Literal Style
        String q = "amit";  // 1 or 0
        String r = "amit";
        // new String style
        String pp = new String("amit"); // 2 or 1
        String bb = new String("amit");
        r="mike";
        if(q==r){
            System.out.println("Same Ref !!!!!!");
        }
        else
        {
            System.out.println("Not Same Ref  !!!!!");
        }
        
        if(q==pp){
            System.out.println("Same Ref");
        }
        else
        {
            System.out.println("Not Same Ref");
        }
        
        
        //String tt = q;
        
        
        
    }
}
