package com.alipay.mobilesecuritysdk.face;

import android.content.Context;
import com.alipay.apmobilesecuritysdk.face.APSecuritySdk;
import com.alipay.security.mobile.module.a.a;
import com.meituan.android.common.unionid.oneid.util.DeviceInfo;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class SecurityClientMobile {
    public static synchronized String GetApdid(Context context, Map<String, String> map) {
        String a;
        synchronized (SecurityClientMobile.class) {
            HashMap hashMap = new HashMap();
            hashMap.put("utdid", a.a(map, "utdid", ""));
            hashMap.put("tid", a.a(map, "tid", ""));
            hashMap.put(DeviceInfo.USER_ID, a.a(map, DeviceInfo.USER_ID, ""));
            APSecuritySdk.getInstance(context).initToken(0, hashMap, null);
            a = com.alipay.apmobilesecuritysdk.a.a.a(context);
        }
        return a;
    }
}
