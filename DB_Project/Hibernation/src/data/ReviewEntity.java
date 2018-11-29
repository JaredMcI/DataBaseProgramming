package data;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "REVIEW", schema = "T00193170", catalog = "")
public class ReviewEntity {
    private long reviewid;
    private boolean rating;
    private String description;
    private String reviewtype;
    private String status;
    private Long reviewcount;

    @Id
    @Column(name = "REVIEWID")
    public long getReviewid() {
        return reviewid;
    }

    public void setReviewid(long reviewid) {
        this.reviewid = reviewid;
    }

    @Basic
    @Column(name = "RATING")
    public boolean isRating() {
        return rating;
    }

    public void setRating(boolean rating) {
        this.rating = rating;
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
    @Column(name = "REVIEWTYPE")
    public String getReviewtype() {
        return reviewtype;
    }

    public void setReviewtype(String reviewtype) {
        this.reviewtype = reviewtype;
    }

    @Basic
    @Column(name = "STATUS")
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Basic
    @Column(name = "REVIEWCOUNT")
    public Long getReviewcount() {
        return reviewcount;
    }

    public void setReviewcount(Long reviewcount) {
        this.reviewcount = reviewcount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ReviewEntity that = (ReviewEntity) o;
        return reviewid == that.reviewid &&
                rating == that.rating &&
                Objects.equals(description, that.description) &&
                Objects.equals(reviewtype, that.reviewtype) &&
                Objects.equals(status, that.status) &&
                Objects.equals(reviewcount, that.reviewcount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(reviewid, rating, description, reviewtype, status, reviewcount);
    }
}
