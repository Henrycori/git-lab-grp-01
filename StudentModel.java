public class StudentModel {
    private String name;
    private int age;
    private String code;

    public StudentModel(String name, int age, String code) {
        this.name = name;
        this.age = age;
        this.code = code;
    }

    public String getName() { return name; }
    public int getAge() { return age; }
    public String getCode() { return code; }
}

@Override
public String toString() {
    return "Estudiante: " + name + " | Edad: " + age + " | Código: " + code;
}
public void setName(String name) { this.name = name; }
public void setAge(int age) { this.age = age; }
public void setCode(String code) { this.code = code; }
