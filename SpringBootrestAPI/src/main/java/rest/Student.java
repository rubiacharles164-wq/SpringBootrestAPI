package rest;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;



@Entity
public class Student {
    @Id
    @SequenceGenerator(name = "student_sequence", sequenceName = "player_sequence", allocationSize = 1, initialValue = 1)
    @GeneratedValue(generator = "player_sequence")
    private long id;
    private String Name;
    private String Email;
    private String Course;


    public long getid() {
        return id;
    }

    public void setid(int id) {
        this.id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getCourse() {
        return Course;
    }

    public void setCourse(String course) {
        Course = course;
    }

}
