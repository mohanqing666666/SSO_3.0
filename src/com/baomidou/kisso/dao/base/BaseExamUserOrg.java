package com.baomidou.kisso.dao.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings("serial")
public abstract class BaseExamUserOrg<M extends BaseExamUserOrg<M>> extends Model<M> implements IBean {

	/**
	 * ID
	 */
	public void setId(java.lang.String id) {
		set("id", id);
	}
	
	/**
	 * ID
	 */
	public java.lang.String getId() {
		return getStr("id");
	}

	/**
	 * �û�id
	 */
	public void setUserid(java.lang.String userid) {
		set("userid", userid);
	}
	
	/**
	 * �û�id
	 */
	public java.lang.String getUserid() {
		return getStr("userid");
	}

	/**
	 * ���Լƻ�id
	 */
	public void setExamtaskid(java.lang.String examtaskid) {
		set("examtaskid", examtaskid);
	}
	
	/**
	 * ���Լƻ�id
	 */
	public java.lang.String getExamtaskid() {
		return getStr("examtaskid");
	}

	/**
	 * ���������
	 */
	public void setOrgcode(java.lang.String orgcode) {
		set("orgcode", orgcode);
	}
	
	/**
	 * ���������
	 */
	public java.lang.String getOrgcode() {
		return getStr("orgcode");
	}

}
