public class StudentReport {
    public void generateReport(StudentModel student) {
        System.out.println("=== Reporte de Estudiante ===");
        System.out.println("Nombre: " + student.getName());
        System.out.println("Edad: " + student.getAge());
        System.out.println("Código: " + student.getCode());
    }
}
