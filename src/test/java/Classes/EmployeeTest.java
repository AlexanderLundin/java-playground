package Classes;

import org.junit.Test;

import static org.junit.Assert.*;

public class EmployeeTest {

    public boolean isEmployee (Object o){
        return o instanceof Employee;
    }

    public boolean isManager (Object o){
        return o instanceof Manager;
    }

    public boolean isCustomer (Object o){
        return o instanceof Customer;
    }

    public boolean isComparable (Object o){
        return o instanceof Comparable;
    }

    @Test
    public void TestInstanceOf() {


        //Setup
        User user = new User();
        Employee employee = new Employee();
        Manager manager = new Manager();
        Customer customer = new Customer();
        boolean isEmployee = isEmployee(employee);
        boolean isManager = isManager(employee);
        boolean isCustomer = isCustomer(employee);
        boolean isComparable = isComparable(employee);

        //Exercise
        //Assert
        assertTrue(isComparable);
        //Teardown
    }

}