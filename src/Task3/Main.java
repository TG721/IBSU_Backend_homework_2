package Task3;

public class Main {
    public static void main(String[] args) {
        Patient patient = new Patient("19N0A23","Tengiz",12,2000.0);
        InsuredPatient insuredPatient = new InsuredPatient("200G43H2","Lika",21,1200.5,"IBSU",20.0);
        System.out.println(insuredPatient.equals(patient));
        System.out.println(insuredPatient.hashCode());
        System.out.println(insuredPatient); ///uses toString() method of parent class
    }
}
