package com.sankuai.waimai.store.repository.model;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;
import java.util.List;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes5.dex */
public class LastPoiModule implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("lately_bought_poi")
    public List<LastBoughtPoi> lastBoughtPoi;
    @SerializedName("page_scheme")
    public String pageScheme;
    @SerializedName("show_page_scheme")
    public boolean showPageScheme;
    @SerializedName("title")
    public String title;
}
