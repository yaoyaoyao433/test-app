package com.sankuai.meituan.retrofit2.exception;

import com.meituan.robust.ChangeQuickRedirect;
import com.sankuai.meituan.retrofit2.Response;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class c extends Exception {
    public static ChangeQuickRedirect a;
    private final int b;
    private final String c;
    private final transient Response<?> d;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public c(com.sankuai.meituan.retrofit2.Response<?> r12) {
        /*
            r11 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "HTTP "
            r0.<init>(r1)
            if (r12 != 0) goto Lc
            java.lang.String r1 = ""
            goto L24
        Lc:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            int r2 = r12.c
            r1.append(r2)
            java.lang.String r2 = " "
            r1.append(r2)
            java.lang.String r2 = r12.d
            r1.append(r2)
            java.lang.String r1 = r1.toString()
        L24:
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r11.<init>(r0)
            r0 = 1
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r8 = 0
            r0[r8] = r12
            com.meituan.robust.ChangeQuickRedirect r9 = com.sankuai.meituan.retrofit2.exception.c.a
            java.lang.String r10 = "30192feccf3bec46d6791933a59ab069"
            r4 = 0
            r6 = 6917529027641081856(0x6000000000000000, double:2.6815615859885194E154)
            r1 = r0
            r2 = r11
            r3 = r9
            r5 = r10
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6)
            if (r1 == 0) goto L49
            com.meituan.robust.PatchProxy.accessDispatch(r0, r11, r9, r8, r10)
            return
        L49:
            if (r12 == 0) goto L54
            int r0 = r12.c
            r11.b = r0
            java.lang.String r0 = r12.d
            r11.c = r0
            goto L5a
        L54:
            r0 = -1
            r11.b = r0
            r0 = 0
            r11.c = r0
        L5a:
            r11.d = r12
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.meituan.retrofit2.exception.c.<init>(com.sankuai.meituan.retrofit2.Response):void");
    }

    public final int a() {
        return this.b;
    }

    public final Response<?> b() {
        return this.d;
    }
}
