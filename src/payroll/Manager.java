package payroll;



//inherits from employee class
public class Manager extends Employee{

    //intialize all variables
    protected double bonusPay;
    protected double bonusAmount;
    protected double calcTotalBonus;

    /**
     * @return the bonusPay
     */

    //manager class constructor
    public Manager(){

        //call super class constructor
        super();
        //initialize vars to default values
        bonusPay= 0.0;
        bonusAmount = 0.0;
        calcTotalBonus = 0.0;


    }

    //override method to use specifcially for manager class
    @Override

    //calcs annual pay
    public double calcAnnual(){

        double pay = actualPay() * 12;

        return pay;

    }


    //override method to use specifcially for manager class
    @Override
    public double actualPay (){
        double pay;

        //if a manger has bonus pay calc pay with the bonus inlcuding tax
        if(bonusPay == 0)
        {
            pay = monthlyPay-(monthlyPay * taxRate);
        } else {

            //if a manager does not have bonus pay calc pay including tax
            double taxAmount =(getBonusPay()+monthlyPay) *taxRate;
            pay = (monthlyPay+getBonusPay()) - taxAmount;
        }


        return pay;
    }


    /**
     * @return the bonusPay
     */
    public double getBonusPay() {
        return monthlyPay*bonusPay;

    }

    /**
     * @param bonusPay the bonusPay to set
     */
    public void setBonusPay(double bonusPay) {
        this.bonusPay = bonusPay;
    }



    //override the tostring method to prevent overloading
    @Override
    public String toString(){

        //returns properties of the Manager class inlcuding properties of super class
        String show = super.toString()+System.getProperty("line.separator")+"Bonus Pay: "+
                getBonusPay()+System.getProperty("line.separator")+"Actual Pay (After tax inc. Bonus): " + actualPay()
                +System.getProperty("line.separator")+"Annual Pay (After tax inc. Bonus): " +calcAnnual();

        return show;
    }



}
