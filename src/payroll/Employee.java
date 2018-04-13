

package payroll;


public class Employee {
    //intialize all variables to be used
    protected String firstName;
    protected String lastName;
    protected String socialSecurityNumber;
    protected String address;
    protected String telephone;
    protected double hourlyPayRate;
    protected double hoursWorked;
    protected double totalPay;
    protected double monthlyPay;
    protected double taxRate;

    //constructor
    public Employee(){
        //set all vars to default values
        firstName = "";
        lastName = "";
        socialSecurityNumber = "";
        address = "";
        telephone = "";
        hourlyPayRate = 0.0;
        hoursWorked = 0.0;
        totalPay = 0.0;
        taxRate = 0.0;
        monthlyPay = 0.0;
    }


    /**
     * @return the firstName
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * @param firstName the firstName to set
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * @return the lastName
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * @param lastName the lastName to set
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * @return the hourlyPayRate
     */
    public double getHourlyPayRate() {
        return hourlyPayRate;
    }

    /**
     * @param hourlyPayRate the hourlyPayRate to set
     */
    public void setHourlyPayRate(double hourlyPayRate) {
        this.hourlyPayRate = hourlyPayRate;
    }

    /**
     * @return the socialSecurityNumber
     */
    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    /**
     * @param socialSecurityNumber the socialSecurityNumber to set
     */
    public void setSocialSecurityNumber(String socialSecurityNumber) {
        this.socialSecurityNumber = socialSecurityNumber;
    }

    /**
     * @return the address
     */
    public String getAddress() {
        return address;
    }

    /**
     * @param address the address to set
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * @return the telephone
     */
    public String getTelephone() {
        return telephone;
    }

    /**
     * @param telephone the telephone to set
     */
    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    /**
     * @return the hoursWorked
     */
    public double getHoursWorked() {
        return hoursWorked;
    }

    /**
     * @param hoursWorked the hoursWorked to set
     */
    public void setHoursWorked(double hoursWorked) {
        this.hoursWorked = hoursWorked;
    }


    /**
     * @return the totalPay
     */

    public double getTotalPay() {
        return totalPay;
    }

    /**
     * @param totalPay the totalPay to set
     */
    public void setTotalPay(double totalPay) {
        this.totalPay = totalPay;
    }



    /**
     * @return the monthlyPay
     */
    public double getMonthlyPay() {
        return monthlyPay;
    }

    /**
     * @param monthlyPay the monthlyPay to set
     */
    public void setMonthlyPay(double monthlyPay) {
        this.monthlyPay = monthlyPay;
    }

    /**
     * @return the taxRate
     */
    public double getTaxRate() {
        return taxRate;
    }

    /**
     * @param taxRate the taxRate to set
     */
    public void setTaxRate(double taxRate) {
        this.taxRate = taxRate;
    }

    //method to calc annual salary
    public double calcAnnual()
    {
        double pay = actualPay() * 12;
        return pay;
    }


    //method to calc actual pay including tax
    public double actualPay()
    {
        double pay = monthlyPay-(monthlyPay * taxRate);
        return pay;
    }





    //override the tostring method to prevent overloading
    @Override
    public String toString(){
        // create line separator
        String printLine = System.getProperty("line.separator");

        //returns properties of the Employee class
        String show = "First Name: "+firstName+printLine+"Last Name: "+lastName+
                printLine+"SSN: "+socialSecurityNumber
                +printLine+"Phone: "+telephone+printLine+"Address: "+address+printLine+"Monthly Pay Rate: "+monthlyPay;

        return show;
    }



}
