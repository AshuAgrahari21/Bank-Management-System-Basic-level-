public class Customer {
    private String name;
    private String pin;

    public Customer(String name, String pin) {
        this.name = name;
        this.pin = pin;
    }

    public String getName() {
        return name;
    }

    public boolean validatePin(String pin) {
        return this.pin.equals(pin);
    }

    public void changePin(String oldPin, String newPin) {
        if (validatePin(oldPin)) {
            this.pin = newPin;
        }
    }
}
