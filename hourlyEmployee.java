public class hourlyEmployee extends Employee{
    private final float hoursWorked;
    private final float  hourlyRates;

    public hourlyEmployee(String name,float hoursWorked,float hourlyRates){
        super(name);
        this.hoursWorked = hoursWorked;
        this.hourlyRates = hourlyRates;
    }

    @Override
    public void calculatePayment(){
        setTotalSalary(hoursWorked * hourlyRates);
    }


}
