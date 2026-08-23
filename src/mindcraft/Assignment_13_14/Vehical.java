package mindcraft.Assignment_13_14;

public class Vehical implements cloneable{
    public String name;
    public int price;
    public int number;

    public Vehical(String name, int number, int price) {
        this.name = name;
        this.number = number;
        this.price = price;
    }

    public Vehical() {
        name = "BMW";
        number = 5269;
        price = 1000000;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Vehical{");
        sb.append("name='").append(name).append('\'');
        sb.append(", price=").append(price);
        sb.append(", number=").append(number);
        sb.append('}');
        return sb.toString();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    // clone()
    @Override
    public Vehical clone() throws CloneNotSupportedException {

        return (Vehical)
                super.clone();
    }
}
