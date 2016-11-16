package com.trc.user.dao;

import com.trc.common.EntityDao;
import com.trc.pndao.annotations.DaoGen;
import com.trc.user.entity.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author code4crafter@gmail.com
 *         Date: 16/10/30
 *         Time: 下午4:59
 */
@DaoGen
public interface UserDao extends EntityDao<User> {

	List<User> queryByUserNameAndId(@Param("userName") String userName,@Param("id")int id);

	int updateForUserName(@Param("userName") String userName, @Param("id") int id);

	List<User> getListByModel(User user);
}
