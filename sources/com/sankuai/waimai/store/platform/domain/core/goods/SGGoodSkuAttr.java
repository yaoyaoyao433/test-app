package com.sankuai.waimai.store.platform.domain.core.goods;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes5.dex */
public final class SGGoodSkuAttr implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("name")
    public String name;
    @SerializedName("spu_attr_id")
    public String spuAttrId;
    @SerializedName("status")
    private int status;
    @SerializedName("value")
    public String value;

    public final boolean isSoldableSku() {
        return this.status == 1;
    }
}
