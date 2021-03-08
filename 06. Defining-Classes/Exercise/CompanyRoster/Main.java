package CompanyRoster;

import CompanyRoster.Employee;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        Map<String, List<Employee>> mapOfDepartments = new HashMap<>();

        for (int i = 0; i < n; i++) {
            String[] data = scanner.nextLine().split("\\s+");
            String name = data[0];
            double salary = Double.parseDouble(data[1]);
            String position = data[2];
            String department = data[3];

            if (data.length == 4) {
                Employee employee = new Employee(name, salary, position, department);
                mapOfDepartments.putIfAbsent(department, new ArrayList<>());
                mapOfDepartments.get(department).add(employee);
            } else if (data.length == 5) {
                if (data[4].contains("@")) {
                    String email = data[4];
                    Employee employee = new Employee(name, salary, position, department, email);
                    mapOfDepartments.putIfAbsent(department, new ArrayList<>());
                    mapOfDepartments.get(department).add(employee);
                } else {
                    int age = Integer.parseInt(data[4]);
                    Employee employee = new Employee(name, salary, position, department, age);
                    mapOfDepartments.putIfAbsent(department, new ArrayList<>());
                    mapOfDepartments.get(department).add(employee);
                }

            } else if (data.length == 6) {
                String email = data[4];
                int age = Integer.parseInt(data[5]);
                Employee employee = new Employee(name, salary, position, department, email, age);
                mapOfDepartments.putIfAbsent(department, new ArrayList<>());
                mapOfDepartments.get(department).add(employee);
            }
        }

        String bestDepartment = "";
        double maxAvgSalary = Double.MIN_VALUE;

        for (Map.Entry<String, List<Employee>> entry : mapOfDepartments.entrySet()) {
            double sumSalary = 0;
            double avgSalary = 0;
            for (Employee employee : entry.getValue()) {
                sumSalary += employee.getSalary();
            }
            avgSalary = sumSalary/ entry.getValue().size();

            if (avgSalary > maxAvgSalary){
                maxAvgSalary = avgSalary;
                bestDepartment = entry.getKey();
            }
        }

        System.out.printf("Highest Average Salary: %s%n", bestDepartment);

        for (Map.Entry<String, List<Employee>> entry : mapOfDepartments.entrySet()) {
            if (entry.getKey().equals(bestDepartment)){
                entry.getValue().stream()
                        .sorted((f, s) -> Double.compare(s.getSalary(), f.getSalary()))
                        .forEach(p -> System.out.println(p.toString()));

            }
        }
    }
}
