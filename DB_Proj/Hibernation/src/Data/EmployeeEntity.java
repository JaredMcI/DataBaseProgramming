package Data;

import javax.persistence.*;
import java.sql.Time;
import java.util.Objects;

@Entity
@Table(name = "EMPLOYEE", schema = "T00193170", catalog = "")
public class EmployeeEntity {
    private long employeeid;
    private Time dob;
    private String name;
    private String role;
    private String nationality;

    @Id
    @Column(name = "EMPLOYEEID")
    public long getEmployeeid() {
        return employeeid;
    }

    public void setEmployeeid(long employeeid) {
        this.employeeid = employeeid;
    }

    @Basic
    @Column(name = "DOB")
    public Time getDob() {
        return dob;
    }

    public void setDob(Time dob) {
        this.dob = dob;
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
    @Column(name = "ROLE")
    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    @Basic
    @Column(name = "NATIONALITY")
    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EmployeeEntity that = (EmployeeEntity) o;
        return employeeid == that.employeeid &&
                Objects.equals(dob, that.dob) &&
                Objects.equals(name, that.name) &&
                Objects.equals(role, that.role) &&
                Objects.equals(nationality, that.nationality);
    }

    @Override
    public int hashCode() {
        return Objects.hash(employeeid, dob, name, role, nationality);
    }
}
