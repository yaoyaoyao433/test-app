package com.meituan.android.common.dfingerprint.bean;

import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import java.text.SimpleDateFormat;
import java.util.Locale;
/* loaded from: classes2.dex */
public class ReqeustBody {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("data")
    public String body;
    @SerializedName("mtgVersion")
    public String mtgVersion;
    @SerializedName("dfpVersion")
    public String dfpVersion = "5.17.4";
    @SerializedName("os")
    public String os = "Android";
    @SerializedName("ext")
    public String ext = "3";
    @SerializedName("time")
    public String time = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.getDefault()).format(Long.valueOf(System.currentTimeMillis()));

    public ReqeustBody(String str, String str2) {
        this.body = str;
        this.mtgVersion = str2;
    }
}
