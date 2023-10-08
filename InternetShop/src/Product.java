public class Product {
    private int weight;
    private String type;
    private boolean access;
    private String descript;

    public Product(int weight, String type, boolean access, String descript) {
        this.weight = weight;
        this.type = type;
        this.access = access;
        this.descript = descript;
    }

    public Product() {
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean isAccess() {
        return access;
    }

    public void setAccess(boolean access) {
        this.access = access;
    }

    public String getDescript() {
        return descript;
    }

    public void setDescript(String descript) {
        this.descript = descript;
    }

    @Override
    public String toString() {
        return "Product{" +
                "weight=" + weight +
                ", type='" + type + '\'' +
                ", access=" + access +
                ", descript='" + descript + '\'' +
                '}';
    }
}
