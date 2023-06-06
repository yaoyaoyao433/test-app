package com.meituan.crashreporter.crash;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class a {
    public static ChangeQuickRedirect a;
    long b;
    String c;
    String d;
    String e;
    String f;
    String g;
    String h;
    String i;
    long j;
    String k;
    String l;

    public final String toString() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6df96d68da12737577c67381f21a8968", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6df96d68da12737577c67381f21a8968");
        }
        return "CrashEntity{ts=" + this.b + ", log='" + this.c + "', crashActivityName='" + this.d + "', cVersion='" + this.e + "', guid='" + this.f + "', option='" + this.g + "', uuid='" + this.h + "', ch='" + this.i + "', city=" + this.j + ", os='" + this.k + "', net='" + this.l + "'}";
    }
}
