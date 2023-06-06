package com.sankuai.waimai.store.platform.domain.core.goods;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes5.dex */
public class GoodDetailTabItem implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("object_name")
    public String objName;
    @SerializedName("sort_id")
    public int sortId;
    @SerializedName("temp_id")
    public String tempId;
    @SerializedName("title")
    public String title;
}
