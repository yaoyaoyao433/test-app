package com.meituan.android.customerservice.kit.floating;

import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class b {
    public static ChangeQuickRedirect a;
    public Map<String, com.meituan.android.customerservice.kit.floating.a> b;

    public b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5264f98eed0925d82a5c23de77fe18a2", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5264f98eed0925d82a5c23de77fe18a2");
        } else {
            this.b = new HashMap();
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    static class a {
        private static b a = new b();
    }

    public static b a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a089d06fce20e2ca2aeedf5b93b49961", RobustBitConfig.DEFAULT_VALUE) ? (b) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a089d06fce20e2ca2aeedf5b93b49961") : a.a;
    }

    public final void a(String str) {
        com.meituan.android.customerservice.kit.floating.a aVar;
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fbec798dc048a4a35094b937d61b1422", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fbec798dc048a4a35094b937d61b1422");
        } else if (TextUtils.isEmpty(str) || (aVar = this.b.get(str)) == null) {
        } else {
            aVar.a();
            this.b.remove(aVar);
        }
    }
}
