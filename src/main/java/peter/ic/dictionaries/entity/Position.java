package peter.ic.dictionaries.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Position {

    @Id
    int positionCode;

    //    @Column(columnDefinition = "VARCHAR")
    String positionTitle;

    private int positionParentCode;

    @ManyToOne
    private PositionType positionType;

    public int getPositionCode() {
        return positionCode;
    }

    public void setPositionCode(int positionCode) {
        this.positionCode = positionCode;
    }

    public String getPositionTitle() {
        return positionTitle;
    }

    public void setPositionTitle(String positionTitle) {
        this.positionTitle = positionTitle;
    }

    public int getPositionParentCode() {
        return positionParentCode;
    }

    public void setPositionParentCode(int positionParentCode) {
        this.positionParentCode = positionParentCode;
    }

    public PositionType getPositionType() {
        return positionType;
    }

    public void setPositionType(PositionType positionType) {
        this.positionType = positionType;
    }
}