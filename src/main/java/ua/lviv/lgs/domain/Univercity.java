package ua.lviv.lgs.domain;

import javax.persistence.*;

@Entity
@Table
public class Univercity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column
    private String name;
    @Column
    private Integer levelOfAccreditation;
    @Column
    private Integer numberOfInstitutes;
    @Column
    private Integer amountOfStudents;
    @Column
    private String universityAddress;

    public Univercity() {
    }

    public Univercity(String name, Integer levelOfAccreditation, Integer numberOfInstitutes, Integer amountOfStudents, String universityAddress) {
        this.name = name;
        this.levelOfAccreditation = levelOfAccreditation;
        this.numberOfInstitutes = numberOfInstitutes;
        this.amountOfStudents = amountOfStudents;
        this.universityAddress = universityAddress;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getLevelOfAccreditation() {
        return levelOfAccreditation;
    }

    public void setLevelOfAccreditation(Integer levelOfAccreditation) {
        this.levelOfAccreditation = levelOfAccreditation;
    }

    public Integer getNumberOfInstitutes() {
        return numberOfInstitutes;
    }

    public void setNumberOfInstitutes(Integer numberOfInstitutes) {
        this.numberOfInstitutes = numberOfInstitutes;
    }

    public Integer getAmountOfStudents() {
        return amountOfStudents;
    }

    public void setAmountOfStudents(Integer amountOfStudents) {
        this.amountOfStudents = amountOfStudents;
    }

    public String getUniversityAddress() {
        return universityAddress;
    }

    public void setUniversityAddress(String universityAddress) {
        this.universityAddress = universityAddress;
    }

    @Override
    public String toString() {
        return "Univercity{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", levelOfAccreditation=" + levelOfAccreditation +
                ", numberOfInstitutes=" + numberOfInstitutes +
                ", amountOfStudents=" + amountOfStudents +
                ", universityAddress='" + universityAddress + '\'' +
                '}';
    }
}
