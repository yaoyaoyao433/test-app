package com.meituan.msc.modules.manager;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public abstract class a {
    public static ChangeQuickRedirect a;

    public h a() {
        return null;
    }

    public abstract void a(int i, Object obj);

    public final void b(int i, Object obj) {
        Object[] objArr = {Integer.valueOf(i), obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "671c2d2dda7030b1639f488ac7bcfa0b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "671c2d2dda7030b1639f488ac7bcfa0b");
        } else {
            a(i, obj);
        }
    }
}
