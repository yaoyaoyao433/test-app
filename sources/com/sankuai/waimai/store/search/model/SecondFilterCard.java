package com.sankuai.waimai.store.search.model;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;
import java.util.List;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes5.dex */
public final class SecondFilterCard implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("default_filter_code")
    public String defaultFilterCode;
    @SerializedName("second_filter_item_list")
    public List<GuidedItem> filterList;
    public transient boolean isExposed = false;
}
