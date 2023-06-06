package com.meituan.msc.modules.update;

import com.meituan.msc.modules.update.PackageLoadReporter;
import com.meituan.msc.modules.update.PackagePreLoadReporter;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class k {
    String a;
    String b;
    @PackagePreLoadReporter.PackageLoadSourceFrom
    String c;
    @PackageLoadReporter.LoadType
    String d;
    String e;
    String f;

    public k() {
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static class a {
        public static ChangeQuickRedirect a;
        public String b;
        public String c;
        @PackagePreLoadReporter.PackageLoadSourceFrom
        public String d;
        @PackageLoadReporter.LoadType
        public String e;
        public String f;
        public String g;

        public final k a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f2e8999f9381ec13a0c58249912347e5", RobustBitConfig.DEFAULT_VALUE)) {
                return (k) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f2e8999f9381ec13a0c58249912347e5");
            }
            k kVar = new k();
            kVar.a = this.b;
            kVar.b = this.c;
            kVar.c = this.d;
            kVar.d = this.e;
            kVar.e = this.f;
            kVar.f = this.g;
            return kVar;
        }
    }
}
