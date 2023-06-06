package com.meituan.android.common.dfingerprint.bean;

import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
/* loaded from: classes2.dex */
public class DFPResponse {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("data")
    public DfpData data;
    @SerializedName("code")
    public int code = -128;
    @SerializedName("message")
    public String message = "ok";

    /* loaded from: classes2.dex */
    public class DfpData {
        public static ChangeQuickRedirect changeQuickRedirect;
        @SerializedName("dfp")
        public String dataDfp = "";
        @SerializedName("interval")
        public long dataInterval = 0;
        @SerializedName("dataDecrypt")
        public String dataDecrypt = "";
        @SerializedName("ab_test_flag")
        public String abTestFlag = "A";

        public DfpData() {
        }
    }
}
