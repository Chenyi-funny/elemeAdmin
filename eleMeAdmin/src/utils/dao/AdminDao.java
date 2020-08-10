package utils.dao;


import utils.domain.Admin;

public interface AdminDao {
    public Admin getAdminByNameByPass(String adminName, String password);
}
