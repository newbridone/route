package com.ylx.route.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * 基础业务对象
 * 
 * @author founder
 * 
 */
public abstract class BaseBO implements Serializable {

	private static final long serialVersionUID = 1L;

	// 创建者
	private String createUser;

	// 创建时间
	private Date createTime;

	// 更新者
	private String updateUser;

	// 更新时间
	private Date updateTime;

	// 逻辑删除标记
	private String delFlg;

	// 多个以逗号分隔的id，用于EasyUI多选操作
	private String ids;

	/**
	 * @return the createUser
	 */
	public String getCreateUser() {
		return createUser;
	}

	/**
	 * @param createUser
	 *            the createUser to set
	 */
	public void setCreateUser(String createUser) {
		this.createUser = createUser;
	}

	/**
	 * @return the createTime
	 */
	public Date getCreateTime() {
		return createTime;
	}

	/**
	 * @param createTime
	 *            the createTime to set
	 */
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	/**
	 * @return the updateUser
	 */
	public String getUpdateUser() {
		return updateUser;
	}

	/**
	 * @param updateUser
	 *            the updateUser to set
	 */
	public void setUpdateUser(String updateUser) {
		this.updateUser = updateUser;
	}

	/**
	 * @return the updateTime
	 */
	public Date getUpdateTime() {
		return updateTime;
	}

	/**
	 * @param updateTime
	 *            the updateTime to set
	 */
	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	/**
	 * @return the delFlg
	 */
	public String getDelFlg() {
		return delFlg;
	}

	/**
	 * @param delFlg
	 *            the delFlg to set
	 */
	public void setDelFlg(String delFlg) {
		this.delFlg = delFlg;
	}

	/**
	 * @return
	 */
	public String getIds() {
		return ids;
	}

	/**
	 * @param ids
	 */
	public void setIds(String ids) {
		this.ids = ids;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((createTime == null) ? 0 : createTime.hashCode());
		result = prime * result
				+ ((createUser == null) ? 0 : createUser.hashCode());
		result = prime * result + ((delFlg == null) ? 0 : delFlg.hashCode());
		result = prime * result
				+ ((updateTime == null) ? 0 : updateTime.hashCode());
		result = prime * result
				+ ((updateUser == null) ? 0 : updateUser.hashCode());
		return result;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (!(obj instanceof BaseBO)) {
			return false;
		}
		BaseBO other = (BaseBO) obj;
		if (createTime == null) {
			if (other.createTime != null) {
				return false;
			}
		} else if (!createTime.equals(other.createTime)) {
			return false;
		}
		if (createUser == null) {
			if (other.createUser != null) {
				return false;
			}
		} else if (!createUser.equals(other.createUser)) {
			return false;
		}
		if (delFlg == null) {
			if (other.delFlg != null) {
				return false;
			}
		} else if (!delFlg.equals(other.delFlg)) {
			return false;
		}
		if (updateTime == null) {
			if (other.updateTime != null) {
				return false;
			}
		} else if (!updateTime.equals(other.updateTime)) {
			return false;
		}
		if (updateUser == null) {
			if (other.updateUser != null) {
				return false;
			}
		} else if (!updateUser.equals(other.updateUser)) {
			return false;
		}
		return true;
	}

}
