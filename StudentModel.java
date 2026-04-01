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
