//PrivateDataAccess {
public class PrivateDataAccess {
    private int privateValue;

    // Getter method to access the private data
    public int getPrivateValue() {
        return privateValue;
    }

    // Setter method to modify the private data
    public void setPrivateValue(int newValue) {
        privateValue = newValue;
    }

    public static void main(String[] args) {
        PrivateDataAccess dataAccess = new PrivateDataAccess();

        // Access the private data using the getter and setter methods
        dataAccess.setPrivateValue(42);
        int value = dataAccess.getPrivateValue();

        System.out.println("Private Value: " + value);
    }
}

