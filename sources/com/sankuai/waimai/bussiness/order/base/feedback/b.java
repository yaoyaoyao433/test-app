package com.sankuai.waimai.bussiness.order.base.feedback;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.order.api.model.c;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class b {
    public static ChangeQuickRedirect a;

    @Nullable
    public static c.b a(long j, List<c.b> list) {
        Object[] objArr = {new Long(j), list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "bbcaeac773c25a737345c417a412fb34", RobustBitConfig.DEFAULT_VALUE)) {
            return (c.b) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "bbcaeac773c25a737345c417a412fb34");
        }
        if (com.sankuai.waimai.foundation.utils.b.a(list)) {
            for (c.b bVar : list) {
                if (bVar.a == j) {
                    return bVar;
                }
            }
        }
        return null;
    }

    @Nullable
    public static c.C0753c a(c.b bVar, String str) {
        Object[] objArr = {bVar, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "5d8c5fa91ff7dd92e2b72d2282059cbf", RobustBitConfig.DEFAULT_VALUE)) {
            return (c.C0753c) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "5d8c5fa91ff7dd92e2b72d2282059cbf");
        }
        if (bVar != null && com.sankuai.waimai.foundation.utils.b.a(bVar.f)) {
            for (c.C0753c c0753c : bVar.f) {
                if (c0753c.a.equals(str)) {
                    return c0753c;
                }
            }
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0051, code lost:
        return r12;
     */
    @android.support.annotation.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.sankuai.waimai.business.order.api.model.c.b a(com.sankuai.waimai.business.order.api.model.c.b r12, @android.support.annotation.NonNull java.util.List<com.sankuai.waimai.business.order.api.model.c.b> r13) {
        /*
        L0:
            r0 = 2
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r8 = 0
            r0[r8] = r12
            r9 = 1
            r0[r9] = r13
            com.meituan.robust.ChangeQuickRedirect r10 = com.sankuai.waimai.bussiness.order.base.feedback.b.a
            java.lang.String r11 = "6e70b4af87adc4eadeb3976d579b796d"
            r2 = 0
            r4 = 1
            r6 = 4611686018427387904(0x4000000000000000, double:2.0)
            r1 = r0
            r3 = r10
            r5 = r11
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6)
            if (r1 == 0) goto L21
            java.lang.Object r12 = com.meituan.robust.PatchProxy.accessDispatch(r0, r2, r10, r9, r11)
            com.sankuai.waimai.business.order.api.model.c$b r12 = (com.sankuai.waimai.business.order.api.model.c.b) r12
            return r12
        L21:
            if (r12 == 0) goto L51
            int r0 = r12.c
            if (r0 != 0) goto L28
            goto L51
        L28:
            java.lang.String r0 = r12.e
            boolean r0 = com.sankuai.waimai.foundation.utils.aa.a(r0)
            if (r0 != 0) goto L4f
            java.lang.String r0 = r12.e
            java.lang.String r1 = ","
            java.lang.String[] r0 = r0.split(r1)
            r0 = r0[r8]
            com.sankuai.waimai.business.order.api.model.c$c r12 = a(r12, r0)
            if (r12 == 0) goto L4f
            long r0 = r12.f
            r3 = 0
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 == 0) goto L4f
            long r0 = r12.f
            com.sankuai.waimai.business.order.api.model.c$b r12 = a(r0, r13)
            goto L0
        L4f:
            r12 = r2
            goto L0
        L51:
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.waimai.bussiness.order.base.feedback.b.a(com.sankuai.waimai.business.order.api.model.c$b, java.util.List):com.sankuai.waimai.business.order.api.model.c$b");
    }

    public static int b(c.b bVar, List<c.b> list) {
        Object[] objArr = {bVar, list};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e07c05c2426d7e470a36e634fb7239e7", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e07c05c2426d7e470a36e634fb7239e7")).intValue() : c(bVar, list)[0];
    }

    public static int[] c(c.b bVar, List<c.b> list) {
        Object[] objArr = {bVar, list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "87db51d8c8d8cd5cac1a71e3f68d7a73", RobustBitConfig.DEFAULT_VALUE)) {
            return (int[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "87db51d8c8d8cd5cac1a71e3f68d7a73");
        }
        int d = d(bVar, list);
        int d2 = d(list.get(0), list);
        return new int[]{(d2 - d) + 1, d2};
    }

    private static int d(c.b bVar, @NonNull List<c.b> list) {
        int i = 0;
        Object[] objArr = {bVar, list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "0cd38be847676f7dc401beb2a67dfecf", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "0cd38be847676f7dc401beb2a67dfecf")).intValue();
        }
        if (bVar != null && com.sankuai.waimai.foundation.utils.b.a(list)) {
            while (bVar != null) {
                i++;
                bVar = e(bVar, list);
            }
        }
        return i;
    }

    @Nullable
    private static c.b e(@NonNull c.b bVar, @NonNull List<c.b> list) {
        Object[] objArr = {bVar, list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "8e567b1cb8e94fe15f01906d142d5e39", RobustBitConfig.DEFAULT_VALUE)) {
            return (c.b) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "8e567b1cb8e94fe15f01906d142d5e39");
        }
        long j = bVar.j;
        if (j == 0) {
            List<c.C0753c> list2 = bVar.f;
            if (com.sankuai.waimai.foundation.utils.b.a(list2)) {
                j = list2.get(0).f;
            }
        }
        if (j != 0) {
            return a(j, list);
        }
        return null;
    }
}
