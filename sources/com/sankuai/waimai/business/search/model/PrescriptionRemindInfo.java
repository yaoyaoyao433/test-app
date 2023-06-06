package com.sankuai.waimai.business.search.model;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes4.dex */
public class PrescriptionRemindInfo {
    public static final int PRESCRIPTION_TAG = 1;
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("is_prescription")
    public int isPrescription;
    @SerializedName("loading_wait_time")
    public long loadingWaitTime;
    @SerializedName("remind_text")
    public String remindText;
}
