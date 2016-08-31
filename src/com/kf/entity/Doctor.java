package com.kf.entity;

public class Doctor {

	private String creator;
	private String modifier;
	private String id;
	/**
	 * 医生姓名
	 */
	private String name;

	/**
	 * 职称
	 */
	private String position;

	/**
	 * 荣誉称号
	 */
	private String honorary;

	/**
	 * 第一职业点
	 */
	private String first_work_point;

	/**
	 * 科室
	 */
	private String department;

	/**
	 * 性别
	 */
	private String sex;

	/**
	 * 擅长
	 */
	private String introduction;

	/**
	 * 简介
	 */
	private String expert_field;

	/**
	 * 详细介绍
	 */
	private String detailed_introduction;
	/**
	 * 工作年限
	 */
	private String working_year;

	/**
	 * 工作范围
	 */
	private String scope;

	/**
	 * 挂号费
	 */
	private String reg_fee;

	/**
	 * 咨询费
	 */
	private String consulting_fee;
	/**
	 * 登录用户ID
	 */
	private String member_id;
	/**
	 * 医生是否启用
	 */
	private Boolean enabled;
	private Area area;

	private String address;

	protected String phone;

	/**
	 * 剩余号源数
	 */
	private Integer rest_reg_num;
	private String clinic_name;
	private String clinics_id;
	private String department_desc;
	private String position_desc;
	private String create_time;
	private String modify_time;

	public String getCreator() {
		return creator;
	}

	public void setCreator(String creator) {
		this.creator = creator;
	}

	public String getModifier() {
		return modifier;
	}

	public void setModifier(String modifier) {
		this.modifier = modifier;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public String getHonorary() {
		return honorary;
	}

	public void setHonorary(String honorary) {
		this.honorary = honorary;
	}

	public String getFirst_work_point() {
		return first_work_point;
	}

	public void setFirst_work_point(String first_work_point) {
		this.first_work_point = first_work_point;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getIntroduction() {
		return introduction;
	}

	public void setIntroduction(String introduction) {
		this.introduction = introduction;
	}

	public String getExpert_field() {
		return expert_field;
	}

	public void setExpert_field(String expert_field) {
		this.expert_field = expert_field;
	}

	public String getDetailed_introduction() {
		return detailed_introduction;
	}

	public void setDetailed_introduction(String detailed_introduction) {
		this.detailed_introduction = detailed_introduction;
	}

	public String getWorking_year() {
		return working_year;
	}

	public void setWorking_year(String working_year) {
		this.working_year = working_year;
	}

	public String getScope() {
		return scope;
	}

	public void setScope(String scope) {
		this.scope = scope;
	}

	public String getReg_fee() {
		return reg_fee;
	}

	public void setReg_fee(String reg_fee) {
		this.reg_fee = reg_fee;
	}

	public String getConsulting_fee() {
		return consulting_fee;
	}

	public void setConsulting_fee(String consulting_fee) {
		this.consulting_fee = consulting_fee;
	}

	public String getMember_id() {
		return member_id;
	}

	public void setMember_id(String member_id) {
		this.member_id = member_id;
	}

	public Boolean getEnabled() {
		return enabled;
	}

	public void setEnabled(Boolean enabled) {
		this.enabled = enabled;
	}

	public Area getArea() {
		return area;
	}

	public void setArea(Area area) {
		this.area = area;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public Integer getRest_reg_num() {
		return rest_reg_num;
	}

	public void setRest_reg_num(Integer rest_reg_num) {
		this.rest_reg_num = rest_reg_num;
	}

	public String getClinic_name() {
		return clinic_name;
	}

	public void setClinic_name(String clinic_name) {
		this.clinic_name = clinic_name;
	}

	public String getClinics_id() {
		return clinics_id;
	}

	public void setClinics_id(String clinics_id) {
		this.clinics_id = clinics_id;
	}

	public String getDepartment_desc() {
		return department_desc;
	}

	public void setDepartment_desc(String department_desc) {
		this.department_desc = department_desc;
	}

	public String getPosition_desc() {
		return position_desc;
	}

	public void setPosition_desc(String position_desc) {
		this.position_desc = position_desc;
	}

	public String getCreate_time() {
		return create_time;
	}

	public void setCreate_time(String create_time) {
		this.create_time = create_time;
	}

	public String getModify_time() {
		return modify_time;
	}

	public void setModify_time(String modify_time) {
		this.modify_time = modify_time;
	}

}
