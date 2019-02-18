package controller;

import model.Employee;


public class Company {
    Employee employees[] = new Employee[10];
    int index = 0;

    public void addEmployee(
            String name,
            String lastname,
            String PESEL,
            String birth_date,
            String empl_date,
            double salary_net) {

        Employee e = new Employee(name, lastname, PESEL, birth_date, empl_date, salary_net);
        employees[index] = e;
        index++;
        System.out.println("Dodano pracownika: " + e);
    }

    public void getAllEmployess() {
        System.out.println("\n\nLista pracowników:");
        for (int i = 0; i < index; i++) {
            System.out.println(employees[i]);
        }
    }

    public Employee getEmployeeByPESEL(String PESEL_n) {
        for (int i = 0; i < index; i++) {
            if (employees[i].PESEL.equals(PESEL_n)) {
                return employees[i];
            }

        }
        return null;
    }

    public void setSalary (String PESEL, double newSalary){
        for (int i = 0; i < index; i++) {
            if (employees[i].PESEL.equals(PESEL)) {
                employees[i].salary_net = newSalary;

            }

        }

    }


    public static void main(String[] args) {
        Company c = new Company();
        c.addEmployee("Waldemar", "Gąbka", "65021184922", "1965", "1988", 3800);
        c.addEmployee("Maria", "Gąbka", "65021184923", "1965", "1999", 3300);
        c.addEmployee("Kazimierz", "Gąbka", "65021184924", "1965", "2018", 3400);

        //c.getAllEmployess();
        c.setSalary("65021184922", 1000);
        System.out.println(c.getEmployeeByPESEL("65021184922"));


    }


}
