package edu.TeamRocket.service;
import edu.TeamRocket.model.Employee;
import edu.TeamRocket.model.Department;
import edu.TeamRocket.model.Shift;
import edu.TeamRocket.model.ExperienceLevel;
import java.util.List;
import java.util.Map;


public interface EmployeeManagementService {

    Employee ceraeteEmployee ( String Nombre, Integer Id , Department Department , Shift Shift , ExperienceLevel ExperienceLevel);
    

}
