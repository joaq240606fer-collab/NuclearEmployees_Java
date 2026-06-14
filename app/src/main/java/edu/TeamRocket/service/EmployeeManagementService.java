package edu.TeamRocket.service;
import edu.TeamRocket.model.Employee;
import edu.TeamRocket.model.Department;
import edu.TeamRocket.model.Shift;
import edu.TeamRocket.model.ExperienceLevel;
import java.util.List;
import java.util.Map;


public interface EmployeeManagementService {

    Employee createEmployee ( String Nombre, int Id , Department Department , Shift Shift , ExperienceLevel ExperienceLevel);

    int crewSize();

    List <Employee> listCrew();
    
    List <Employee> findEmployeesByDepartment(Department department);

    void changeEmployeeExperienceLevel(Employee employee, ExperienceLevel newLevel);

    Map<String , Long> getExperienceLevelStatistics();

    boolean isDepartmentFullyCovered(Department department);
    
    

}
