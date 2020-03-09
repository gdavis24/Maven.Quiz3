package rocks.zipcode.io.quiz3.collections;

import java.util.List;

/**
 * @author leon on 10/12/2018.
 */
public class Student {
    private LabStatus labStatus;
    private Lab lab;

    public Student() {

        this(null);
    }

    public Student(List<Lab> labs) {
    }

    public Lab getLab(String labName) {
        return lab;
    }

    public void setLabStatus(String labName, LabStatus labStatus) {
    }

    public void forkLab(Lab lab) {
    }

    public LabStatus getLabStatus(String labName) {
        return labStatus;
    }
}
