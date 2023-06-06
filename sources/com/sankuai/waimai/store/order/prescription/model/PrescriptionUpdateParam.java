package com.sankuai.waimai.store.order.prescription.model;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import java.util.ArrayList;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes5.dex */
public class PrescriptionUpdateParam {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("localRp_list")
    public ArrayList<String> localRpList;
    @SerializedName("medicial_user_id")
    public String medicialserd;
}
