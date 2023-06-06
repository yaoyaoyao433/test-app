package com.xiaomi.push;

import java.util.Map;
/* loaded from: classes6.dex */
public abstract class jk {
    public static void a(Map<String, String> map, String str, String str2) {
        if (map == null || str2 == null) {
            return;
        }
        map.put(str, str2);
    }
}
