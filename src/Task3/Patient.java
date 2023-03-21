package Task3;

public class Patient {
    String ID,name;
    Integer age;
    Double amountDue;

    public Patient(String ID, String name, Integer age, Double amountDue) {
        this.ID = ID;
        this.name = name;
        this.age = age;
        this.amountDue = amountDue;
    }

    @Override
    public String toString() {
        return "Patient{" +
                "ID='" + ID + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", amountDue=" + amountDue +
                '}';
    }
}
