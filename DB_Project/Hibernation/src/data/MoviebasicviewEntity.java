package data;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Objects;

@Entity
@Table(name = "MOVIEBASICVIEW", schema = "T00193170", catalog = "")
public class MoviebasicviewEntity {
    private String name;
    private Long yearreleased;
    private Byte averagerating;

    @Basic
    @Column(name = "NAME")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "YEARRELEASED")
    public Long getYearreleased() {
        return yearreleased;
    }

    public void setYearreleased(Long yearreleased) {
        this.yearreleased = yearreleased;
    }

    @Basic
    @Column(name = "AVERAGERATING")
    public Byte getAveragerating() {
        return averagerating;
    }

    public void setAveragerating(Byte averagerating) {
        this.averagerating = averagerating;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MoviebasicviewEntity that = (MoviebasicviewEntity) o;
        return Objects.equals(name, that.name) &&
                Objects.equals(yearreleased, that.yearreleased) &&
                Objects.equals(averagerating, that.averagerating);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, yearreleased, averagerating);
    }
}
