package com.sankuai.waimai.store.platform.marketing;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import java.util.List;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes5.dex */
public class MarketingResponse {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("module_list")
    public List<MarketingModel> moduleList;
}
