package com.sankuai.waimai.ugc.creator.widgets;

import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public abstract class a implements View.OnClickListener {
    public static ChangeQuickRedirect c;
    private long a;
    private final long b;

    public abstract void a(View view);

    public a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2901e6f893146c36de095bf984adc4cf", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2901e6f893146c36de095bf984adc4cf");
        } else {
            this.b = 1000L;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0051, code lost:
        if (r2 < 1000) goto L9;
     */
    @Override // android.view.View.OnClickListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onClick(android.view.View r13) {
        /*
            r12 = this;
            r7 = 1
            java.lang.Object[] r8 = new java.lang.Object[r7]
            r9 = 0
            r8[r9] = r13
            com.meituan.robust.ChangeQuickRedirect r10 = com.sankuai.waimai.ugc.creator.widgets.a.c
            java.lang.String r11 = "765948930c453d292f2c9d8cc951138c"
            r3 = 0
            r5 = 4611686018427387906(0x4000000000000002, double:2.000000000000001)
            r0 = r8
            r1 = r12
            r2 = r10
            r4 = r11
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5)
            if (r0 == 0) goto L1e
            com.meituan.robust.PatchProxy.accessDispatch(r8, r12, r10, r9, r11)
            return
        L1e:
            java.lang.Object[] r8 = new java.lang.Object[r9]
            com.meituan.robust.ChangeQuickRedirect r10 = com.sankuai.waimai.ugc.creator.widgets.a.c
            java.lang.String r11 = "af1e1e1d0d363919f189adc2c58001f5"
            r3 = 0
            r5 = 4611686018427387904(0x4000000000000000, double:2.0)
            r0 = r8
            r1 = r12
            r2 = r10
            r4 = r11
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5)
            if (r0 == 0) goto L3c
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r8, r12, r10, r9, r11)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r7 = r0.booleanValue()
            goto L57
        L3c:
            long r0 = java.lang.System.currentTimeMillis()
            long r2 = r12.a
            long r2 = r0 - r2
            r4 = 0
            int r4 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r4 >= 0) goto L54
            r12.getClass()
            r4 = 1000(0x3e8, double:4.94E-321)
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 >= 0) goto L54
            goto L57
        L54:
            r12.a = r0
            r7 = 0
        L57:
            if (r7 != 0) goto L5c
            r12.a(r13)
        L5c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.waimai.ugc.creator.widgets.a.onClick(android.view.View):void");
    }
}
