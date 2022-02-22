package peter.ic.dictionaries.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class ElementRelationship {

    @Id
    private int elementRelationshipId;
    private String elementRelationshipTitle;

    public int getElementRelationshipId() {
        return elementRelationshipId;
    }

    public void setElementRelationshipId(int elementRelationshipId) {
        this.elementRelationshipId = elementRelationshipId;
    }

    public String getElementRelationshipTitle() {
        return elementRelationshipTitle;
    }

    public void setElementRelationshipTitle(String elementRelationshipTitle) {
        this.elementRelationshipTitle = elementRelationshipTitle;
    }
}
