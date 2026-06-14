package edu.TeamRocket.service.impl;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

import edu.TeamRocket.model.Department;
import edu.TeamRocket.model.Employee;
import edu.TeamRocket.model.ExperienceLevel;
import edu.TeamRocket.model.Shift;

public class EmployeeManagementServiceImplTest {

    // Variable global para usar el servicio en todos los tests
    private EmployeeManagementServiceImpl service;

    // Esta etiqueta ejecuta este método ANTES de cada test para tener un servicio limpio
    @Before
    void setUp() {
        service = new EmployeeManagementServiceImpl();
    }

    // TEST 1: Comprobar que createEmployee guarda al empleado y devuelve el objeto correcto
    @Test
    void testCreateEmployee() {
        // 1. Ejecutamos la acción
        Employee emp = service.createEmployee("Homer Simpson", 1, Department.SECURITY, Shift.MORNING, ExperienceLevel.NOVATO);

        // 2. Comprobamos que el empleado devuelto tiene los datos correctos
        assertNotNull(emp, "El empleado devuelto no debería ser nulo");
        assertEquals("Homer Simpson", emp.getName());
        assertEquals(1, emp.getId());
    }

    // TEST 2: Comprobar que crewSize cuenta correctamente cuántos empleados se van añadiendo
    @Test
    void testCrewSize() {
        // Al principio la lista debe estar vacía (0 empleados)
        assertEquals(0, service.crewSize(), "Al iniciar, la plantilla debe ser 0");

        // Añadimos el primer empleado
        service.createEmployee("Homer Simpson", 1, Department.SECURITY, Shift.MORNING, ExperienceLevel.NOVATO);
        assertEquals(1, service.crewSize(), "Tras añadir uno, el tamaño debe ser 1");

        // Añadimos un segundo empleado
        service.createEmployee("Lenny Leonard", 2, Department.SECURITY, Shift.AFTERNOON, ExperienceLevel.INTERMEDIO);
        assertEquals(2, service.crewSize(), "Tras añadir otro, el tamaño debe ser 2");
    }

    // TEST 3: Comprobar que listCrew devuelve la lista real con los empleados guardados
    @Test
    void testListCrew() {
        // Añadimos un empleado de prueba
        Employee creado = service.createEmployee("Carl Carlson", 3, Department.MAINTENANCE, Shift.NIGHT, ExperienceLevel.INTERMEDIO);

        // Obtenemos la lista del servicio
        List<Employee> lista = service.listCrew();

        // Comprobaciones de la lista
        assertNotNull(lista, "La lista devuelta no debe ser nula");
        assertEquals(1, lista.size(), "La lista debe contener exactamente 1 empleado");
        
        // Comprobamos que el empleado que está dentro de la lista sea el mismo que creamos
        assertEquals(creado, lista.get(0), "El empleado en la lista debe ser el que acabamos de crear");
    }

}
