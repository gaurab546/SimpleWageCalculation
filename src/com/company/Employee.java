package com.company;

public class Employee {

    private String name;
    private Double hourlyWage;
    private Double workingHour;
    private Double grossPay;
    private Double taxAmount;
    private Double netPay;

    public Employee(String name, Double hourlyWage, Double workingHour, Double grossPay, Double taxAmount, Double netPay) {
        this.name = name;
        this.hourlyWage = hourlyWage;
        this.workingHour = workingHour;
        this.grossPay = grossPay;
        this.taxAmount = taxAmount;
        this.netPay = netPay;
    }

    public Employee() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getHourlyWage() {
        return hourlyWage;
    }

    public void setHourlyWage(Double hourlyWage) {
        this.hourlyWage = hourlyWage;
    }

    public Double getWorkingHour() {
        return workingHour;
    }

    public void setWorkingHour(Double workingHour) {
        this.workingHour = workingHour;
    }

    public Double getGrossPay() {
        return grossPay;
    }

    public void setGrossPay(Double grossPay) {
        this.grossPay = grossPay;
    }

    public Double getTaxAmount() {
        return taxAmount;
    }

    public void setTaxAmount(Double taxAmount) {
        this.taxAmount = taxAmount;
    }

    public Double getNetPay() {
        return netPay;
    }

    public void setNetPay(Double netPay) {
        this.netPay = netPay;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", hourlyWage=" + hourlyWage +
                ", workingHour=" + workingHour +
                ", grossPay=" + grossPay +
                ", taxAmount=" + taxAmount +
                ", netPay=" + netPay +
                '}';
    }


    public Double calculation(double hourlyWage, double workingHour){

       grossPay = hourlyWage * workingHour;

        if (grossPay > 0 & grossPay <= 300)
            taxAmount = 0.1 * grossPay;
        else if( grossPay >300 & grossPay <= 500 )
            taxAmount = 0.13 * grossPay;
        else if( grossPay > 500 & grossPay <= 800)
            taxAmount = 0.16 * grossPay;
        else
            taxAmount = 0.18 * grossPay;


        netPay = grossPay - taxAmount;
        return netPay;
    }

    public void displayEmployee()
    {
        System.out.printf( "Employee's name: %s", name );
        System.out.printf( "\nNet Salary: ", + netPay );
    }
}
