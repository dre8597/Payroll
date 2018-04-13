package payroll;


//inherits from employee class
public class Technician extends Employee {

    //initialize variables
    protected double overtimeHours;
    protected double overtimePayrate;

    //technician constructor
    public Technician() {

        //call super constrcutor
        super();
        //set var variable to default
        overtimeHours = 0.0;
        overtimePayrate = 0.0;

    }

    /**
     * @return the overtimeHours
     */
    public double getOvertimeHours() {
        return this.overtimeHours;
    }

    /**
     * @param overtimeHours the overtimeHours to set
     */
    public void setOvertimeHours(double overtimeHours) {
        this.overtimeHours = overtimeHours;
    }


    /**
     * @return the overtimePayrate
     */
    public double getOvertimePayrate() {
        return this.overtimePayrate;
    }

    /**
     * @param overtimePayrate the overtimePayrate to set
     */
    public void setOvertimePayrate(double overtimePayrate) {
        this.overtimePayrate = overtimePayrate;
    }

    //method to calc regular pay with overtime before tax
    public double beforeTaxTotalPay() {


        return monthlyPay + (overtimeHours * overtimePayrate);

    }

    //override method from super class to prevent overloading
    @Override
    //method to calc actual pay
    public double actualPay() {

        double pay;
        if (overtimeHours != 0) {
            //calc monthly pay plus overtime
            double tempPay = monthlyPay + (overtimeHours * overtimePayrate);
            //calc total pay after tax
            pay = tempPay - (tempPay * taxRate);

        } else {
            //if there is not any overtime calc reglat pay with tax
            pay = monthlyPay - (monthlyPay * taxRate);
        }

        return pay;
    }

    //override method from super class to prevent overloading
    //calc annual pay
    @Override
    public double calcAnnual() {
        return actualPay() * 12;

    }


    @Override
    public String toString() {

        //returns properties of the Technician class inlcuding properties of super class

        return super.toString() + System.getProperty("line.separator") + "Overtime Hours: " +
                overtimeHours + System.getProperty("line.separator") +
                "Overtime Payrate: " + overtimePayrate + System.getProperty("line.separator") + "Before Tax Total: " + beforeTaxTotalPay() +
                System.getProperty("line.separator") + "Actual Pay (After tax): " + actualPay()
                + System.getProperty("line.separator") + "Annual Pay (After tax): " + calcAnnual();
    }


}
