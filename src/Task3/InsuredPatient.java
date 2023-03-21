package Task3;

import java.util.Objects;

public class InsuredPatient extends Patient{
    private String insuranceCompany;
    private Double percentInsurancePays;

    public InsuredPatient(String ID, String name, Integer age, Double amountDue,
                          String insuranceCompany, Double percentInsurancePays) {
        super(ID, name, age, amountDue);
        this.insuranceCompany = insuranceCompany;
        this.percentInsurancePays = percentInsurancePays;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof InsuredPatient)) return false;
        InsuredPatient that = (InsuredPatient) o;
        return Objects.equals(insuranceCompany, that.insuranceCompany) && Objects.equals(percentInsurancePays, that.percentInsurancePays);
    }

    @Override
    public int hashCode() {
        return Objects.hash(insuranceCompany, percentInsurancePays);
    }
}
