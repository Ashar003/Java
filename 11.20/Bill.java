
public class Bill extends Money{
   private int dollars;
   int[] Bills = {1,5,10,20,50,100};
   
   public Bill (int d) {
        for(int i =0; i<Bills.length; i++){
            if( d == Bills[i]){
                System.out.println(d);
                dollars = d;
                System.out.println(dollars);
                if(i == Bills.length){
                throw new IllegalBillException("It is not a legal currency");
            }
            }
    }
   }
   public int getValue () {
      return dollars;
   }
   public String toString() {
      return "$ " + dollars + ".00";
   }
}

