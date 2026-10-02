
public class SneakerCollection {

    private Sneaker[] sneakers;
    private int sneakerCount;

    public SneakerCollection() {
        sneakers = new Sneaker[100];
        sneakerCount = 0;
    }

    public void addSneaker(Sneaker sneaker) {
        sneakers[sneakerCount] = sneaker;
        sneakerCount++;
    }

    public void viewCollection() {
        for (int i = 0; i < sneakerCount; i++) {
            System.out.println();
            System.out.println("Sneaker #" + (i + 1));
            System.out.println("-----------");
            System.out.println(sneakers[i]);
        }
    }

    public Sneaker getSneaker(int number) {
        return sneakers[number - 1];
    }

    public int getSneakerCount() {
        return sneakerCount;
    }
}

