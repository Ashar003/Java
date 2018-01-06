public class Distance{
    private static final int INCHES_IN_A_FOOT = 12;
    private static final float FEET_IN_A_METER = 0.3048f;
    //NO STATIC
    private static int feet;
    private static int inches;

    public setIDistance(){ //NO SET && remove everything except Distance
        feet = 0;
        inches = 0;
    }

    public void setDistance(int f, int i){
        if( i > 11)
            throw new IllegalArgumentException("Inches must be less than 11");
        
        feet = f;
        inches = i;

    }

    public void setFeet(int f){
        feet = f;
    }

    public void setInches(int i){
        if (i > 11)
            throw new IllegalArgumentException("Inches must be less than 11");
        
            inches = i;
    }

    public int getFeet(){
        return feet;
    }

    public int getInches(){
        return inches;
    }

    // public void add(int f, int i){
    //     Inches = Inches + (i % 12);
    //     Feet = Feet + f + (i/12);
    // }

    public float metricDistance(){
        return feet * FEET_IN_A_METER;
    }
}