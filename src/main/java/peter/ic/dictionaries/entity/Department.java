package peter.ic.dictionaries.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Department {

    @Id
    int departmentCode;
    int departmentParentCode;

    //    @Column(columnDefinition = "VARCHAR")
    String departmentName;

    //    @Column(columnDefinition = "VARCHAR")
    String departmentFullName;

    //    @Column(columnDefinition = "VARCHAR")
    String departmentShortName;

    @ManyToOne
    private ElementRelationship elementRelationship;

    @Column(nullable = true)
    private boolean active;

    public int getDepartmentCode() {
        return departmentCode;
    }

    public void setDepartmentCode(int departmentCode) {
        this.departmentCode = departmentCode;
    }

    public int getDepartmentParentCode() {
        return departmentParentCode;
    }

    public void setDepartmentParentCode(int departmentParentCode) {
        this.departmentParentCode = departmentParentCode;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public String getDepartmentFullName() {
        return departmentFullName;
    }

    public void setDepartmentFullName(String departmentFullName) {
        this.departmentFullName = departmentFullName;
    }

    public String getDepartmentShortName() {
        return departmentShortName;
    }

    public void setDepartmentShortName(String departmentShortName) {
        this.departmentShortName = departmentShortName;
    }

    public ElementRelationship getElementRelationship() {
        return elementRelationship;
    }

    public void setElementRelationship(ElementRelationship elementRelationship) {
        this.elementRelationship = elementRelationship;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }
}
