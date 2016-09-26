package seminars.entities;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table (name = "professor")

public class Professor {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @NotNull
    private Integer id;

    @NotNull
    @Column(name = "fname")
    private String firstName;

    @NotNull
    @Column(name = "lname")
    private String lastName;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
