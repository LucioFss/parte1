public abstract class Employee{
    public String name;
    public float totalSalary;

    public Employee(String name){
        this.name = name;
        this.totalSalary = 0;
    }

    public abstract void calculatePayment();

    public float getTotalSalary(){
        return totalSalary;
    }
    public void setTotalSalary(float newTotalSalary){
        totalSalary = newTotalSalary;
    }

    public String getName(){
        return name;
    }
}