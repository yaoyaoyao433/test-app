package com.sankuai.waimai.store.monitor;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a implements d {
    public static ChangeQuickRedirect a;
    public final List<ApiMonitorProxy> b;

    public a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f4a612c9b2b04e21fdba9e605eb70eb9", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f4a612c9b2b04e21fdba9e605eb70eb9");
        } else {
            this.b = new ArrayList();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0087 A[LOOP:0: B:33:0x0081->B:35:0x0087, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00c6  */
    @Override // com.sankuai.waimai.store.monitor.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(java.lang.String r22, @android.support.annotation.Nullable com.sankuai.meituan.retrofit2.ak r23, int r24, @android.support.annotation.Nullable java.lang.String r25, java.lang.String r26) {
        /*
            Method dump skipped, instructions count: 282
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.waimai.store.monitor.a.a(java.lang.String, com.sankuai.meituan.retrofit2.ak, int, java.lang.String, java.lang.String):void");
    }
}
