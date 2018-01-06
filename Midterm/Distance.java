public class Distance{
    private static int INCHES_IN_A_FOOT = 12;
    private static float FEET_IN_A_METER = 0.3048f;
    private int feet;
    private int inches;

    public Distance(){
        feet = 0;
        inches = 0;
    }

    public Distance(int f, int i){
        if(i > 11)
            throw new IllegalArgumentException("Inches has to be less than 12");

            feet = f;
            inches = i;
    }

    public void setFeet(int f){
        feet = f;
    }

    public void setInches(int i){
        if( i > 11)
        throw new IllegalArgumentException("Inches has to be less than 11");
        
        inches = i;

    }

    public int getFeet(){
        return feet;
    }

    public int getInches(){
        return inches;
    }

    public void add(Distance other){
        inches = inches + other.inches;
        feet = feet + other.feet + ((inches)/12);
        inches = inches % 12;
    }

    public float metricDistance(){
        return ((feet + (inches/12) / FEET_IN_A_METER));
    }
}
