package peter.ic.dictionaries.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Rank {

    @Id
    private int rankId;

    //    @Column(columnDefinition = "VARCHAR")
    private String rankTitle;

    private int rankTariff;

    public int getRankId() {
        return rankId;
    }

    public void setRankId(int rankId) {
        this.rankId = rankId;
    }

    public String getRankTitle() {
        return rankTitle;
    }

    public void setRankTitle(String rankTitle) {
        this.rankTitle = rankTitle;
    }

    public int getRankTariff() {
        return rankTariff;
    }

    public void setRankTariff(int rankTariff) {
        this.rankTariff = rankTariff;
    }
}
