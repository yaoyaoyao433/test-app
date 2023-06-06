package com.sankuai.waimai.platform.mach.statistics;

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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3451f527e0edd7da758ed5c4bd45e500", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3451f527e0edd7da758ed5c4bd45e500");
        } else {
            this.b = new HashSet<>();
        }
    }

    public final boolean a(T t) {
        Object[] objArr = {t};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "52a1b6fbd1e5fbaec319e4bce9f8e034", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "52a1b6fbd1e5fbaec319e4bce9f8e034")).booleanValue() : this.b.contains(t);
    }

    public final void b(T t) {
        Object[] objArr = {t};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5cef5f5bcd3ec2a8c0294f25bbae3161", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5cef5f5bcd3ec2a8c0294f25bbae3161");
        } else if (t != null) {
            this.b.add(t);
        }
    }
}
