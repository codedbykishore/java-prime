class User extends WooberUser {
    String petName;
    String petId;

    User(int id, String name, int age, String address, String phone, String petName, String petId) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.address = address;
        this.phone = phone;
        this.petName = petName;
        this.petId = petId;
    }

    // setters and getters
    public String getPetName() {
        return petName;
    }

    public void setPetName(String petName) {
        this.petName = petName;
    }

    public String getPetId() {
        return petId;
    }

    public void setPetId(String petId) {
        this.petId = petId;
    }
}
