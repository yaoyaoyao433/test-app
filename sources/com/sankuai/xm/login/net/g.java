package com.sankuai.xm.login.net;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class g extends h {
    public static ChangeQuickRedirect a;
    private static g m;

    @Override // com.sankuai.xm.login.net.taskqueue.b
    public final String b() {
        return "queue";
    }

    public static g a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "48fd12f931a29133faf6ab98147202ce", 6917529027641081856L)) {
            return (g) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "48fd12f931a29133faf6ab98147202ce");
        }
        if (m == null) {
            synchronized (g.class) {
                if (m == null) {
                    m = new g();
                }
            }
        }
        return m;
    }
}
