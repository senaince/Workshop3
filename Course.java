package Kodlamaio;

public class Course {

    private int id;
    private String name;
    private String tutor;
    private String description;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTutor() {
        return tutor;
    }

    public void setTutor(String tutor) {
        this.tutor = tutor;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Course(int id, String name, String tutor, String description) {
        this.id = id;
        this.name = name;
        this.tutor = tutor;
        this.description = description;
    }

    public Course(){
    }
}