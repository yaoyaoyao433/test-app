package com.sankuai.waimai.touchmatrix.rebuild.factory;

import com.meituan.robust.ChangeQuickRedirect;
import com.sankuai.waimai.touchmatrix.show.f;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class b implements f {
    public static ChangeQuickRedirect a;

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0057, code lost:
        if (r2.isDestroyed() == false) goto L22;
     */
    @Override // com.sankuai.waimai.touchmatrix.show.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.sankuai.waimai.touchmatrix.views.ITMatrixView a(com.sankuai.waimai.touchmatrix.data.a r14) {
        /*
            r13 = this;
            r0 = 1
            java.lang.Object[] r8 = new java.lang.Object[r0]
            r9 = 0
            r8[r9] = r14
            com.meituan.robust.ChangeQuickRedirect r10 = com.sankuai.waimai.touchmatrix.rebuild.factory.b.a
            java.lang.String r11 = "895c1632f5df7b4ffdf3ed603b8f282c"
            r4 = 0
            r6 = 4611686018427387904(0x4000000000000000, double:2.0)
            r1 = r8
            r2 = r13
            r3 = r10
            r5 = r11
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6)
            if (r1 == 0) goto L1e
            java.lang.Object r14 = com.meituan.robust.PatchProxy.accessDispatch(r8, r13, r10, r9, r11)
            com.sankuai.waimai.touchmatrix.views.ITMatrixView r14 = (com.sankuai.waimai.touchmatrix.views.ITMatrixView) r14
            return r14
        L1e:
            android.app.Activity r1 = com.sankuai.waimai.touchmatrix.rebuild.message.a.c(r14)
            java.lang.Object[] r10 = new java.lang.Object[r0]
            r10[r9] = r1
            com.meituan.robust.ChangeQuickRedirect r11 = com.sankuai.waimai.touchmatrix.utils.g.a
            java.lang.String r12 = "8c2c58f1915b48611350a49fec868587"
            r3 = 0
            r5 = 1
            r7 = 4611686018427387904(0x4000000000000000, double:2.0)
            r2 = r10
            r4 = r11
            r6 = r12
            boolean r2 = com.meituan.robust.PatchProxy.isSupport(r2, r3, r4, r5, r6, r7)
            if (r2 == 0) goto L42
            java.lang.Object r2 = com.meituan.robust.PatchProxy.accessDispatch(r10, r3, r11, r0, r12)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            goto L5b
        L42:
            if (r1 != 0) goto L46
        L44:
            r2 = 1
            goto L5b
        L46:
            boolean r2 = r1 instanceof android.app.Activity
            if (r2 == 0) goto L5a
            r2 = r1
            android.app.Activity r2 = (android.app.Activity) r2
            boolean r4 = r2.isFinishing()
            if (r4 != 0) goto L44
            boolean r2 = r2.isDestroyed()
            if (r2 == 0) goto L5a
            goto L44
        L5a:
            r2 = 0
        L5b:
            if (r2 == 0) goto Lb6
            java.lang.String r1 = "show msg(%s), but activity is null or finishing, abandon!"
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.String r2 = r14.c
            r0[r9] = r2
            com.sankuai.waimai.touchmatrix.rebuild.utils.c.e(r1, r0)
            com.sankuai.waimai.touchmatrix.monitor.j r0 = com.sankuai.waimai.touchmatrix.monitor.j.a()
            java.lang.String r1 = "wmtm_msg_system_error"
            r2 = 13005(0x32cd, float:1.8224E-41)
            r0.a(r2, r1)
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.lang.String r1 = "biz"
            java.lang.String r4 = com.sankuai.waimai.touchmatrix.utils.g.a(r14)
            r0.put(r1, r4)
            java.lang.String r1 = "message_id"
            java.lang.String r4 = r14.c
            r0.put(r1, r4)
            java.lang.String r1 = "failure_status"
            java.lang.String r4 = "wmtm_msg_system_error"
            r0.put(r1, r4)
            java.lang.String r1 = "page_cid"
            java.lang.String r4 = com.sankuai.waimai.touchmatrix.rebuild.utils.a.a(r14)
            r0.put(r1, r4)
            java.lang.String r1 = "status_code"
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0.put(r1, r2)
            java.util.Map r14 = r14.e()
            r0.putAll(r14)
            com.sankuai.waimai.touchmatrix.monitor.j r14 = com.sankuai.waimai.touchmatrix.monitor.j.a()
            r14.a(r0)
            return r3
        Lb6:
            com.sankuai.waimai.touchmatrix.rebuild.TMatrixPushViewNew r0 = new com.sankuai.waimai.touchmatrix.rebuild.TMatrixPushViewNew
            r0.<init>(r1, r14)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.waimai.touchmatrix.rebuild.factory.b.a(com.sankuai.waimai.touchmatrix.data.a):com.sankuai.waimai.touchmatrix.views.ITMatrixView");
    }
}
