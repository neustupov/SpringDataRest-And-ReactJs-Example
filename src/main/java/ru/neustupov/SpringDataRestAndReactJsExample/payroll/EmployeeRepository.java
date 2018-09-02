package ru.neustupov.SpringDataRestAndReactJsExample.payroll;

import org.springframework.data.repository.CrudRepository;

public interface EmployeeRepository extends CrudRepository<Employee, Long> {
}
