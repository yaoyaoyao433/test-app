package com.android.meituan.multiprocess;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class f {
    private static f b;
    Map<String, String> a = new ConcurrentHashMap();

    private f() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static f a() {
        if (b == null) {
            synchronized (f.class) {
                if (b == null) {
                    b = new f();
                }
            }
        }
        return b;
    }
}
