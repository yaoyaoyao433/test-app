package com.meituan.android.identifycardrecognizer.bean;

import com.meituan.android.paybase.utils.JsonBean;
import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;
/* compiled from: ProGuard */
@JsonBean
/* loaded from: classes2.dex */
public class IdentifyInfo implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final long serialVersionUID = -6284362133844798640L;
    private String idNumber;
    private String idPoliceSta;
    private String idValiddate;
    private String userAddress;
    private String userBirth;
    private String userName;
    private String userNation;
    private String userSex;

    public String getIdPoliceSta() {
        return this.idPoliceSta;
    }

    public void setIdPoliceSta(String str) {
        this.idPoliceSta = str;
    }

    public String getIdValiddate() {
        return this.idValiddate;
    }

    public void setIdValiddate(String str) {
        this.idValiddate = str;
    }

    public String getUserAddress() {
        return this.userAddress;
    }

    public void setUserAddress(String str) {
        this.userAddress = str;
    }

    public String getUserBirth() {
        return this.userBirth;
    }

    public void setUserBirth(String str) {
        this.userBirth = str;
    }

    public String getUserName() {
        return this.userName;
    }

    public void setUserName(String str) {
        this.userName = str;
    }

    public String getUserNation() {
        return this.userNation;
    }

    public void setUserNation(String str) {
        this.userNation = str;
    }

    public String getUserSex() {
        return this.userSex;
    }

    public void setUserSex(String str) {
        this.userSex = str;
    }

    public String getIdNumber() {
        return this.idNumber;
    }

    public void setIdNumber(String str) {
        this.idNumber = str;
    }
}
