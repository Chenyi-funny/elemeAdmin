package com.neusoft.test;



public class TestAdmin {
    public static void main(String[] args) {
        AdminDao adminDao = new AdminDaoImpl();
        Admin admin = adminDao.getAdminByNameByPass("zhangsan", "123");
        System.out.println(admin);
    }
}
