package EleMe.dao.Impl;

import EleMe.dao.adminDao;
import EleMe.domain.Admin;
import EleMe.tools.GetLogin;
import EleMe.tools.Property;
import EleMe.utils.JDBCUtils;

public class adminDaolmpl extends Property implements adminDao {
    @Override
    // 管理员登录方法
    public Admin getAdminByNameByPass(String adminName, String password) {
        Admin admin = null;
        try{
            rs = new GetLogin().getLogin(adminName, password, "admin");
            while (rs.next()){
                admin = new Admin(rs.getInt("adminid"),rs.getString("adminName"),rs.getString("password"));
            }
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            JDBCUtils.close(rs, pst, conn);
        }

        return admin;
    }

}
