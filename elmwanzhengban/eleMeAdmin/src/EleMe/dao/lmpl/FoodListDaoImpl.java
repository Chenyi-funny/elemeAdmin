package EleMe.dao.lmpl;

import EleMe.dao.FoodDao;
import EleMe.domain.Food;
import EleMe.tools.Property;
import EleMe.utils.JDBCUtils;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FoodListDaoImpl extends Property implements FoodDao {

    @Override
    public List<Food> foodList(int businessId) {
        List<Food> list = new ArrayList<>();
        try{
            conn = JDBCUtils.getConnection();
            String sql = "select * from food where businessid = ?";
            pst = conn.prepareStatement(sql);
            pst.setInt(1, businessId);
            rs = pst.executeQuery();
            while (rs.next()){
                list.add(new Food(rs.getInt("foodid"),rs.getString("foodName"),rs.getString("foodExplain"),rs.getDouble("foodPrice"),rs.getInt("businessid")));
            }
        }catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }
}
