package com.neusoft.view.Impl;

import com.neusoft.dao.Impl.AdminDaoImpl;
import com.neusoft.domain.Admin;
import com.neusoft.view.AdminView;

import java.util.Scanner;

public class AdminViewImpl implements AdminView {
    private Scanner scanner = new Scanner(System.in);
    @Override
    public Admin login() {
        AdminDaoImpl dao = new AdminDaoImpl();
        System.out.println("输入账号");
        String adminName = scanner.next();
        System.out.println("输入密码");
        String password = scanner.next();
        Admin admin = dao.getAdminByNameByPass(adminName, password);
        return admin;
    }
}
