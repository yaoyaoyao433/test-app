package com.sankuai.waimai.business.order.api.pay;

import android.app.Activity;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public interface IOrderPayResultManager {
    public static final String KEY = "IOrderPayResultService";

    @Deprecated
    void handlePayResult(Activity activity, int i, String str, long j, String str2, f fVar);

    void handlePayResult(Activity activity, int i, String str, String str2, String str3, f fVar);
}
