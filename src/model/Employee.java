package model;

public class Employee {
    public String name, lastName, birth_date, PESEL, empl_date;
    public double salary_net;

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", birth_date='" + birth_date + '\'' +
                ", PESEL='" + PESEL + '\'' +
                ", empl_date='" + empl_date + '\'' +
                ", salary_net=" + salary_net +
                '}';
    }

    public Employee(String name, String lastName,String PESEL, String birth_date,  String empl_date, double salary_net) {
        this.name = name;
        this.lastName = lastName;
        this.birth_date = birth_date;
        this.PESEL = PESEL;
        this.empl_date = empl_date;
        this.salary_net = salary_net;
    }
}
