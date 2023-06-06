package com.sankuai.waimai.business.user.rn.studentcenter.bean;

import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class AuthBean {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("campusMemberInfo")
    public Info info;

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static class Info {
        public static ChangeQuickRedirect changeQuickRedirect;
        @SerializedName("educationForm")
        public String educationForm;
        @SerializedName("graduationDate")
        public String graduationDate;
        @SerializedName("idCard")
        public String idCard;
        @SerializedName("name")
        public String name;
        @SerializedName("school")
        public String school;
        @SerializedName("schoolRoll")
        public String schoolRoll;
        @SerializedName("studyTime")
        public String studyTime;
    }
}
