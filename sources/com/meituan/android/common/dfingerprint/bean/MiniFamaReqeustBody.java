package com.meituan.android.common.dfingerprint.bean;

import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
/* loaded from: classes2.dex */
public class MiniFamaReqeustBody {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("data")
    public String body;

    public MiniFamaReqeustBody(String str) {
        this.body = str;
    }
}
