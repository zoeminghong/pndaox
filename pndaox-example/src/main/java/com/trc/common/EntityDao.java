package com.trc.common;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

import java.util.Collection;
import java.util.List;

/**
 * @author code4crafter@gmail.com
 *         Date: 16/10/30
 *         Time: 下午4:56
 */
public interface EntityDao<T extends Entity> {

	int insert(T t);

	T findById(int id);

	int update(T t);

	List<T> queryInIds(@Param("ids") Collection<Integer> ids);

	List<T> queryAll(RowBounds rowBounds);

	int batchInsert(List<T> items);

	T findByUserName(String UserName);

//	T queryByUserName(String userName);

}
