package Data;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "MEDIA", schema = "T00193170", catalog = "")
public class MediaEntity {
    private long mediaid;
    private String name;
    private String description;
    private Long yearreleased;
    private String agerating;
    private Integer budget;
    private String primarygenre;
    private String secondarygenre;
    private String mediatype;
    private String platform;
    private Byte averagerating;

    @Id
    @Column(name = "MEDIAID")
    public long getMediaid() {
        return mediaid;
    }

    public void setMediaid(long mediaid) {
        this.mediaid = mediaid;
    }

    @Basic
    @Column(name = "NAME")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "DESCRIPTION")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
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
    @Column(name = "AGERATING")
    public String getAgerating() {
        return agerating;
    }

    public void setAgerating(String agerating) {
        this.agerating = agerating;
    }

    @Basic
    @Column(name = "BUDGET")
    public Integer getBudget() {
        return budget;
    }

    public void setBudget(Integer budget) {
        this.budget = budget;
    }

    @Basic
    @Column(name = "PRIMARYGENRE")
    public String getPrimarygenre() {
        return primarygenre;
    }

    public void setPrimarygenre(String primarygenre) {
        this.primarygenre = primarygenre;
    }

    @Basic
    @Column(name = "SECONDARYGENRE")
    public String getSecondarygenre() {
        return secondarygenre;
    }

    public void setSecondarygenre(String secondarygenre) {
        this.secondarygenre = secondarygenre;
    }

    @Basic
    @Column(name = "MEDIATYPE")
    public String getMediatype() {
        return mediatype;
    }

    public void setMediatype(String mediatype) {
        this.mediatype = mediatype;
    }

    @Basic
    @Column(name = "PLATFORM")
    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
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
        MediaEntity that = (MediaEntity) o;
        return mediaid == that.mediaid &&
                Objects.equals(name, that.name) &&
                Objects.equals(description, that.description) &&
                Objects.equals(yearreleased, that.yearreleased) &&
                Objects.equals(agerating, that.agerating) &&
                Objects.equals(budget, that.budget) &&
                Objects.equals(primarygenre, that.primarygenre) &&
                Objects.equals(secondarygenre, that.secondarygenre) &&
                Objects.equals(mediatype, that.mediatype) &&
                Objects.equals(platform, that.platform) &&
                Objects.equals(averagerating, that.averagerating);
    }

    @Override
    public int hashCode() {
        return Objects.hash(mediaid, name, description, yearreleased, agerating, budget, primarygenre, secondarygenre, mediatype, platform, averagerating);
    }
}
