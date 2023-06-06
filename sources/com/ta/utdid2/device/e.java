package com.ta.utdid2.device;

import com.ta.utdid2.a.a.g;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class e {
    public String d(String str) {
        return com.ta.utdid2.a.a.a.b(str);
    }

    public String e(String str) {
        String b = com.ta.utdid2.a.a.a.b(str);
        if (!g.m29a(b)) {
            try {
                return new String(com.ta.utdid2.a.a.b.decode(b, 0));
            } catch (IllegalArgumentException unused) {
            }
        }
        return null;
    }
}
