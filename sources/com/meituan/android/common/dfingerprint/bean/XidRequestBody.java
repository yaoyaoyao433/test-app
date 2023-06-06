package com.meituan.android.common.dfingerprint.bean;

import com.google.gson.annotations.SerializedName;
import com.meituan.android.common.aidata.raptoruploader.RaptorUploaderImpl;
import com.meituan.robust.ChangeQuickRedirect;
/* loaded from: classes2.dex */
public class XidRequestBody {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName(RaptorUploaderImpl.SRC)
    public String src = "0";
    @SerializedName("fingerPrintData")
    public String fingerPrintData = "";
    @SerializedName("encryptVersion")
    public String encryptVersion = "";
}
