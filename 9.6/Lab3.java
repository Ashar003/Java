public class Lab3 { //Lab3 matches the name of the file.
    public static void main(String[] args){ // Basic setup.
        
        //Initialized with floats.
        float fahrenheit;
        float centigrade;
        //Set up
            fahrenheit = (float)0.0;
            

        //fahrenheit = (float)98.6;
       

   //FOR LOOP
        for(fahrenheit = 0; fahrenheit<= 40; fahrenheit+=5){
            centigrade = (float) ((5.0 / 9.0) * (fahrenheit - 32.0));
            System.out.println("The centigrade value for the inputted farehenheit " + fahrenheit +" is "+ centigrade + ".");
        }


    //WHILE LOOP
            
        
    //             while(fahrenheit <= 40.0){
    //                 centigrade = (float) ((5.0 / 9.0) * (fahrenheit - 32.0));
    //                     System.out.println("The centigrade value for the inputted farehenheit " + fahrenheit +" is "+ centigrade + ".");
    //                         fahrenheit = (float)(fahrenheit + 5.0);
    //             }

    }
}
