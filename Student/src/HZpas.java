public class HZpas {
    private Student student;

    public HZpas(Student student){
        this.student = student;
    }

    @Override
    public String toString(){
    String gegevens = "Studentnummer: " + this.student.getStudentID();
    return gegevens;
    }
}