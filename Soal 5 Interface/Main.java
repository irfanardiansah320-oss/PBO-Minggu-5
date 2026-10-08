public class Main {
    public static void main(String[] args) {
        Goods[] barang = {
            new Food("Nasi Goreng", 15000, 450),
            new Toy("Lego City", 200000, 6),
            new Book("Belajar Java", 85000, "Budi Santoso")
        };

        for (Goods g : barang) {
            g.display();
            System.out.println("-------------------------");
        }
    }
}