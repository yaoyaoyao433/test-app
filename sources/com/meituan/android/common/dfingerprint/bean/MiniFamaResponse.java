package com.meituan.android.common.dfingerprint.bean;

import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
/* loaded from: classes2.dex */
public class MiniFamaResponse {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("status")
    public int status = 0;
    @SerializedName("message")
    public String message = "";
    @SerializedName("version")
    public String version = "";
    @SerializedName("ts")
    public long ts = 0;
    @SerializedName("interval")
    public long interval = 0;
    @SerializedName("ntp_info")
    public String ntpInfo = "";
    @SerializedName("ab_test_flag")
    public String abTestFlag = "A";
}
