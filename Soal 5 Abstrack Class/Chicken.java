public class Chicken extends Animal {

    public Chicken(String nama, String asal) {
        super (nama, asal, 2);
    }

    @Override 
    public void toShout() {
        System.out.print("kukuruyuk \n");
    }
    
}
