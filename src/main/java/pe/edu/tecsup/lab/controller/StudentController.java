package pe.edu.tecsup.lab.controller;

import java.util.ArrayList;
import java.util.List;

public class StudentController {

    public List<String> getStudents() {
        List<String> students = new ArrayList<>();
        
        students.add("Estudiante 1");
        students.add("Estudiante 2");
        students.add("Estudiante 3");
        
        return students;
    }
}