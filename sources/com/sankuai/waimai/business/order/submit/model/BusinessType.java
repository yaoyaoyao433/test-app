package com.sankuai.waimai.business.order.submit.model;

import android.support.annotation.Keep;
import com.dianping.shield.dynamic.utils.DMKeys;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes4.dex */
public class BusinessType implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName(DMKeys.KEY_SELECTED)
    public Long selected;
    @SerializedName("type")
    public Long type;
}
