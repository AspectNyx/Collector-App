public class Sneaker {
    private String name;
    private int year;
    private String brand;
    private double size;
    private double retailprice;
    private double resaleprice;
    private boolean wore;
    private int times;

public Sneaker(String name,int year,String brand, double size, double retailprice, double resaleprice){
    this.name=name;
    this.year=year;
    this.brand=brand;
    this.size=size;
    this.retailprice=retailprice;
    this.resaleprice=resaleprice;
    this.wore=false;
    this.times=0;
}

    public void setName(String name) {
        this.name = name;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public void setRetailprice(double retailprice) {
        this.retailprice = retailprice;
    }

    public void setResaleprice(double resaleprice) {
        this.resaleprice = resaleprice;
    }


public void wear (boolean wore) {
    if (wore== true) {
        resaleprice = resaleprice * .95;
        times=times + 1;
    }
}

public String getname(){
    return name;
}


public String toString() {
    return "Brand: " + brand +
            "\n" + "Name: " + name +
            "\n" + "Year: " + year +
            "\n" + "Size: " + size +
            "\n" + "Retail Price: " + retailprice +
            "\n" + "Resell Price: " + resaleprice +
            "\n" +
     "\n"+ "Times woren: " + times;
    }
}
