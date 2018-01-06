public class Cup{
    private int cSize;
    private String cCont;

    public Cup( int size, String cont){
        if(!(size == 8 || size == 16 || size == 32)){
            throw new IllegalArgumentException("Size Matters!");
        }
        if(cont == null) throw new IllegalArgumentException("Cont doesn't exist");
    
        cSize = size;
     cCont = cont;

}
    public void setSize(int size){
        if (!(size == 8 || size == 16 || size == 32)) throw new IllegalArgumentException("Size Matters!");
        
        cSize = size;

    }
    public void setCont(String cont){
        if (cont == undefined) throw new IllegalArgumentException("Cont doesn't exist");

        cCont = cont;
    }
    public int getSize(){
        
        return cSize;
    }
    public String getCont(){
        return cCont;
    }
}