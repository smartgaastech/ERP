package com.erp.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="menu_user")
public class User implements Serializable {
	
	private static final long serialVersionUID = -3009157732242241606L;
	
	@Id
	@Column(name = "USER_ID")
	private String userID;
	
	@Column(name = "USER_PASSWD")
	private String userPassword;
	
	@Column(name = "USER_GROUP_ID")
	private String userGroupID;
	
	@Column(name = "USER_DESC")
	private String userDesc;
	
	@Column(name = "USER_CHANGE_PASSWD_FLAG")
	private boolean userChangePasswordFlag;
	
	@Column(name = "USER_ASK_PASSWD_FLAG")
	private boolean userAskPasswordFlag;
	
	@Column(name = "USER_DISABLE_FLAG")
	private boolean userDisableFlag;
	
	@Column(name = "USER_TEL_NO")
	private String userTelephoneNumber;
	
	@Column(name = "USER_TEL_EXTN")
	private String userTelephoneExtension;
	
	@Column(name = "USER_FAX_NO")
	private String userFaxNumber;
	
	@Column(name = "USER_LOGIN_COUNT")
	private int userLoginCount;
	
	@Column(name = "USER_ADMINISTRATOR_YN")
	private boolean userAdministratorYesNo;
	
	@Column(name = "USER_EMAIL_ID")
	private String userEmailID;
	
	@Column(name = "USER_MOBILE_NO")
	private String userMobileNo;
	
	@Column(name = "USER_SUPERADMIN_YN")
	private boolean userSuperAdminYesNo;
	
	@Column(name = "USER_VALID_UPTO")
	private Date userValidUpto;
	
	@Column(name = "USER_PWD_EXPIRTY_DT")
	private Date userPasswordExpiryDate;
	
	@Column(name = "USER_CR_DT")
	private Date userCreatedDate;
	
	@Column(name = "USER_CR_UID")
	private String userCreatedUserID;
	
	@Column(name = "USER_UPD_DT")
	private Date userUpdatedDate;
	
	@Column(name = "USER_UPD_UID")
	private String userUpdatedUserID;
	
	@Column(name = "USER_PWD_WRONG_ALLOW_NUM")
	private int userPasswordWrongAllowNumber;

	public String getUserID() {
		return userID;
	}

	public void setUserID(String userID) {
		this.userID = userID;
	}

	public String getUserPassword() {
		return userPassword;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}

	public String getUserGroupID() {
		return userGroupID;
	}

	public void setUserGroupID(String userGroupID) {
		this.userGroupID = userGroupID;
	}

	public String getUserDesc() {
		return userDesc;
	}

	public void setUserDesc(String userDesc) {
		this.userDesc = userDesc;
	}

	public boolean isUserChangePasswordFlag() {
		return userChangePasswordFlag;
	}

	public void setUserChangePasswordFlag(boolean userChangePasswordFlag) {
		this.userChangePasswordFlag = userChangePasswordFlag;
	}

	public boolean isUserAskPasswordFlag() {
		return userAskPasswordFlag;
	}

	public void setUserAskPasswordFlag(boolean userAskPasswordFlag) {
		this.userAskPasswordFlag = userAskPasswordFlag;
	}

	public boolean isUserDisableFlag() {
		return userDisableFlag;
	}

	public void setUserDisableFlag(boolean userDisableFlag) {
		this.userDisableFlag = userDisableFlag;
	}

	public String getUserTelephoneNumber() {
		return userTelephoneNumber;
	}

	public void setUserTelephoneNumber(String userTelephoneNumber) {
		this.userTelephoneNumber = userTelephoneNumber;
	}

	public String getUserTelephoneExtension() {
		return userTelephoneExtension;
	}

	public void setUserTelephoneExtension(String userTelephoneExtension) {
		this.userTelephoneExtension = userTelephoneExtension;
	}

	public String getUserFaxNumber() {
		return userFaxNumber;
	}

	public void setUserFaxNumber(String userFaxNumber) {
		this.userFaxNumber = userFaxNumber;
	}

	public int getUserLoginCount() {
		return userLoginCount;
	}

	public void setUserLoginCount(int userLoginCount) {
		this.userLoginCount = userLoginCount;
	}

	public boolean isUserAdministratorYesNo() {
		return userAdministratorYesNo;
	}

	public void setUserAdministratorYesNo(boolean userAdministratorYesNo) {
		this.userAdministratorYesNo = userAdministratorYesNo;
	}

	public String getUserEmailID() {
		return userEmailID;
	}

	public void setUserEmailID(String userEmailID) {
		this.userEmailID = userEmailID;
	}

	public String getUserMobileNo() {
		return userMobileNo;
	}

	public void setUserMobileNo(String userMobileNo) {
		this.userMobileNo = userMobileNo;
	}

	public boolean isUserSuperAdminYesNo() {
		return userSuperAdminYesNo;
	}

	public void setUserSuperAdminYesNo(boolean userSuperAdminYesNo) {
		this.userSuperAdminYesNo = userSuperAdminYesNo;
	}

	public Date getUserValidUpto() {
		return userValidUpto;
	}

	public void setUserValidUpto(Date userValidUpto) {
		this.userValidUpto = userValidUpto;
	}

	public Date getUserPasswordExpiryDate() {
		return userPasswordExpiryDate;
	}

	public void setUserPasswordExpiryDate(Date userPasswordExpiryDate) {
		this.userPasswordExpiryDate = userPasswordExpiryDate;
	}

	public Date getUserCreatedDate() {
		return userCreatedDate;
	}

	public void setUserCreatedDate(Date userCreatedDate) {
		this.userCreatedDate = userCreatedDate;
	}

	public String getUserCreatedUserID() {
		return userCreatedUserID;
	}

	public void setUserCreatedUserID(String userCreatedUserID) {
		this.userCreatedUserID = userCreatedUserID;
	}

	public Date getUserUpdatedDate() {
		return userUpdatedDate;
	}

	public void setUserUpdatedDate(Date userUpdatedDate) {
		this.userUpdatedDate = userUpdatedDate;
	}

	public String getUserUpdatedUserID() {
		return userUpdatedUserID;
	}

	public void setUserUpdatedUserID(String userUpdatedUserID) {
		this.userUpdatedUserID = userUpdatedUserID;
	}

	public int getUserPasswordWrongAllowNumber() {
		return userPasswordWrongAllowNumber;
	}

	public void setUserPasswordWrongAllowNumber(int userPasswordWrongAllowNumber) {
		this.userPasswordWrongAllowNumber = userPasswordWrongAllowNumber;
	}

}
