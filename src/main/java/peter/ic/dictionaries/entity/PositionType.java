package peter.ic.dictionaries.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class PositionType {

    @Id
    private int positionTypeId;
    private String positionTypeTitle;

    public int getPositionTypeId() {
        return positionTypeId;
    }

    public void setPositionTypeId(int positionTypeId) {
        this.positionTypeId = positionTypeId;
    }

    public String getPositionTypeTitle() {
        return positionTypeTitle;
    }

    public void setPositionTypeTitle(String positionTypeTitle) {
        this.positionTypeTitle = positionTypeTitle;
    }
}
