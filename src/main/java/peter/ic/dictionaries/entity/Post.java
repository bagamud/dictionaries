package peter.ic.dictionaries.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Post {

    @Id
    int code;

    @ManyToOne
    Department parentCode;

    @Column(columnDefinition = "VARCHAR")
    String title;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public Department getParentCode() {
        return parentCode;
    }

    public void setParentCode(Department parentCode) {
        this.parentCode = parentCode;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
