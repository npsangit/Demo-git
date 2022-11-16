package git;

public class Fille01 {
    private String name;
    private int age;
    private String address;
    private String email;


    public Fille01(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public Fille01() {
    }

    public Fille01(String name, int age, String address, String email) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
