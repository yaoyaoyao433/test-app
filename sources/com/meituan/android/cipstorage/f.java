package com.meituan.android.cipstorage;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class f {
    public static ChangeQuickRedirect a;
    public long b;
    public long c;
    public long d;
    public long e;
    public long f;
    public long g;

    public final String toString() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9902b588c36c5f07a55a71e64ccfe994", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9902b588c36c5f07a55a71e64ccfe994");
        }
        return "us: " + this.b + " uc: " + this.c + " ns: " + this.d + " nc: " + this.e + " es: " + this.f + " kv: " + this.g;
    }
}
