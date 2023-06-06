package com.sankuai.meituan.trafficcontroller.bean;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import java.util.List;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes4.dex */
public class TrafficConfigBean {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("trafficSetting")
    public List<TrafficStrategy> trafficSetting;
}
