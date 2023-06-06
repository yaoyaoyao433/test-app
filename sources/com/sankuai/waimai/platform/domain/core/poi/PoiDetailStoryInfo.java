package com.sankuai.waimai.platform.domain.core.poi;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes5.dex */
public class PoiDetailStoryInfo extends PoiExtendInfo {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("poi_logo_icon")
    public String poiLogoIcon;
    @SerializedName("poi_tab_icon")
    public String poiTabIcon;
}
