package payroll;



//inherits from employee class
public class Engineer extends Employee {

    //engineer class constrcutor
    public Engineer(){
        //call super constructor
        super();
    }

    //override the tostring method to use toString specifically for Engineer class
    @Override
    public String toString(){

        //returns properties of the Engineer class inlcuding properties of super class
        return super.toString()+ System.getProperty("line.separator")+"Actual Pay (After tax): " + actualPay()
                +System.getProperty("line.separator")+"Annual Pay (After tax): " + calcAnnual();

    }

}
