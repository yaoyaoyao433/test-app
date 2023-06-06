package com.meituan.shadowsong.mss;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class g {
    public static ChangeQuickRedirect a;
    String b;
    String c;
    String d;
    int e;
    boolean f;
    e g;
    private String h;

    public g(a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a3dd3966407d4ebd12a26b9b7223f0d3", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a3dd3966407d4ebd12a26b9b7223f0d3");
            return;
        }
        this.b = aVar.b;
        this.c = aVar.c;
        this.h = aVar.d;
        this.d = aVar.e;
        this.e = aVar.f;
        this.f = aVar.g;
        this.g = aVar.h;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static class a {
        public static ChangeQuickRedirect a;
        String b;
        String c;
        String d;
        String e;
        int f;
        boolean g;
        e h;

        public final g a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "293144f2f4472f5ca146f7430305bdd8", RobustBitConfig.DEFAULT_VALUE) ? (g) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "293144f2f4472f5ca146f7430305bdd8") : new g(this);
        }
    }
}
