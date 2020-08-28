package com.neusoft;

import com.neusoft.domain.Admin;
import com.neusoft.view.Impl.AdminViewImpl;

public class Main {
    public static void main(String[] args) {
        AdminViewImpl adminView = new AdminViewImpl();
        Admin admin = adminView.login();
        System.out.println(admin);
    }
}
