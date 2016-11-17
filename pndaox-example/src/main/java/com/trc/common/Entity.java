package com.trc.common;

import lombok.Data;
import lombok.ToString;

import java.io.Serializable;
import java.util.Date;

/**
 * @author code4crafter@gmail.com
 *         Date: 16/10/30
 *         Time: 下午4:53
 */
@Data
@ToString
public abstract class Entity implements Serializable {

	private static final long serialVersionUID = -1L;

	public int id;
	Date addTime;
	Date updateTime;
}
