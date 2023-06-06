package com.sankuai.waimai.store.search.model;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes5.dex */
public class NonLbsEntity implements Serializable {
    public static final int NON_LBS_TYPE_CANNOT_PAOTUI = 4;
    public static final int NON_LBS_TYPE_CAN_PAOTUI = 1;
    public static final int NON_LBS_TYPE_POI_REST = 3;
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("non_lbs_time_area_id")
    public int nonLbsId;
    @SerializedName("non_lbs_time_reason")
    public String nonLbsReason;
}
