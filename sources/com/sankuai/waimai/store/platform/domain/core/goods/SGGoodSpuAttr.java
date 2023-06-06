package com.sankuai.waimai.store.platform.domain.core.goods;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;
import java.util.List;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes5.dex */
public final class SGGoodSpuAttr implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("name")
    public String name;
    @SerializedName("spu_attr_values")
    public List<SGGoodAttrValue> valueList;
}
