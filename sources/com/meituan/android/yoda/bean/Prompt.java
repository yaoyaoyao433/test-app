package com.meituan.android.yoda.bean;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import java.util.Map;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes3.dex */
public class Prompt {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("channel")
    public Map<String, String> channel;
    @SerializedName("customHint")
    public CustomHint customHint;
    @SerializedName("geolocation")
    public Geolocation geolocation;
    @SerializedName("guideDesc")
    public String guideDesc;
    @SerializedName("message")
    public String message;
    @SerializedName("mobile")
    public String mobile;
    @SerializedName("name")
    public String name;
    @SerializedName("paydate")
    public String paydate;
    @SerializedName("payno")
    public String payno;
    @SerializedName("paytype")
    public String paytype;
    @SerializedName("remaincount")
    public int remaincount;
}
