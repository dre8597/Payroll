
package payroll;

import java.awt.*;
import java.util.ArrayList;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;




//payroll GUI class extends Jframe class
public class PayrollGUI extends javax.swing.JFrame{
    //boolean for error detection
    private Boolean error = false;

    //create an arraylist of type employee
    private ArrayList<Employee> employee = new ArrayList();
    /**
     * Creates new form PayrollGUI
     */
    public PayrollGUI() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        firstNameTextBox = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lastNameTextBox = new javax.swing.JTextField();
        calcCurrentPayButton = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        displayAnnualPaymentsButton = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        addressTextBox = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();
        socialSecurityTextBox = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        telephoneTextBox = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        monthlyPayrateTextBox = new javax.swing.JTextField();
        employeeTypeComboBox = new javax.swing.JComboBox();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ResultsLabel = new javax.swing.JTextArea();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        resultsLabel = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        overTimePayRateTextBox = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        overtimeHoursTextBox = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        managerBonusCheckBox = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("First Name");

        jLabel2.setText("Last Name");

        calcCurrentPayButton.setText("Calculate Current Employee Payment");
        calcCurrentPayButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calcCurrentPayButtonActionPerformed(evt);
            }
        });

        jLabel3.setText("Address");

        displayAnnualPaymentsButton.setText("Request all Annual Payments");
        displayAnnualPaymentsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                displayAnnualPaymentsButtonActionPerformed(evt);
            }
        });

        addressTextBox.setColumns(20);
        addressTextBox.setRows(5);
        jScrollPane2.setViewportView(addressTextBox);

        jLabel4.setText("Social Security Number");

        jLabel5.setText("Telephone");

        jLabel6.setText("Monthly Pay");

        monthlyPayrateTextBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                monthlyPayrateTextBoxActionPerformed(evt);
            }
        });

        employeeTypeComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Manager", "Engineer", "Technician" }));

        jLabel8.setText("Employee Type");

        ResultsLabel.setEditable(false);
        ResultsLabel.setColumns(20);
        ResultsLabel.setRows(5);
        jScrollPane1.setViewportView(ResultsLabel);
        jScrollPane1.setBackground(Color.RED);

        jLabel10.setFont(new java.awt.Font("Lucida Grande", 2, 10)); // NOI18N
        jLabel10.setText("(xxxXXXxxx) omit dashes");

        jLabel11.setFont(new java.awt.Font("Lucida Grande", 2, 10)); // NOI18N
        jLabel11.setText("(xxxXXXxxxx) omit dashes");

        jLabel12.setFont(new java.awt.Font("Lucida Grande", 2, 10)); // NOI18N
        jLabel12.setText("(omit $)");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Technician Options"));
        jPanel1.setName(""); // NOI18N

        jLabel7.setText("Overtime Hourly Payrate ");

        overTimePayRateTextBox.setText("0.00");
        overTimePayRateTextBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                overTimePayRateTextBoxActionPerformed(evt);
            }
        });

        jLabel9.setText("Overtime Hours");

        jLabel13.setFont(new java.awt.Font("Lucida Grande", 2, 10)); // NOI18N
        jLabel13.setText("If no OT hours Enter 0");

        overtimeHoursTextBox.setText("0");

        jLabel14.setFont(new java.awt.Font("Lucida Grande", 2, 10)); // NOI18N
        jLabel14.setText("If no OT hours Enter 0");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel7)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel14))
                                        .addComponent(overTimePayRateTextBox, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(6, 6, 6)
                                                .addComponent(jLabel9)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jLabel13))
                                        .addComponent(overtimeHoursTextBox, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(41, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel7)
                                        .addComponent(jLabel14))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(overTimePayRateTextBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel9)
                                        .addComponent(jLabel13))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(overtimeHoursTextBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Manager Options"));

        managerBonusCheckBox.setText("Include Manager Bonus?");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(managerBonusCheckBox)
                                .addContainerGap(36, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(managerBonusCheckBox)
                                .addGap(0, 12, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(jLabel5)
                                                                .addGap(0, 0, Short.MAX_VALUE))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(jLabel11)
                                                                        .addComponent(telephoneTextBox, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGap(90, 90, 90)
                                                                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                                .addGap(19, 19, 19)
                                                .addComponent(resultsLabel)
                                                .addGap(435, 435, 435))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(firstNameTextBox, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(lastNameTextBox, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jLabel4)
                                                        .addComponent(socialSecurityTextBox, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGap(8, 8, 8)
                                                                .addComponent(jLabel1))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGap(6, 6, 6)
                                                                .addComponent(jLabel2))
                                                        .addComponent(jLabel10)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(392, 392, 392)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(displayAnnualPaymentsButton)
                                                                        .addComponent(calcCurrentPayButton)))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(jLabel3)
                                                                .addGap(169, 169, 169)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(employeeTypeComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(jLabel8)
                                                                        .addComponent(monthlyPayrateTextBox, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addGroup(layout.createSequentialGroup()
                                                                                .addComponent(jLabel6)
                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                .addComponent(jLabel12)))
                                                                .addGap(31, 31, 31)
                                                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 387, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGap(24, 24, 24)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                        .addComponent(jLabel6)
                                                                        .addComponent(jLabel12))
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(monthlyPayrateTextBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(12, 12, 12)
                                                                .addComponent(jLabel8)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addComponent(employeeTypeComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addContainerGap()
                                                                .addComponent(resultsLabel)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(calcCurrentPayButton)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addComponent(displayAnnualPaymentsButton))))
                                        .addGroup(layout.createSequentialGroup()
                                                .addContainerGap()
                                                .addComponent(jLabel1)
                                                .addGap(10, 10, 10)
                                                .addComponent(firstNameTextBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(8, 8, 8)
                                                .addComponent(jLabel2)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(lastNameTextBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(jLabel4)
                                                .addGap(2, 2, 2)
                                                .addComponent(jLabel10)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(socialSecurityTextBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel3)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(jLabel5)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel11)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(telephoneTextBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(20, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    //calculate current pay action performed
    private void calcCurrentPayButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calcCurrentPayButtonActionPerformed

        // Determine our employee type
        String employeeType = (String) employeeTypeComboBox.getSelectedItem();

        // Get employee information from form
        String firstName = firstNameTextBox.getText();
        String lastName = lastNameTextBox.getText();
        String social = socialSecurityTextBox.getText();
        String address = addressTextBox.getText();
        String telephone = telephoneTextBox.getText();
        String overTimePayRate = overTimePayRateTextBox.getText(); // parseDouble
        String monthlyPayRate = monthlyPayrateTextBox.getText(); // parseDouble
        String overTimeHours = overtimeHoursTextBox.getText(); // parseDouble


        // The following statements check if a field was left blank in the form when the calc current pay button is clicked
        //check first name field
        if(firstName.isEmpty())
        {
            this.error = true;
            JOptionPane.showMessageDialog(null, "First name field is empty", "Error",
                    JOptionPane.ERROR_MESSAGE);
        }

        //checks last name field
        if(lastName.isEmpty())
        {
            this.error = true;
            JOptionPane.showMessageDialog(null, "Last name field is empty", "Error",
                    JOptionPane.ERROR_MESSAGE);
        }

        //checks social sec num field
        if(social.isEmpty())
        {
            this.error = true;
            JOptionPane.showMessageDialog(null, "Social security number field is empty", "Error",
                    JOptionPane.ERROR_MESSAGE);
        }

        //checks address field
        if(address.isEmpty())
        {
            this.error = true;
            JOptionPane.showMessageDialog(null, "Address field is empty", "Error",
                    JOptionPane.ERROR_MESSAGE);
        }

        //checks telephone field
        if(telephone.isEmpty())
        {
            this.error = true;
            JOptionPane.showMessageDialog(null, "Telephone number field is empty", "Error",
                    JOptionPane.ERROR_MESSAGE);
        }



        // if manager bonus box is selected and employee type is not a manager show error
        if(managerBonusCheckBox.isSelected() && !"Manager".equals(employeeType))
        {
            this.error = true;
            JOptionPane.showMessageDialog(null, "Only a manager may have a bonus", "Error",
                    JOptionPane.ERROR_MESSAGE);     //error message
        }




        double overTime = Double.parseDouble(overTimePayRateTextBox.getText()); // parseDouble

        double oTHours = Double.parseDouble(overtimeHoursTextBox.getText()); // parseDouble


        //if manager or engineer is selected and user tries to fill in overtime error is shown
        if(overTime>0 && oTHours>0 && !"Technician".equals(employeeType)){

            this.error = true;
            JOptionPane.showMessageDialog(null, "Only a Technician can have overtime", "Error",
                    JOptionPane.ERROR_MESSAGE);

        }

        //if there is an error the following code executes based on the error
        if(!this.error)
        {
            //pattern matcher to make sure proper format is entered into each box
            Pattern numeric = Pattern.compile("^([0-9]+(\\\\.[0-9]+)?)+");

            Boolean ssn = numeric.matcher(social).find() ? true : false; //pattern matcher ssn box and get amount
            Boolean tele = numeric.matcher(telephone).find() ? true : false;  //pattern matcher for telephone box and get amount
            Boolean mPayRate = numeric.matcher(monthlyPayRate).find() ? true : false; //pattern matcher for hours worked box and get amount
            Boolean oTimePayRate = numeric.matcher(overTimePayRate).find() ? true : false; //pattern matcher for hourly pay box and get amount
            Boolean oTimeHours = numeric.matcher(overTimeHours).find() ? true : false; // pattern matcher for overtime hours

            //if employee type is a technician
            if("Technician".equals(employeeType))
            {



                if(!oTimePayRate)
                {
                    this.error = true;
                    //if the amount entered in OT box is invalid show error
                    JOptionPane.showMessageDialog(null, "Over time number is not a valid number. If no overtime enter 0", "Error",
                            JOptionPane.ERROR_MESSAGE);
                }

                if(!oTimeHours)
                {
                    this.error = true;
                    //if the amount entered in OT box is invalid show error
                    JOptionPane.showMessageDialog(null, "Over time hour number is not a valid number. If no overtime enter 0", "Error",
                            JOptionPane.ERROR_MESSAGE);
                }



            }

            //if ssn entered does not match pattern
            if(!ssn)
            {
                //show an error message
                this.error = true;
                JOptionPane.showMessageDialog(null, "Social security number is not a valid number.", "Error",
                        JOptionPane.ERROR_MESSAGE);
            }

            //if telephone entered does not match pattern
            if(!tele)
            {
                //show an error message
                this.error = true;
                JOptionPane.showMessageDialog(null, "Telephone number is not a valid number.", "Error",
                        JOptionPane.ERROR_MESSAGE);
            }
        }




        // If there are not any errors, we now proceed to store results and save
        if(!this.error)
        {
            // variables to store values from textboxes
            double mP, oTP, oTH, total, tax;
            switch(employeeType)  //switch statement switches based on employee type selected
            {
                //if a technician is selected
                case "Technician":
                    //create an object of techincian class
                    Technician t = new Technician();

                    //set properties of the technician
                    t.setFirstName(firstName);
                    t.setLastName(lastName);
                    t.setSocialSecurityNumber(social);
                    t.setAddress(address);
                    t.setTelephone(telephone);
                    t.setTaxRate(.20);
                    mP = Double.parseDouble(monthlyPayRate);
                    t.setMonthlyPay(mP);
                    oTH = Double.parseDouble(overTimeHours);
                    t.setOvertimeHours(oTH);
                    oTP = Double.parseDouble(overTimePayRate);
                    t.setOvertimePayrate(oTP);

                    // add this employee info to employee arraylist
                    this.employee.add(t);


                    //show employee info in results box
                    ResultsLabel.setText(t.toString());

                    //clear all fields
                    firstNameTextBox.setText("");
                    lastNameTextBox.setText("");
                    socialSecurityTextBox.setText("");
                    addressTextBox.setText("");
                    telephoneTextBox.setText("");
                    overTimePayRateTextBox.setText("0.00");
                    monthlyPayrateTextBox.setText("");
                    overtimeHoursTextBox.setText("0");
                    break;

                // if employee type is a manager
                case "Manager":

                    //create object of manager class
                    Manager m = new Manager();

                    //set all properties of a manager
                    m.setFirstName(firstName);
                    m.setLastName(lastName);
                    m.setSocialSecurityNumber(social);
                    m.setAddress(address);
                    m.setTelephone(telephone);
                    m.setMonthlyPay(Double.parseDouble(monthlyPayRate));

                    //if the manager bonus checkbox is selected
                    if(managerBonusCheckBox.isSelected())
                    {
                        m.setBonusPay(0.03);  //set bonus pay amount
                    }


                    m.setTaxRate(.20);



                    this.employee.add(m); // add manager to employee arraylist
                    //show results in the results box
                    ResultsLabel.setText(m.toString());
                    //clear all fields
                    firstNameTextBox.setText("");
                    lastNameTextBox.setText("");
                    socialSecurityTextBox.setText("");
                    addressTextBox.setText("");
                    telephoneTextBox.setText("");
                    overTimePayRateTextBox.setText("0.00");
                    monthlyPayrateTextBox.setText("");
                    overtimeHoursTextBox.setText("0");
                    managerBonusCheckBox.setSelected(false);
                    break;

                //if engineer is selected
                case "Engineer":
                    //create engineer object
                    Engineer e = new Engineer();

                    //set all engineer properties
                    e.setFirstName(firstName);
                    e.setLastName(lastName);
                    e.setSocialSecurityNumber(social);
                    e.setAddress(address);
                    e.setTelephone(telephone);
                    e.setMonthlyPay(Double.parseDouble(monthlyPayRate));
                    e.setTaxRate(.20);
                    //add to employee array list
                    this.employee.add(e);

                    //show results in the results box
                    ResultsLabel.setText(e.toString());
                    //clear all fields
                    firstNameTextBox.setText("");
                    lastNameTextBox.setText("");
                    socialSecurityTextBox.setText("");
                    addressTextBox.setText("");
                    telephoneTextBox.setText("");
                    overTimePayRateTextBox.setText("0.00");
                    monthlyPayrateTextBox.setText("");
                    overtimeHoursTextBox.setText("0");
                    break;
            }
            //if an error message was given allow program to keep running
        } else {
            this.error = false;
        }

        //when calc button is clicked this label shows which employee we are currently viewing results for
        resultsLabel.setText("Currently Displaying Results for: "+firstName+" "+lastName);

    }//GEN-LAST:event_calcCurrentPayButtonActionPerformed


    //this button shows all information stored in the employee arraylist when clicked
    //annual payment information action performed
    private void displayAnnualPaymentsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_displayAnnualPaymentsButtonActionPerformed
        // Generate list
        String list = "";

        //for loop goes through entire array list
        for(int i = 0; i < this.employee.size(); i++)
        {
            //get all items in the array list
            list += this.employee.get(i).toString() + System.getProperty("line.separator")+ System.getProperty("line.separator");


        }

        //show all items in the array list in the result box
        ResultsLabel.setText(list + " ");

        resultsLabel.setText("Currently Displaying Results for all Annual Payments");

    }//GEN-LAST:event_displayAnnualPaymentsButtonActionPerformed

    private void monthlyPayrateTextBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_monthlyPayrateTextBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_monthlyPayrateTextBoxActionPerformed

    private void overTimePayRateTextBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_overTimePayRateTextBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_overTimePayRateTextBoxActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PayrollGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PayrollGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PayrollGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PayrollGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PayrollGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea ResultsLabel;
    private javax.swing.JTextArea addressTextBox;
    private javax.swing.JButton calcCurrentPayButton;
    private javax.swing.JButton displayAnnualPaymentsButton;
    private javax.swing.JComboBox employeeTypeComboBox;
    private javax.swing.JTextField firstNameTextBox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField lastNameTextBox;
    private javax.swing.JCheckBox managerBonusCheckBox;
    private javax.swing.JTextField monthlyPayrateTextBox;
    private javax.swing.JTextField overTimePayRateTextBox;
    private javax.swing.JTextField overtimeHoursTextBox;
    private javax.swing.JLabel resultsLabel;
    private javax.swing.JTextField socialSecurityTextBox;
    private javax.swing.JTextField telephoneTextBox;
    // End of variables declaration//GEN-END:variables
}
