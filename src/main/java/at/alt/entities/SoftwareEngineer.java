package at.alt.entities;

import jakarta.persistence.*;

import java.util.Objects;

@Table(
        name = "software-Engineer",
        uniqueConstraints = {
                @UniqueConstraint(name = "softwareEngineer_email_unique", columnNames = "email")
        })
@Entity(name = "SoftwareEngineer")
public class SoftwareEngineer {

    @Id
    @SequenceGenerator(
            name = "software_engineer",
            sequenceName = "software_engineer",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "software_engineer")
    @Column(
            name = "id",
            updatable = false)
    private int id;

    @Column(
            name = "name",
            nullable = false,
            columnDefinition = "TEXT"
    )
    private String name;

    @Column(
            name = "tech_stack",
            nullable = false,
            columnDefinition = "TEXT"
    )
    private String techStack;

    @Column(columnDefinition = "TEXT")
    private String learningPathRecommendation;

    @Column(
            name = "email",
            nullable = false,
            columnDefinition = "TEXT"
    )
    private String email;


    public SoftwareEngineer(
            String name,
            String techStack, String learningPathRecommendation, String email) {
        this.name = name;
        this.techStack = techStack;
        this.learningPathRecommendation = learningPathRecommendation;
        this.email = email;
    }

    public SoftwareEngineer() {
    }

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

    public String getTechStack() {
        return techStack;
    }

    public void setTechStack(String techStack) {
        this.techStack = techStack;
    }

    public String getLearningPathRecommendation() {
        return learningPathRecommendation;
    }

    public void setLearningPathRecommendation(String learningPathRecommendation) {
        this.learningPathRecommendation = learningPathRecommendation;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        SoftwareEngineer that = (SoftwareEngineer) o;
        return id == that.id && Objects.equals(name, that.name) && Objects.equals(techStack, that.techStack) && Objects.equals(learningPathRecommendation, that.learningPathRecommendation) && Objects.equals(email, that.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, techStack, learningPathRecommendation, email);
    }

    @Override
    public String toString() {
        return "SoftwareEngineer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", techStack='" + techStack + '\'' +
                ", learningPathRecommendation='" + learningPathRecommendation + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
