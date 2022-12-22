package gson;
/**
 * gson
 *
 * @author Ankit Rawat
 * @since 21 Dec 2022
 */
public class Employee {

    private String name;
    private int salary;
    private int totalYearsInComp;

    /**
     * Return employee's name.
     *
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * Set employee's name
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Return Employee's salary.
     *
     * @return name
     */
    public int getSalary() {
        return salary;
    }

    /**
     * Set employee's salary
     *
     * @param salary
     */
    public void setSalary(int salary) {
        this.salary = salary;
    }

    /**
     * Return Employee's Total years in company.
     *
     * @return totalYearsInComp
     */
    public int getTotalYearsInComp() {
        return totalYearsInComp;
    }

    /**
     * Set employee's Total years in company
     *
     * @param totalYearsInComp
     */
    public void setTotalYearsInComp(int totalYearsInComp) {
        this.totalYearsInComp = totalYearsInComp;
    }


    public String toString()
    {
        return "Employee [name=" + name+ ", Total years in company=" + totalYearsInComp + ", salary=" + salary + "]";
    }
}
