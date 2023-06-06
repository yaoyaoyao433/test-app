package com.sankuai.waimai.platform.widget.dial.domain.model;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes5.dex */
public class PrivacyInfo {
    public static final int CODE_ERROR = 1;
    public static final int CODE_OK = 0;
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("code")
    public int code;
    @SerializedName("data")
    public PrivacyData data;
    @SerializedName("msg")
    public String msg;

    /* compiled from: ProGuard */
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes5.dex */
    public @interface Code {
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public static class PrivacyData {
        public static ChangeQuickRedirect a;
        @SerializedName("phone")
        public String b;
        @SerializedName("action")
        public int c;
        @SerializedName("main_desc")
        public String d;
        @SerializedName("sub_desc")
        public String e;
        @SerializedName("log_field")
        public LogField f;
        @SerializedName("main_tip")
        public String g;
        @SerializedName("buttons")
        public ArrayList<a> h;

        /* compiled from: ProGuard */
        @Retention(RetentionPolicy.SOURCE)
        /* loaded from: classes5.dex */
        public @interface Action {
        }

        /* compiled from: ProGuard */
        /* loaded from: classes5.dex */
        public static class LogField {
            @SerializedName("is_expired")
            public int a;

            /* compiled from: ProGuard */
            @Retention(RetentionPolicy.SOURCE)
            /* loaded from: classes5.dex */
            public @interface Expired {
            }
        }

        /* compiled from: ProGuard */
        /* loaded from: classes5.dex */
        public static class a {
            @SerializedName("name")
            public String a;
            @SerializedName("phone")
            public String b;
        }
    }
}
