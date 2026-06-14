package edu.TeamRocket.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import edu.TeamRocket.model.Department;
import edu.TeamRocket.model.Employee;
import edu.TeamRocket.model.ExperienceLevel;
import edu.TeamRocket.model.Shift;
import edu.TeamRocket.service.EmployeeManagementService;

public class EmployeeManagementServiceImpl implements EmployeeManagementService {

    private final List<Employee> crew = new ArrayList<>();
    
    @Override

    public Employee createEmployee ( String Nombre, int Id , Department Department , Shift Shift , ExperienceLevel ExperienceLevel){

    Employee newEmployee = createEmployee( Nombre,  Id ,  Department ,  Shift ,  ExperienceLevel);

    this.crew.add(newEmployee);

    return newEmployee;
    }

    @Override

    public  int crewSize(){
        return this.crew.size();
    }

    @Override 

    public List <Employee> listCrew() {
        return this.crew;
    }

    @Override

    public List <Employee> findEmployeesByDepartment(Department department){
        return null;
    }

    @Override
    public void changeEmployeeExperienceLevel(Employee employee, ExperienceLevel newLevel){


    }

    public Map<String , Long> getExperienceLevelStatistics(){
        return null;
    }

    public boolean isDepartmentFullyCovered(Department department){
        return false;
    }
    

}
