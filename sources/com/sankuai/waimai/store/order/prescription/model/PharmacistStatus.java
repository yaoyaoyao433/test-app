package com.sankuai.waimai.store.order.prescription.model;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.meituan.android.common.aidata.ai.bundle.AiDownloadEnv;
import com.meituan.android.common.locate.locator.GearsLocator;
import com.meituan.metrics.traffic.report.NetLogConstants;
import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes5.dex */
public class PharmacistStatus implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName(AiDownloadEnv.ENV_ONLINE)
    public boolean online;
    @SerializedName("popup_msg")
    public a popUpMsg;
    @SerializedName(NetLogConstants.Details.SCHEME)
    public String scheme;

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public static class a implements Serializable {
        @SerializedName(GearsLocator.DETAIL)
        public String a;
        @SerializedName("left_button_scheme")
        public String b;
        @SerializedName("left_button_title")
        public String c;
        @SerializedName("right_button_scheme")
        public String d;
        @SerializedName("right_button_title")
        public String e;
        @SerializedName("title")
        public String f;
    }
}
