class Driver extends WooberUser {
    private String vehicleName;
    private String vehicleNumber;

    Driver(int id, String name, int age, String address, String phone, String vehicleName, String vehicleNumber) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.address = address;
        this.phone = phone;
        this.vehicleName = vehicleName;
        this.vehicleNumber = vehicleNumber;
    }

    // getter and setter for all of these instance variables
    public String getVehicleName() {
        return vehicleName;
    }

    public void setVehicleName(String vehicleName) {
        this.vehicleName = vehicleName;
    }

    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public void setVehicleNumber(String vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
    }
}
