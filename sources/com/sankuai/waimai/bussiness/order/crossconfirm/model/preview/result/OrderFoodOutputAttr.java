package com.sankuai.waimai.bussiness.order.crossconfirm.model.preview.result;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes4.dex */
public class OrderFoodOutputAttr implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("id")
    public long id;
    @SerializedName("value")
    public String value;
}
