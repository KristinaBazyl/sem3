package services;

import Seminar4.Employee;

import java.util.List;

public interface EmployeeRepository extends Repository<Employee, Integer>{
    List<Employee> getByDepartamentId(int id);
}
