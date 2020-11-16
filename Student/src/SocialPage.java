public class SocialPage {

    private Student student;

    public SocialPage(Student student){
        this.student = student;
    }

    @Override
    public String toString(){
        String eigenaar = "Dit is de pagina van: " + this.student.getName();
        return eigenaar;
    }
}
