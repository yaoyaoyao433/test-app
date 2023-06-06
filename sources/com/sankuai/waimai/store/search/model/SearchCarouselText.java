package com.sankuai.waimai.store.search.model;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.huawei.hms.actions.SearchIntents;
import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes5.dex */
public class SearchCarouselText implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final long serialVersionUID = 237940685181848824L;
    public int index;
    public boolean isExposed = false;
    @SerializedName(SearchIntents.EXTRA_QUERY)
    public String query;
    @SerializedName("text")
    public String text;
    @SerializedName("type")
    public int type;
    @SerializedName("url")
    public String url;
}
