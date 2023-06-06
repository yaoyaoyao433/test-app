package com.dianping.eunomia;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class g {
    public static ChangeQuickRedirect a;
    public Map<String, d> b;

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    static class a {
        private static g a = new g();
    }

    public g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "39b1105d89657c254ff882486abb865e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "39b1105d89657c254ff882486abb865e");
        } else {
            this.b = new HashMap();
        }
    }

    public static g a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "86220df2b40c1911140c9af64f66ef51", RobustBitConfig.DEFAULT_VALUE) ? (g) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "86220df2b40c1911140c9af64f66ef51") : a.a;
    }

    public final void a(String str, d dVar) {
        Object[] objArr = {str, dVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f0b6924fd2f52a6ca9f056210c84cbdf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f0b6924fd2f52a6ca9f056210c84cbdf");
        } else {
            this.b.put(str, dVar);
        }
    }
}
