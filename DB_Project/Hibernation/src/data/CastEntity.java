package data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Objects;

@Entity
@Table(name = "CAST", schema = "T00193170", catalog = "")
public class CastEntity {
    private long castid;

    @Id
    @Column(name = "CASTID")
    public long getCastid() {
        return castid;
    }

    public void setCastid(long castid) {
        this.castid = castid;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CastEntity that = (CastEntity) o;
        return castid == that.castid;
    }

    @Override
    public int hashCode() {
        return Objects.hash(castid);
    }
}
