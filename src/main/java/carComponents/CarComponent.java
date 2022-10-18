package carComponents;

public abstract class CarComponent {

    private String name;
    private double price;
    private int installationTime;


    public CarComponent(String name, double price, int installationTime) {
        this.name = name;
        this.price = price;
        this.installationTime = installationTime;
    }


    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getInstallationTime() {
        return installationTime;
    }

}
