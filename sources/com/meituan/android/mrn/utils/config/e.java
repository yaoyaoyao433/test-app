package com.meituan.android.mrn.utils.config;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.lang.reflect.Type;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public abstract class e {
    public static ChangeQuickRedirect d;
    g e;

    public abstract boolean b();

    public abstract void c();

    public abstract void d();

    public abstract Object e();

    public final Type f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "541eaa266a4294631043a6cbfe80a46d", RobustBitConfig.DEFAULT_VALUE) ? (Type) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "541eaa266a4294631043a6cbfe80a46d") : this.e.b;
    }
}
