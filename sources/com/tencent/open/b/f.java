package com.tencent.open.b;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class f {
    public static int a(String str) {
        int a;
        if (com.tencent.open.utils.f.a() == null || (a = com.tencent.open.utils.g.a(com.tencent.open.utils.f.a(), str).a("Common_BusinessReportFrequency")) == 0) {
            return 100;
        }
        return a;
    }

    public static int a() {
        int a = com.tencent.open.utils.g.a(com.tencent.open.utils.f.a(), (String) null).a("Common_HttpRetryCount");
        if (a == 0) {
            return 2;
        }
        return a;
    }
}
