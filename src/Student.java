public class Student {
    private long ControlNunmber;
    private String name;
    private String lastName;
    private String career;
    private String semester;

    public long getControlNunmber() {
        return ControlNunmber;
    }

    public void setControlNunmber(long controlNunmber) {
        ControlNunmber = controlNunmber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCareer() {
        return career;
    }

    public void setCareer(String career) {
        this.career = career;
    }

    public String getSemester() {
        return semester;
    }

    public void setSemester(String semester) {
        this.semester = semester;
    }
}
