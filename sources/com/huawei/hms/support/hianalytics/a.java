package com.huawei.hms.support.hianalytics;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class a {
    /* JADX INFO: Access modifiers changed from: protected */
    public static Map<String, String> getMapForBi(Context context, String str) {
        HashMap hashMap = new HashMap();
        if (context != null && !TextUtils.isEmpty(str)) {
            String[] split = str.split("\\.");
            if (split.length >= 2) {
                String str2 = split[0];
                String str3 = split[1];
                hashMap.put("service", str2);
                hashMap.put(HiAnalyticsConstant.HaKey.BI_KEY_APINAME, str3);
                hashMap.put("package", context.getPackageName());
                hashMap.put(HiAnalyticsConstant.HaKey.BI_KEY_BASE_VERSION, "5.2.0.300");
                hashMap.put(HiAnalyticsConstant.HaKey.BI_KEY_CALLTMEI, String.valueOf(System.currentTimeMillis()));
            }
        }
        return hashMap;
    }
}
