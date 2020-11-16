
public class Student {
    private String name;
    private int age;
    private int studentID;
    private String course_fav;

    Student(String name,int age,int studentID,String course_fav){
       this.name = name;
       this.age = age;
       this.studentID = studentID;
       this.course_fav = course_fav;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getStudentID() {
        return studentID;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    public String getCourse_fav() {
        return course_fav;
    }

    public void setCourse_fav(String course_fav) {
        this.course_fav = course_fav;
    }
}