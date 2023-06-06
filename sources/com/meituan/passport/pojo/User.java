package com.meituan.passport.pojo;

import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class User {
    public static final String ALL_USER_FIELDS_KEYS = "id,username,token,avatartype,avatarurl,email,mobile,isAppUser,value,loginTimes,growthlevel,reallevel,growthvalue,pointvalue,needSetPassword,hasPassword,isBindedMobile,isBindedBankCard,hasPayhash,hasSafeQuestion,passwordLevel,safetyLevel,talentUserStatus,talentPageSwitch,talentPageIcon,talentPageTitle,talentPageUrl,saveTimes,saveAmount,newreg,needResetPassword,unionJumpUrl,userChannel";
    public static final int LEVEL_HIGH = 2;
    public static final int LEVEL_NORMAL = 1;
    public static final int LEVEL_PERFECT = 3;
    public static final int LEVEL_WEAK = 0;
    public static final int SHOW_TALENT_NO = 0;
    public static final int SHOW_TALENT_YES = 1;
    public static final int VALUE_HAS_NO_SAFE_QUESTION = 0;
    public static final int VALUE_HAS_SAFE_QUESTION = 1;
    public static final int VERIFYUNION_DONT_UNION = 0;
    public static final int VERIFYUNION_DONT_VERIFY = 1;
    public static final int VERIFYUNION_NEED_VERIFY = 2;
    public static ChangeQuickRedirect changeQuickRedirect;
    public int avatartype;
    public String avatarurl;
    public String email;
    public int growthlevel;
    public int growthvalue;
    public int hasPassword;
    @SerializedName("hasPayhash")
    public int hasPaymentPassword;
    public int hasSafeQuestion;
    public long id;
    public int isAppUser;
    public int isBindedBankCard;
    public int isBindedMobile;
    public int loginTimes;
    public String mobile;
    public int needResetPassword;
    public boolean needSetPassword;
    public int newreg;
    public int passwordLevel;
    public int pointvalue;
    public int reallevel;
    public int safetyLevel;
    public double saveAmount;
    public int saveTimes;
    @SerializedName("talentPageSwitch")
    public int showTalent;
    public String talentPageIcon;
    public String talentPageTitle;
    public String talentPageUrl;
    public int talentUserStatus;
    public String token;
    public String unionJumpUrl;
    public int userChannel;
    public String username;
    public double value;

    public boolean equals(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a3c2ca8e20c0d2546948df88766c4fd4", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a3c2ca8e20c0d2546948df88766c4fd4")).booleanValue() : (obj instanceof User) && this.id == ((User) obj).id;
    }

    public int hashCode() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "db34635e277e7a618e7ba424d7eabfb5", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "db34635e277e7a618e7ba424d7eabfb5")).intValue() : super.hashCode();
    }

    public String toString() {
        return this.username;
    }
}
