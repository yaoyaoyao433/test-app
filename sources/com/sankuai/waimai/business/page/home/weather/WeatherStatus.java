package com.sankuai.waimai.business.page.home.weather;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.meituan.robust.ChangeQuickRedirect;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes4.dex */
public class WeatherStatus {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName(RemoteMessageConst.Notification.ICON)
    public String icon;
    @SerializedName("scene_id")
    public int sceneId;
    @SerializedName("scheme_url")
    public String schemeUrl;
    @SerializedName("title_left")
    public String titleLeft;
    @SerializedName("title_right")
    public String titleRight;
}
