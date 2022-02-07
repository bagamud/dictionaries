package peter.ic.dictionaries.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.Set;

@Entity
public class Department {

    @Id
    int code;
    int parentCode;

    @Column(columnDefinition = "VARCHAR")
    String name;

    @Column(columnDefinition = "VARCHAR")
    String fullName;

    @Column(columnDefinition = "VARCHAR")
    String shortName;

    int regionCode;

    @OneToMany
    Set<Department> parentLevelDepartments;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public int getParentCode() {
        return parentCode;
    }

    public void setParentCode(int parentCode) {
        this.parentCode = parentCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getShortName() {
        return shortName;
    }

    public void setShortName(String shortName) {
        this.shortName = shortName;
    }

    public int getRegionCode() {
        return regionCode;
    }

    public void setRegionCode(int regionCode) {
        this.regionCode = regionCode;
    }

    public Set<Department> getParentLevelDepartments() {
        return parentLevelDepartments;
    }

    public void setParentLevelDepartments(Set<Department> parentLevelDepartments) {
        this.parentLevelDepartments = parentLevelDepartments;
    }
}
