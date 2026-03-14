class Student {
    private int studentId;
    private String name;
    private double gpa;
    private String gender;

    public Student(int studentId, String name, double gpa, String gender) {
        this.studentId = studentId;
        this.name = name;
        this.gpa = gpa;
        this.gender = gender;
    }

    public int getStudentId() {
        return studentId;
    }

    public String getName() {
        return name;
    }

    public double getGpa() {
        return gpa;
    }

    public String getGender() {
        return gender;
    }

    public String toString() {
        return "ID: " + studentId + " Name: " + name + " GPA: " + gpa + " Gender: " + gender;
    }
}