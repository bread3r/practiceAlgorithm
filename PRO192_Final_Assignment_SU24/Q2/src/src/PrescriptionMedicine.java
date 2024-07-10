/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
public class PrescriptionMedicine extends Medicine {

    public String doctorName;

    public PrescriptionMedicine() {
    }

    public PrescriptionMedicine(String name, String indication, int expirationYear, String doctorName) {
        super(name, indication, expirationYear);
        this.doctorName = doctorName;
    }

    public String getDoctorName() {
        return fixName(doctorName);
    }

    public void setDoctorName(String doctorName) {
        this.doctorName = fixName(doctorName);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setIndication(String indication) {
        this.indication = indication;
    }

    public void setExpirationYear(int expirationYear) {
        this.expirationYear = expirationYear;
    }

    public String isExpired(int currentYear) {
        if (currentYear <= expirationYear) {
            return "Valid";
        }
        return "Expired";
    }


    @Override
    public String toString() {
            return String.format("%s, %s, %d, %s",getName(),getIndication(),getExpirationYear(), getDoctorName());
    
        
    }

}
