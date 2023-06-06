package com.sankuai.waimai.store.mrn.marketing;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes5.dex */
public class MarketingWhiteListItem implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("entry_name")
    public String entryName;
    @SerializedName("page_type")
    public int pageType;
}
