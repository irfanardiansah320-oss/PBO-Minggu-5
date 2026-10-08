public class Lion extends Animal {

    public Lion(String nama, String asal) {
        super(nama, asal, 4);
    }

    @Override
    public void toShout() {
        System.out.print("Roarrr! \n");
    }
}