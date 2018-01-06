public class Question1{
    public static void main(String[] args){

        if(args.length < 1) throw new IllegalArgumentException("There needs to be atleast one argument");
        String oArg= args[0];
        int upper = 0;
        int lower = 0;

        for(int u = 0; u< oArg.length(); u++){
            if(Character.isUpperCase(oArg.charAt(u))) upper++;
            if(Character.isLowerCase(oArg.charAt(u))) lower++;
        }

        if(upper > lower) System.out.println("There are more upper case");
        if(lower > upper) System.out.println("There are more lower case");
        if( upper == lower) System.out.println("There is as many upper case as lower case");
    }
}
