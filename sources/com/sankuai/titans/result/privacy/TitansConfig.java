package com.sankuai.titans.result.privacy;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class TitansConfig {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("switch_burst_log")
    @Expose
    public boolean burstLogSwitch;
    @SerializedName("switch_cookie_privacy")
    @Expose
    public boolean cookiePrivacySwitch;
    @SerializedName("switch_query_privacy")
    @Expose
    public boolean queryPrivacySwitch;
}
