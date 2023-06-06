package com.meituan.android.yoda.bean;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes3.dex */
public class S3Parameter {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("accessid")
    public String accessid;
    @SerializedName("dir")
    public String dir;
    @SerializedName("policy")
    public String policy;
    @SerializedName("signature")
    public String signature;
    @SerializedName("url")
    public String url;
}
