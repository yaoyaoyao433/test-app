package com.sankuai.waimai.business.search.model;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes4.dex */
public class GlobalSearchCommonConfig {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("feed_back_tips")
    public String feedBackTips;
    @SerializedName("is_show_feed_back")
    public boolean isFirstScreenShowFeedBack;
    @SerializedName("feed_back_scheme")
    public String scheme;
}
