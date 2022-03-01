

public class App {

    public static final int var = 34;


    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
    
        // String str1 = "Harshit Singh not";
        // String str = "Harshit Singh";
        // str = str + str1;
        // System.out.println(str);
        
        // StringBuilder str = new StringBuilder();
        // StringBuilder str1 = new StringBuilder();

        
        // str.append("Harshit");
        // System.out.println(str);
        // str1.append("Harshit");
        // System.out.println(str1);

        // if(str.equals(str1)){
        //     System.out.println("true");
        // }
        // else{
        //     System.out.println("false");
        // }

        var = var + 2; // shows error because var is final, cant be changed.

        System.out.println(var);

        // if(str.equals(str1)){
        //     System.out.println("It works");
        // }


    }
}
