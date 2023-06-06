package com.sankuai.meituan.trafficcontroller.bean;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import java.util.Arrays;
import java.util.List;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes4.dex */
public class TrafficStrategy {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("timeInterval")
    public int timeInterval;
    @SerializedName("urls")
    public List<String> urls;

    public TrafficStrategy() {
    }

    public TrafficStrategy(int i, List<String> list) {
        this.timeInterval = i;
        this.urls = list;
    }

    public TrafficStrategy(int i, String... strArr) {
        this.timeInterval = i;
        if (strArr == null || strArr.length <= 0) {
            return;
        }
        this.urls = Arrays.asList(strArr);
    }
}
