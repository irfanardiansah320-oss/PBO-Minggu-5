public class Main {
    public static void main(String[] args) {
        Animal Dog = new Dog("bruno", "indonesia");
        Animal Chicken = new Chicken ("jago", "Indonesia");
        Animal Lion = new Lion ("Simba", "Afrika");

        Animal[] hewan = {Dog, Chicken, Lion};

        for (Animal a : hewan) {
        System.out.println("Nama        : " + a.getNama());
        System.out.println("Asal        : "+ a.getAsal());
        System.out.println("Jumlah Kaki : " + a.getJumlahKaki());
        System.out.print("Suara       : ");
        a.toShout();
        System.out.print("Makan       : ");
        a.toEat();
    }

    }

}
