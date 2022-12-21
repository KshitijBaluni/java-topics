package gson;
public class Employee {
    private String name;
    private int salary;
    private int totalYearsInComp;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getSalary() {
        return salary;
    }
    public void setSalary(int salary) {
        this.salary = salary;
    }
    public int getTotalYearsInComp() {
        return totalYearsInComp;
    }

    public void setTotalYearsInComp(int totalYearsInComp) {
        this.totalYearsInComp = totalYearsInComp;
    }
    public String toString()
    {
        return "Employee [name=" + name+ ", Total years in company=" + totalYearsInComp + ", salary=" + salary + "]";
    }
}
