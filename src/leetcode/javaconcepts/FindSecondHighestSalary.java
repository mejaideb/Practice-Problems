package leetcode.javaconcepts;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class FindSecondHighestSalary {
    public static void main(String[] args) {
        FindSecondHighestSalary f=new FindSecondHighestSalary();
        f.secondHighestSalary();
    }

    private void secondHighestSalary() {
        List<Employee> employees=new ArrayList<>();
        employees.add(new Employee(1,8000,"Tony"));
        employees.add(new Employee(2,5000,"krishna"));
        employees.add(new Employee(3,9000,"stark"));
        employees.add(new Employee(4,10000,"john"));

        List<Employee> employeeList = employees.stream().sorted(Comparator.comparingDouble(Employee::getSalary)
                .reversed()).collect(Collectors.toList());
        System.out.println(employeeList.get(1).getSalary());
    }
}
