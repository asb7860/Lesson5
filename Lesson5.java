/**
 * Java 1. Homework 5
 * 
 * @author Anna Bauer
 * @version 21.11.2021
 */



class Lesson5 {
    public static void main (String[] args) {
        Employee[] employees = {
            new Employee("Bauer Sasha", "Ressiver", 
                "bauer@gmail.com", "565656", 50000, 23),
            new Employee("Bauer Anna", "Food Safety", 
                "anna@mail.ru", "232323", 55000, 34),
            new Employee("Pakhotin Sergey", "Engineer",
                "sergey@gmail.com", "775577", 90000, 35),
            new Employee("Ivanov Petr", "Actor",
                "petriv@mail.ru","231199", 65000, 31),
            new Employee("Kustos Vova", "Safety Engineer",
                "kust@gmail.com", "270306", 560000, 24)
        };

        for (Employee employee : employees) {
            if (employee.getAge() > 40) {
                System.out.println (employee);
            }
        }
    }
}

class Employee {
    private String name;
    private String position;
    private String email;
    private String phone;
    private int salary;
    private int age;

    public Employee(String name, String position, String email, String phone,
            int salary, int age) {
        this.name = name;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
       return (name +
            "\n| Position: " + position +
            "\n| Email: " + email +
            "\n| Phone: " + phone +
            "\n| Salary: " + salary +
            "\n| Age: " + age);
    }
}