package com.meituan.android.common.dfingerprint.update;

import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
/* loaded from: classes2.dex */
public class UpdateRequestBody {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("data")
    public String data;
    @SerializedName("mtgVersion")
    public String mtgVersion = "5.17.4";
    @SerializedName("os")
    public String os = "Android";
    @SerializedName("time")
    public long time = System.currentTimeMillis();

    public UpdateRequestBody(String str) {
        this.data = str;
    }
}
