package homeWork16.DAO.models;

public class EmployeeEntity {

    private Integer empNo;
    private String empFname;
    private String empLname;
    private String deptNo;
    private String domicile;

    public EmployeeEntity(Integer empNo, String empFname, String empLname, String deptNo, String domicile) {
        this.empNo = empNo;
        this.empFname = empFname;
        this.empLname = empLname;
        this.deptNo = deptNo;
        this.domicile = domicile;
    }

    public Integer getEmpNo() {
        return empNo;
    }

    public void setEmpNo(Integer empNo) {
        this.empNo = empNo;
    }

    public String getEmpFname() {
        return empFname;
    }

    public void setEmpFname(String empFname) {
        this.empFname = empFname;
    }

    public String getEmpLname() {
        return empLname;
    }

    public void setEmpLname(String empLname) {
        this.empLname = empLname;
    }

    public String getDeptNo() {
        return deptNo;
    }

    public void setDeptNo(String deptNo) {
        this.deptNo = deptNo;
    }

    public String getDomicile() {
        return domicile;
    }

    public void setDomicile(String domicile) {
        this.domicile = domicile;
    }

    @Override
    public String toString() {
        return String.format("%-8d %-15s %-15s %-15s %-15s", empNo, empFname, empLname, deptNo, domicile);
    }
}
