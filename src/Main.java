
import java.util.Scanner;
void main() {

    Scanner input = new Scanner(System.in);

    SneakerCollection collection = new SneakerCollection();

    boolean running = true;

    while (running) {

        System.out.println(" ");
        System.out.println("What do you want to do?");
        System.out.println("1. Add sneaker");
        System.out.println("2. Stop");

        if (collection.getSneakerCount() > 0) {
            System.out.println("3. View Collection");
            System.out.println("4. Edit Shoe");
            System.out.println("5. Search Shoe");
        }
//used ai to help use the try and catch
        try {

            int choice = input.nextInt();
            input.nextLine();

            switch (choice) {

                case 1:

                    System.out.println("Need you to answer 6 questions to get information about the shoe!");

                    System.out.println("Name: ");
                    String name = input.nextLine();

                    System.out.println("Year: ");
                    int year = input.nextInt();
                    input.nextLine();

                    System.out.println("Brand: ");
                    String brand = input.nextLine();

                    System.out.println("Size: ");
                    double size = input.nextDouble();
                    input.nextLine();

                    System.out.println("Retail Price: $");
                    double retailprice = input.nextDouble();
                    input.nextLine();

                    System.out.println("Resale Price: $");
                    double resaleprice = input.nextDouble();
                    input.nextLine();

                    Sneaker sneaker = new Sneaker(name, year, brand, size, retailprice, resaleprice);

                    collection.addSneaker(sneaker);

                    System.out.println("\nInformation:");
                    System.out.println(sneaker);

                    break;
                case 2:
                    System.out.println("Adios Brochacho!");
                    return;
               //used ai to have a cleaner print layout
                case 3:
                    System.out.println();
                    System.out.println("=================================");
                    System.out.println("       MY SNEAKER COLLECTION");
                    System.out.println("=================================");
                    collection.viewCollection();
                    break;
                case 4:
                    System.out.println();
                    System.out.println("=================================");
                    System.out.println("       MY SNEAKER COLLECTION");
                    System.out.println("=================================");
                    for (int i = 0; i < collection.getSneakerCount(); i++) {
                        System.out.println();
                        System.out.println("Sneaker #" + (i + 1));
                        System.out.println("---------------------------------");
                        System.out.println(collection.getSneaker(i + 1).getname());
                        System.out.println("---------------------------------");
                    }
                    System.out.println("Which Shoe Would You Like To Change? (Insert Number)");
                    int shoeChoice = input.nextInt();
                    input.nextLine();
                    if (shoeChoice<1 || shoeChoice > collection.getSneakerCount()) {
                        System.out.println("That is not a valid shoe.");
                        break;
                    }
                    Sneaker selectedShoe = collection.getSneaker(shoeChoice);
                    System.out.println();
                    System.out.println("What would you like to change?");
                    System.out.println("1. Name");
                    System.out.println("2. Year");
                    System.out.println("3. Brand");
                    System.out.println("4. Size");
                    System.out.println("5. Retail Price");
                    System.out.println("6. Resale Price");
                    int editChoice = input.nextInt();
                    input.nextLine();
                    switch (editChoice) {
                        case 1:
                            System.out.println("Enter the new name:");
                            String newName = input.nextLine();
                            selectedShoe.setName(newName);
                            System.out.println("Name changed");
                            break;
                        case 2:
                            System.out.println("Enter the new year:");
                            int newYear = input.nextInt();
                            input.nextLine();
                            selectedShoe.setYear(newYear);
                            System.out.println("Year changed");
                            break;
                        case 3:
                            System.out.println("Enter the new brand:");
                            String newBrand = input.nextLine();
                            selectedShoe.setBrand(newBrand);
                            System.out.println("Brand changed");
                            break;
                        case 4:
                            System.out.println("Enter the new size:");
                            double newSize = input.nextDouble();
                            input.nextLine();
                            selectedShoe.setSize(newSize);
                            System.out.println("Size changed");
                            break;
                        case 5:
                            System.out.println("Enter the new retail price:");
                            double newRetailPrice = input.nextDouble();
                            input.nextLine();
                            selectedShoe.setRetailprice(newRetailPrice);
                            System.out.println("Retail price changed");
                            break;
                        case 6:
                            System.out.println("Enter the new resale price:");
                            double newResalePrice = input.nextDouble();
                            input.nextLine();
                            selectedShoe.setResaleprice(newResalePrice);
                            System.out.println("Resale price changed");
                            break;
                        default:
                            System.out.println("Invalid edit choice.");
                    }
                    break;
                case 5:
                    System.out.println("Which sneaker would you like to search for? (Insert Number)");
                    int searchNumber = input.nextInt();
                    input.nextLine();
                    if (searchNumber < 1 || searchNumber > collection.getSneakerCount()) {
                        System.out.println("That is not a valid sneaker.");
                    } else {
                        Sneaker foundShoe = collection.getSneaker(searchNumber);
                        System.out.println();
                        System.out.println("Shoe Found:");
                        System.out.println(foundShoe);
                    }
                    break;


                    default:
                    System.out.println("Invalid choice.");
            }


        } catch (Exception e) {
            System.out.println("Invalid Input.");
            input.nextLine();
        }
    }
}
