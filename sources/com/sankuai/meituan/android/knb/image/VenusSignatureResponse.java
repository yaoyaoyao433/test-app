package com.sankuai.meituan.android.knb.image;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes4.dex */
public class VenusSignatureResponse {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("bucket")
    public String bucket;
    @SerializedName("code")
    public int code;
    @SerializedName("expireTime")
    public long expireTime;
    @SerializedName("msg")
    public String msg;
    @SerializedName("signature")
    public String signature;
    @SerializedName("validInterval")
    public long validInterval;
}
