package com.huawei.updatesdk.b.e;

import android.text.TextUtils;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class e {
    private static final Map<String, a> a = new ConcurrentHashMap();

    public static a a(String str) {
        Map<String, a> map;
        a cVar;
        if (TextUtils.isEmpty(str)) {
            return new c();
        }
        if (a.containsKey(str)) {
            return a.get(str);
        }
        if ("apptouch".equals(str)) {
            map = a;
            cVar = new b();
        } else {
            map = a;
            cVar = new c();
        }
        map.put(str, cVar);
        return a.get(str);
    }
}
