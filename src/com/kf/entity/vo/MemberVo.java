package com.kf.entity.vo;

import java.util.Map;

public class MemberVo {
	private String modifier;
	private Integer id;
	private String type;
	private String username;
	private String nick_name;
	private String modify_time;
	private Boolean non_expired;
	private Boolean non_locked;
	private Boolean credentials_non_expired;
	private String last_login_time;
	private String target_id;
	private String target_type;
	private Map<Object, Map<Object,Object >> _links;
	public String getModifier() {
		return modifier;
	}
	public void setModifier(String modifier) {
		this.modifier = modifier;
	}

	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getNick_name() {
		return nick_name;
	}
	public void setNick_name(String nick_name) {
		this.nick_name = nick_name;
	}
	public String getModify_time() {
		return modify_time;
	}
	public void setModify_time(String modify_time) {
		this.modify_time = modify_time;
	}
	public String getLast_login_time() {
		return last_login_time;
	}
	public void setLast_login_time(String last_login_time) {
		this.last_login_time = last_login_time;
	}
	public String getTarget_id() {
		return target_id;
	}
	public void setTarget_id(String target_id) {
		this.target_id = target_id;
	}
	public String getTarget_type() {
		return target_type;
	}
	public void setTarget_type(String target_type) {
		this.target_type = target_type;
	}

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Boolean getNon_expired() {
		return non_expired;
	}
	public void setNon_expired(Boolean non_expired) {
		this.non_expired = non_expired;
	}
	public Boolean getNon_locked() {
		return non_locked;
	}
	public void setNon_locked(Boolean non_locked) {
		this.non_locked = non_locked;
	}
	public Boolean getCredentials_non_expired() {
		return credentials_non_expired;
	}
	public void setCredentials_non_expired(Boolean credentials_non_expired) {
		this.credentials_non_expired = credentials_non_expired;
	}
	public Map<Object, Map<Object, Object>> get_links() {
		return _links;
	}
	public void set_links(Map<Object, Map<Object, Object>> _links) {
		this._links = _links;
	}
	
	
	
}
