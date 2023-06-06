package com.sankuai.waimai.pouch.mach.container;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.HashSet;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class b<T> {
    public static ChangeQuickRedirect a;
    public HashSet<T> b;

    public b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8972c48c34d1a697458b58c0173e5961", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8972c48c34d1a697458b58c0173e5961");
        } else {
            this.b = new HashSet<>();
        }
    }

    public final boolean a(T t) {
        Object[] objArr = {t};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f3d9351ef0bf046d380c8ca46a85af31", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f3d9351ef0bf046d380c8ca46a85af31")).booleanValue() : this.b.contains(t);
    }

    public final void b(T t) {
        Object[] objArr = {t};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d1db228600d734ae5a550749c4604d5e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d1db228600d734ae5a550749c4604d5e");
        } else if (t != null) {
            this.b.add(t);
        }
    }
}
