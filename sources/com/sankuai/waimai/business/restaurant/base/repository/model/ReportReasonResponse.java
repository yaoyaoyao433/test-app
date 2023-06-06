package com.sankuai.waimai.business.restaurant.base.repository.model;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;
import java.util.List;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes4.dex */
public class ReportReasonResponse implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("reason_list")
    private List<b> reasonList;
    @SerializedName("compliance_check_result")
    private a reportCheckResult;

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static class a implements Serializable {
        @SerializedName("can_report")
        public boolean a;
        @SerializedName("compliance_check_desc")
        public String b;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static class b implements Serializable {
        @SerializedName("type")
        public int a;
        @SerializedName("description")
        public String b;
    }

    public List<b> getReasonList() {
        return this.reasonList;
    }

    public a getReportCheckResult() {
        return this.reportCheckResult;
    }
}
