public class Distance{
    private static int INCHES_IN_A_FOOT = 12; //WRONG
    private static float FEET_IN_A_METER = 0.3048f; //WRONG "final"
    public int feet; //WRONG
    public int inches; //WRONG  "private"

    public void iDistance(){ //no "void" for constructors & match the name of the class
        feet = 0;
        inches = 0;
    }

    public void aDistance(int f, int i){ //WRONG
        feet = f;
        if( i > 11){
            throw new IllegalArgumentException("Inches should be less than 11!");

        }
        else{
            inches= i;

        }
    }

    public int getInches(){

        return  this.inches; //SEARCH UP WHERE "THIS" is used.
    }

    public int getFeet(){

        return this.feet; //SEARCH UP WHERE "THIS" is used.
    }

    public void setInches(int i){ //INTIAL RULE missing of >11.

        this.inches = i;
    }
    //SEARCH UP WHERE "THIS" is used.
    
    public void setFeet(int f){

        this.feet = f;
        //SEARCH UP WHERE "THIS" is used.
    }

    public void add(int i, int f){ //WRONG WAY OF ACCESSING other distance object.
        this.inches = this.inches + i;
        this.feet = this.feet + f;
        //what happens if inches is greater than 12??
    }
 
    public float metricDistance(int f){ //WRONG
        return f* FEET_IN_A_METER;
    }
}