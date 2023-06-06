package com.sankuai.waimai.store.search.model;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;
import java.util.List;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes5.dex */
public class SecondSearchEntity implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final long serialVersionUID = 5402532397981714467L;
    @SerializedName("filter_list")
    public List<GuidedItem> filterList;
    @SerializedName("tab_filter_list")
    public List<l> tabFilterList;
}
