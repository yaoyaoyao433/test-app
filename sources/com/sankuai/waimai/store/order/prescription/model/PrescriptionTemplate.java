package com.sankuai.waimai.store.order.prescription.model;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.meituan.metrics.traffic.report.NetLogConstants;
import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes5.dex */
public class PrescriptionTemplate implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("inquiry")
    public a inquiry;
    @SerializedName("medical_user")
    public b medicalUser;
    @SerializedName("prescription_introduce_url")
    public String prescriptionIntroduceUrl;
    @SerializedName("prescription_tip")
    public String prescriptionTip;

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public static class a implements Serializable {
        @SerializedName("id")
        public String a;
        @SerializedName("title")
        public String b;
        @SerializedName("status")
        public int c;
        @SerializedName("button_title")
        public String d;
        @SerializedName("button_icon")
        public String e;
        @SerializedName("button_click")
        public boolean f;
        @SerializedName("button_status")
        public int g;
        @SerializedName("session_id")
        public long h;
        @SerializedName("upload_button_title")
        public String i;
        @SerializedName("button_scheme")
        public String j;
        @SerializedName("upload_button_icon")
        public String k;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public static class b implements Serializable {
        @SerializedName("id")
        public String a;
        @SerializedName("name")
        public String b;
        @SerializedName(NetLogConstants.Details.SCHEME)
        public String c;
        @SerializedName("title")
        public String d;
    }
}
