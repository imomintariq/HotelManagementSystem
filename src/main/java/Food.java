import java.util.Date;

public class Food {
    private String dishName;
    private int quantity;
    private double unitPrice;
    private Date timeOfFood;

    public Food() {
        dishName = "";
        quantity = 0;
        unitPrice = 0;
        timeOfFood = new Date();
    }

    public Food(String dishName, int quantity, double unitPrice, Date timeOfFood) {
        this.dishName = dishName;
        this.quantity = quantity;
        this.unitPrice = unitPrice;
        this.timeOfFood = timeOfFood;
    }

    public String getDishName() {
        return dishName;
    }

    public void setDishName(String dishName) {
        this.dishName = dishName;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public Date getTimeOfFood() {
        return timeOfFood;
    }

    public void setTimeOfFood(Date timeOfFood) {
        this.timeOfFood = timeOfFood;
    }
}
