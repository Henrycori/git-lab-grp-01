public class StudentReport {

    public void printDetailed(StudentModel student) {
        System.out.println("=== Reporte Detallado ===");
        System.out.println("Nombre: " + student.getName());
        System.out.println("Edad: " + student.getAge());
        System.out.println("Código: " + student.getCode());
        System.out.println("Resumen: " + student.toString());
    }

    public void printSummary(StudentModel student) {
        System.out.println("Resumen: " + student.toString());
    }

    public void generateReport(StudentModel student) {
        System.out.println("=== Reporte de Estudiante ===");
        System.out.println("Nombre: " + student.getName());
        System.out.println("Edad: " + student.getAge());
        System.out.println("Código: " + student.getCode());
    }
}


