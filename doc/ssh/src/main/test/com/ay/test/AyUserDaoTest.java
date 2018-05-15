package com.ay.test;

import com.ay.dao.AyUserDao;
import com.ay.model.AyUser;
import org.junit.Test;

import javax.annotation.Resource;
import java.util.List;

/**
 * 描述：用户DAO测试类
 * @author Ay
 * @create 2018/05/04
 **/
public class AyUserDaoTest extends BaseJunit4Test{

    @Resource
    private AyUserDao ayUserDao;

    @Test
    public void testFindAll(){
        List<AyUser> userList = ayUserDao.findAll();
        System.out.println(userList.size());
    }
}

