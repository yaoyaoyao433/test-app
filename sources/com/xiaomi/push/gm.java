package com.xiaomi.push;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
/* loaded from: classes6.dex */
public class gm {
    private static gm b;
    public Map<String, Object> a = new ConcurrentHashMap();
    private Map<String, Object> c = new ConcurrentHashMap();

    private gm() {
        b();
    }

    public static synchronized gm a() {
        gm gmVar;
        synchronized (gm.class) {
            if (b == null) {
                b = new gm();
            }
            gmVar = b;
        }
        return gmVar;
    }

    public static String b(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        sb.append("<");
        sb.append(str);
        sb.append("/>");
        if (str != null) {
            sb.append("<");
            sb.append(str2);
            sb.append("/>");
        }
        return sb.toString();
    }

    public final Object a(String str, String str2) {
        return this.a.get(b(str, str2));
    }

    /* JADX WARN: Removed duplicated region for block: B:66:0x0124 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void b() {
        /*
            Method dump skipped, instructions count: 315
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.push.gm.b():void");
    }
}
