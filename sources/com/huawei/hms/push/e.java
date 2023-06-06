package com.huawei.hms.push;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.huawei.hms.aaid.HmsInstanceId;
import com.huawei.hms.aaid.plugin.ProxyCenter;
import com.huawei.hms.aaid.plugin.PushProxy;
import com.huawei.hms.push.utils.ha.PushAnalyticsCenter;
import com.huawei.hms.push.utils.ha.PushBaseAnalytics;
import com.huawei.hms.support.log.HMSLog;
import com.vivo.push.PushClientConstants;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class e {
    public static final String a = "e";

    public static void a(Context context, String str, String str2, String str3) {
        PushBaseAnalytics pushAnalytics = PushAnalyticsCenter.getInstance().getPushAnalytics();
        if (pushAnalytics == null) {
            return;
        }
        Bundle a2 = a(context, str, str2);
        String str4 = a;
        HMSLog.i(str4, "eventId:" + str3 + ",UserProfiles:" + a2.toString());
        pushAnalytics.report(context, str3, a2);
    }

    public static Bundle a(Context context, String str, String str2) {
        Bundle bundle = new Bundle();
        bundle.putString("sdkVer", "50101300");
        bundle.putString(PushClientConstants.TAG_PKG_NAME, context.getPackageName());
        bundle.putString("aaid", HmsInstanceId.getInstance(context).getId());
        PushProxy proxy = ProxyCenter.getProxy();
        if (proxy != null) {
            bundle.putString("proxyType", proxy.getProxyType());
        }
        bundle.putString("msgId", str);
        if (!TextUtils.isEmpty(str2)) {
            bundle.putString("analyticInfo", str2);
        }
        return bundle;
    }
}
