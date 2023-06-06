package com.sankuai.waimai.imbase.listener.manager;

import android.util.SparseArray;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class b {
    public static ChangeQuickRedirect a;
    public SparseArray<com.sankuai.waimai.imbase.listener.b> b;

    public b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "10b9a22a59a87376ea700e088b4d83b5", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "10b9a22a59a87376ea700e088b4d83b5");
        } else {
            this.b = new SparseArray<>();
        }
    }

    public static b a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "3f35ddaa8a32d1109150a19bf8bdef86", RobustBitConfig.DEFAULT_VALUE) ? (b) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "3f35ddaa8a32d1109150a19bf8bdef86") : a.a;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    static class a {
        private static final b a = new b();
    }

    public final com.sankuai.waimai.imbase.listener.b a(short s) {
        Object[] objArr = {Short.valueOf(s)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "935e98cdac7f6fd8959e62cbeb3969a9", RobustBitConfig.DEFAULT_VALUE) ? (com.sankuai.waimai.imbase.listener.b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "935e98cdac7f6fd8959e62cbeb3969a9") : this.b.get(s);
    }
}
