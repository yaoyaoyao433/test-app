package com.dianping.model;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class a extends ClassLoader {
    public static ChangeQuickRedirect a;
    private final Class b;
    private final String c;

    public a(Class cls) {
        Object[] objArr = {cls};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "08194846a81bddc68a475ead3c977dcc", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "08194846a81bddc68a475ead3c977dcc");
            return;
        }
        this.b = cls;
        this.c = cls.getName();
    }

    @Override // java.lang.ClassLoader
    public final Class<?> loadClass(String str) throws ClassNotFoundException {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "06642bfd57105c1b18f5630d5d22d4a8", RobustBitConfig.DEFAULT_VALUE)) {
            return (Class) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "06642bfd57105c1b18f5630d5d22d4a8");
        }
        if (this.c.equals(str)) {
            return this.b;
        }
        return super.loadClass(str);
    }
}
