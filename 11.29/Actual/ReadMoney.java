
import java.io.*;


public class ReadMoney {
  

  public static void main(String argv[]) throws Exception {
    FileInputStream fis = new FileInputStream("money.out");
    ObjectInputStream ois = new ObjectInputStream(fis);
     Quarter q = (Quarter) ois.readObject();
    System.out.println("My quarter: "+ q);

    int n = ois.readInt();

    for(int i = 0; i < n; i++){
      Money m = (Money) ois.readObject();
      System.out.println("My money object " + m);
    }

    ois.close();
    fis.close();
  }
}