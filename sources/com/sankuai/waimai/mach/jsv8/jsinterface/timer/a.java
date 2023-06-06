package com.sankuai.waimai.mach.jsv8.jsinterface.timer;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.waimai.mach.Mach;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a extends com.sankuai.waimai.mach.jsv8.jsinterface.a {
    public static ChangeQuickRedirect b;

    public a(Mach mach) {
        super(mach);
        Object[] objArr = {mach};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9d1bf770ef27fb945e9773902b8bae97", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9d1bf770ef27fb945e9773902b8bae97");
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x005e, code lost:
        if (r13 != null) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0060, code lost:
        r13.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0084, code lost:
        if (r13 == null) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0087, code lost:
        return null;
     */
    /* JADX WARN: Removed duplicated region for block: B:32:0x008b  */
    @Override // com.meituan.v8jse.JavaCallback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.meituan.v8jse.JSValue invoke(com.meituan.v8jse.JSObject r12, com.meituan.v8jse.JSArray r13) {
        /*
            r11 = this;
            r0 = 2
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r8 = 0
            r0[r8] = r12
            r12 = 1
            r0[r12] = r13
            com.meituan.robust.ChangeQuickRedirect r9 = com.sankuai.waimai.mach.jsv8.jsinterface.timer.a.b
            java.lang.String r10 = "612f22f5e2c4eff09a4a80748717b0fe"
            r4 = 0
            r6 = 4611686018427387904(0x4000000000000000, double:2.0)
            r1 = r0
            r2 = r11
            r3 = r9
            r5 = r10
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6)
            if (r1 == 0) goto L21
            java.lang.Object r12 = com.meituan.robust.PatchProxy.accessDispatch(r0, r11, r9, r8, r10)
            com.meituan.v8jse.JSValue r12 = (com.meituan.v8jse.JSValue) r12
            return r12
        L21:
            r0 = 0
            if (r13 == 0) goto L8f
            int r1 = r13.length()     // Catch: java.lang.Throwable -> L64 java.lang.Exception -> L67
            if (r1 > 0) goto L2b
            goto L8f
        L2b:
            com.meituan.v8jse.JSValue r13 = r13.get(r8)     // Catch: java.lang.Throwable -> L64 java.lang.Exception -> L67
            if (r13 == 0) goto L5e
            boolean r1 = r13.isDouble()     // Catch: java.lang.Exception -> L5c java.lang.Throwable -> L88
            if (r1 == 0) goto L44
            com.sankuai.waimai.mach.jsv8.jsinterface.timer.d r1 = com.sankuai.waimai.mach.jsv8.jsinterface.timer.d.a()     // Catch: java.lang.Exception -> L5c java.lang.Throwable -> L88
            double r2 = r13.doubleValue()     // Catch: java.lang.Exception -> L5c java.lang.Throwable -> L88
            long r2 = (long) r2     // Catch: java.lang.Exception -> L5c java.lang.Throwable -> L88
            r1.a(r2)     // Catch: java.lang.Exception -> L5c java.lang.Throwable -> L88
            goto L5e
        L44:
            java.lang.String r1 = r13.toString()     // Catch: java.lang.Exception -> L5c java.lang.Throwable -> L88
            long r1 = java.lang.Long.parseLong(r1)     // Catch: java.lang.Exception -> L5c java.lang.Throwable -> L88
            java.lang.Long r1 = java.lang.Long.valueOf(r1)     // Catch: java.lang.Exception -> L5c java.lang.Throwable -> L88
            com.sankuai.waimai.mach.jsv8.jsinterface.timer.d r2 = com.sankuai.waimai.mach.jsv8.jsinterface.timer.d.a()     // Catch: java.lang.Exception -> L5c java.lang.Throwable -> L88
            long r3 = r1.longValue()     // Catch: java.lang.Exception -> L5c java.lang.Throwable -> L88
            r2.a(r3)     // Catch: java.lang.Exception -> L5c java.lang.Throwable -> L88
            goto L5e
        L5c:
            r1 = move-exception
            goto L69
        L5e:
            if (r13 == 0) goto L87
        L60:
            r13.close()
            goto L87
        L64:
            r12 = move-exception
            r13 = r0
            goto L89
        L67:
            r1 = move-exception
            r13 = r0
        L69:
            java.lang.String r2 = "MachJS_V8"
            java.lang.String[] r12 = new java.lang.String[r12]     // Catch: java.lang.Throwable -> L88
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L88
            java.lang.String r4 = "ClearIntervalJSInterface执行异常 | "
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L88
            java.lang.String r1 = r1.getMessage()     // Catch: java.lang.Throwable -> L88
            r3.append(r1)     // Catch: java.lang.Throwable -> L88
            java.lang.String r1 = r3.toString()     // Catch: java.lang.Throwable -> L88
            r12[r8] = r1     // Catch: java.lang.Throwable -> L88
            com.sankuai.waimai.mach.log.b.b(r2, r12)     // Catch: java.lang.Throwable -> L88
            if (r13 == 0) goto L87
            goto L60
        L87:
            return r0
        L88:
            r12 = move-exception
        L89:
            if (r13 == 0) goto L8e
            r13.close()
        L8e:
            throw r12
        L8f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.waimai.mach.jsv8.jsinterface.timer.a.invoke(com.meituan.v8jse.JSObject, com.meituan.v8jse.JSArray):com.meituan.v8jse.JSValue");
    }
}
