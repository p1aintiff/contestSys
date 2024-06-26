package com.game.dao;

import com.game.dao.base.BaseDao;
import com.game.domain.Administrator;

import java.util.HashMap;
import java.util.List;

/**
 * 管理员表的增删改查
 */
public class AdministratorDao extends BaseDao<Administrator> {

    public AdministratorDao() {
        super("administrator");
    }

    /**
     * 检查管理员账号密码是否正确
     * @param administrator 管理员对象，包含账号密码
     * @return 是否正确
     */
    public boolean checkPassword(Administrator administrator) {
        List<Administrator> ads = null;
        HashMap<String, Object> map = new HashMap<>();
        map.put("c_acc", administrator.getA_acc());
        map.put("c_pwd", administrator.getA_pwd());
        ads= super
                .query(Administrator.class, map, 0, 1);
        return !ads.isEmpty();
    }

}
