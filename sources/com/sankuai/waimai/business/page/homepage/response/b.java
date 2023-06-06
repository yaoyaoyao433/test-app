package com.sankuai.waimai.business.page.homepage.response;

import com.google.gson.annotations.SerializedName;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.sankuai.model.NoProguard;
/* compiled from: ProGuard */
@NoProguard
/* loaded from: classes4.dex */
public final class b {
    @SerializedName("template_id")
    public int a;
    @SerializedName("scene_id")
    public int b;
    @SerializedName("title_left")
    public String c;
    @SerializedName("title_right")
    public String d;
    @SerializedName("sub_title")
    public String e;
    @SerializedName(RemoteMessageConst.Notification.ICON)
    public String f;
    @SerializedName("scheme_url")
    public String g;
    @SerializedName("type")
    public int h;
    @SerializedName("weather_phenomena_code")
    public int i;
    @SerializedName("wind_grade")
    public int j;
    @SerializedName("temperature_degree_code")
    public int k;
    @SerializedName("float_icon")
    public String l;

    public final boolean a() {
        return this.h > 0 && this.h <= 3;
    }
}
