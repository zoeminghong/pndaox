package com.trc.user.dao;

import com.trc.test.AbstractTest;
import com.trc.user.entity.User;
import org.apache.ibatis.session.RowBounds;
import org.junit.Ignore;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * @author code4crafter@gmail.com
 *         Date: 16/10/30
 *         Time: 下午5:00
 */
public class UserDaoTest extends AbstractTest {

    public static final int USER_ID = 2;
    public static final String USER_NAME = "用户13700000001";

    @Autowired
    private UserDao userDao;

    @Ignore("insert语句与h2不兼容")
    @Test
    public void testInsertUser() throws Exception {
        User user = initUser();
        assertThat(userDao.insert(user)).isEqualTo(1);
    }

    @Test
    public void testFindUserById() throws Exception {
        User user = userDao.findById(USER_ID);
        assertThat(user).isNotNull();
    }

    @Test
    public void testFindUserByUserName() throws Exception {
        User user = userDao.findByUserName(USER_NAME);
        assertThat(user).isNotNull();
    }

    @Test
    public void testUpdateUserName() throws Exception {
        assertThat(userDao.updateForUserName("用户13700000001", USER_ID)).isEqualTo(1);
    }

    @Test
    public void testUpdateUserNameAndId() throws Exception {
        List<User> user = userDao.queryByUserNameAndId(USER_NAME, USER_ID);
        assertThat(user).isNotNull();
    }

    private User initUser() {
        User user = new User();
        user.setAvatar("http://git.oschina.net/uploads/group/groups_1087186.png");
        user.setPassword("c5658357fd6d0c4a802f95cd96d83c5f");
        user.setUserName("用户13700000002");
        user.setMobileNo("13700000002");
        return user;
    }

    @Test
    public void testQueryUser() throws Exception {
		User user=new User();
//		user.setId(1);
        List<User> userList = userDao.getListOrderByUserNameWithAsc(user);
        assertThat(userList).isNotNull();
    }

    @Test
    public void testQueryAll() throws Exception {
        RowBounds rowBounds=new RowBounds(2,2);
        List<User> user = userDao.queryAll(rowBounds);
        assertThat(user).isNotNull();
    }
}
