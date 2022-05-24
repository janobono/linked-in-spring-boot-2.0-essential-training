package sk.janobono.sbet.roomwebapp.model;

import javax.persistence.*;
import java.util.UUID;

@Entity
@Table(name = "employee")
public class StaffMember {

    @Id
    @Column(name = "employee_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private UUID employeeId;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "position")
    @Enumerated(EnumType.STRING)
    private Position position;

    public StaffMember() {
    }

    public StaffMember(UUID emplyeeId, String firstName, String lastName, Position position) {
        this.employeeId = emplyeeId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.position = position;
    }

    public UUID getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(UUID employeeId) {
        this.employeeId = employeeId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    @Override
    public String toString() {
        return "Staff{" +
                "emplyeeId=" + employeeId +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", position='" + position + '\'' +
                '}';
    }
}
