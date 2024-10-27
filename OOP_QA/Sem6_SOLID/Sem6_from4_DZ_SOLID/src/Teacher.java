

public class Teacher extends User {
    private Integer teacherId;


    public Teacher(String firstName, String lastName, String middleName) {
        super(firstName, lastName, middleName);
    }


    public Integer getTeacherId() {
        return teacherId;
    }


    public void setTeacherId(Integer teacherId) {
        this.teacherId = teacherId;
    }
}
