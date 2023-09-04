package HW;

public class HW_7_2 {

    /*Создать класс Конспект. Класс должен содержать следующие поля:

    ФИО студента;
    Название предмета;
    Количество страниц;
    Год выпуска;
    Цвет обложки.
    Название заведения, где учится студент;*/

    private String studentName;        // Full name of the student
    private String subjectName;        // Name of the subject
    private int numberOfPages;         // Number of pages
    private int yearOfPublication;     // Year of publication
    private String coverColor;         // Color of the cover
    private String institutionName;    // Name of the institution where the student studies

    // Constructor
    public void Summary (String studentName, String subjectName, int numberOfPages, int yearOfPublication, String coverColor, String institutionName) {
        this.studentName = studentName;
        this.subjectName = subjectName;
        this.numberOfPages = numberOfPages;
        this.yearOfPublication = yearOfPublication;
        this.coverColor = coverColor;
        this.institutionName = institutionName;
    }

    // Getters and Setters
    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    public int getYearOfPublication() {
        return yearOfPublication;
    }

    public void setYearOfPublication(int yearOfPublication) {
        this.yearOfPublication = yearOfPublication;
    }

    public String getCoverColor() {
        return coverColor;
    }

    public void setCoverColor(String coverColor) {
        this.coverColor = coverColor;
    }

    public String getInstitutionName() {
        return institutionName;
    }

    public void setInstitutionName(String institutionName) {
        this.institutionName = institutionName;
    }

    @Override
    public String toString() {
        return "Summary {" +
                "Student's Full Name='" + studentName + '\'' +
                ", Subject Name='" + subjectName + '\'' +
                ", Number of Pages=" + numberOfPages +
                ", Year of Publication=" + yearOfPublication +
                ", Cover Color='" + coverColor + '\'' +
                ", Institution Name='" + institutionName + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Summary summary = new Summary("John Doe", "Mathematics", 150, 2023, "Red", "Harvard University");
        System.out.println(summary);
    }
}
