
import java.io.*;


public class SaveMoney {
  Quarter quarter;
  public static void main(String argv[]) throws Exception {
    FileOutputStream fos = new FileOutputStream("money.out");
    ObjectOutputStream oos = new ObjectOutputStream(fos);
    Quarter quarter = new Quarter();
    oos.writeObject(quarter);

    Money [] m = { new Bill(1), new Penny(), new Dime()};
    oos.writeInt(m.length);

    for(int i = 0; i < m.length; i++){
      oos.writeObject(m[i]);
    }

    oos.flush(); //make sure in the buffer it goes through
    oos.close(); //close streams to prevent over memory usage
    fos.close();
  }
}


/*

Now insert a loop in SaveMoney so that several Quarters (or better yet, several types of Coins) are written to the file, then in ReadMoney read all the coins from the file.
*/
