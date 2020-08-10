package empselectDemo.domain;

import java.util.Date;

public class Emp {
    private Integer id;
    private  String Ename;
    private String job;
    private Date hiredate;
    private Integer mgr;
    private Integer salarly;
    private Integer bonus;
    private  Integer deptno;

    public Emp() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEname() {
        return Ename;
    }

    public void setEname(String ename) {
        Ename = ename;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public Date getHiredate() {
        return hiredate;
    }

    public void setHiredate(Date hiredate) {
        this.hiredate = hiredate;
    }

    public Integer getMgr() {
        return mgr;
    }

    public void setMgr(Integer mgr) {
        this.mgr = mgr;
    }

    public Integer getSalarly() {
        return salarly;
    }

    public void setSalarly(Integer salarly) {
        this.salarly = salarly;
    }

    public Integer getBonus() {
        return bonus;
    }

    public void setBonus(Integer bonus) {
        this.bonus = bonus;
    }

    public Integer getDeptno() {
        return deptno;
    }

    public void setDeptno(Integer deptno) {
        this.deptno = deptno;
    }

    @Override
    public String toString() {
        return "Emp{" +
                "id=" + id +
                ", Ename='" + Ename + '\'' +
                ", job='" + job + '\'' +
                ", hiredate=" + hiredate +
                ", mgr=" + mgr +
                ", salarly=" + salarly +
                ", bonus=" + bonus +
                ", deptno=" + deptno +
                '}';
    }


}
