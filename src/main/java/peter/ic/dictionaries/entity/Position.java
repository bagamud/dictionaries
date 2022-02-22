package peter.ic.dictionaries.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Position {

    @Id
    int code;

    //    @Column(columnDefinition = "VARCHAR")
    String title;

    private int parentCode;

    private ElementRelationship elementRelationship;


    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public ElementRelationship getElementRelationship() {
        return elementRelationship;
    }

    public void setElementRelationship(ElementRelationship elementRelationship) {
        this.elementRelationship = elementRelationship;
    }

    public int getParentCode() {
        return parentCode;
    }

    public void setParentCode(int parentCode) {
        this.parentCode = parentCode;
    }
}
