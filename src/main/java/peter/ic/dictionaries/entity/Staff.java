package peter.ic.dictionaries.entity;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;

@Entity
public class Staff {

    @Id
    private int id;

    @Column(unique = true, columnDefinition = "VARCHAR")
    private String SNILS;

    @Column(unique = true, columnDefinition = "VARCHAR")
    private String username;

    @Column(columnDefinition = "VARCHAR")
    private String lastName;

    @Column(columnDefinition = "VARCHAR")
    private String firstName;

    @Column(columnDefinition = "VARCHAR")
    private String surname;

    private Date dateOfBirth;
    private Gender gender;

    @ManyToOne(targetEntity = Department.class)
    private Department department;

    @ManyToOne(targetEntity = Post.class)
    private Post post;

    @ManyToOne(targetEntity = Rank.class)
    private Rank rank;

    @Column(columnDefinition = "VARCHAR")
    private String contacts;

    @Column(columnDefinition = "VARCHAR")
    private String email;

    private Date dateOfDismissal;

    @Column(columnDefinition = "VARCHAR")
    private String comment;

    private boolean active;

    @ManyToMany
    private Set<InformationSystem> informationSystemSet;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSNILS() {
        return SNILS;
    }

    public void setSNILS(String SNILS) {
        this.SNILS = SNILS;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public Post getPost() {
        return post;
    }

    public void setPost(Post post) {
        this.post = post;
    }

    public Rank getRank() {
        return rank;
    }

    public void setRank(Rank rank) {
        this.rank = rank;
    }

    public String getContacts() {
        return contacts;
    }

    public void setContacts(String contacts) {
        this.contacts = contacts;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getDateOfDismissal() {
        return dateOfDismissal;
    }

    public void setDateOfDismissal(Date dateOfDismissal) {
        this.dateOfDismissal = dateOfDismissal;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public Set<InformationSystem> getInformationSystemSet() {
        return informationSystemSet;
    }

    public void setInformationSystemSet(Set<InformationSystem> informationSystemSet) {
        this.informationSystemSet = informationSystemSet;
    }
}
