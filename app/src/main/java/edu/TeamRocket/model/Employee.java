package edu.TeamRocket.model;


public final class Employee {

    private String name;
    private final int id; 
    private Department department;
    private Shift shift;
    private ExperienceLevel experienceLevel;

    public Employee (String name , int id , Department department , Shift shift , ExperienceLevel experienceLevel){

        if (id <= 0) {
            throw new IllegalArgumentException("no se permiten numeros negativos como identificador id"); 
        }

        this.id = id;
        this.name = name;
        this.department = department;
        this.shift = shift;
        this.experienceLevel = experienceLevel;
    }

    public String getName() { return name; }
    public int getId() { return id; }
    public Department getDepartment() { return department; }
    public Shift getShift() { return shift; }
    public ExperienceLevel getExperienceLevel() { return experienceLevel; }

    public void setExperienceLevel(ExperienceLevel experienceLevel) {
        this.experienceLevel = experienceLevel;
    }

    @Override
    public String toString() {
        return String.format("Empleado [%d , %s, %s, %s, %s]", 
            id , name , department.name() , experienceLevel.name() , shift.name());
    }
}
