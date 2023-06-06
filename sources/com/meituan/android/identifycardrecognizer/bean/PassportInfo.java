package com.meituan.android.identifycardrecognizer.bean;

import com.meituan.android.paybase.utils.JsonBean;
import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;
/* compiled from: ProGuard */
@JsonBean
/* loaded from: classes2.dex */
public class PassportInfo implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final long serialVersionUID = 1033165635432903404L;
    private String birthday;
    private String cardExpired;
    private String cardIssuePlace;
    private String cardNum;
    private String firstName;
    private String lastName;
    private String nationality;
    private String userName;
    private String userSex;

    public String getBirthday() {
        return this.birthday;
    }

    public void setBirthday(String str) {
        this.birthday = str;
    }

    public String getCardExpired() {
        return this.cardExpired;
    }

    public void setCardExpired(String str) {
        this.cardExpired = str;
    }

    public String getCardIssuePlace() {
        return this.cardIssuePlace;
    }

    public void setCardIssuePlace(String str) {
        this.cardIssuePlace = str;
    }

    public String getCardNum() {
        return this.cardNum;
    }

    public void setCardNum(String str) {
        this.cardNum = str;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String str) {
        this.firstName = str;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String str) {
        this.lastName = str;
    }

    public String getNationality() {
        return this.nationality;
    }

    public void setNationality(String str) {
        this.nationality = str;
    }

    public String getUserName() {
        return this.userName;
    }

    public void setUserName(String str) {
        this.userName = str;
    }

    public String getUserSex() {
        return this.userSex;
    }

    public void setUserSex(String str) {
        this.userSex = str;
    }
}
