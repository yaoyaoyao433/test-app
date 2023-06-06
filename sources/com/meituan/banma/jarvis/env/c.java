package com.meituan.banma.jarvis.env;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.retrofit2.raw.a;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class c {
    public static ChangeQuickRedirect a;
    public com.meituan.banma.jarvis.env.a b;
    public b c;
    public d d;
    public a.InterfaceC0637a e;

    public c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "496c4bfd2e51d23d9d50f4fe4bc0057e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "496c4bfd2e51d23d9d50f4fe4bc0057e");
            return;
        }
        this.d = d.ENV_RELEASE;
        this.e = null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static class a {
        private static final c a = new c();
    }

    public static c a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "fce63ba258652a27fa11c2fb716df377", RobustBitConfig.DEFAULT_VALUE) ? (c) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "fce63ba258652a27fa11c2fb716df377") : a.a;
    }

    public final void a(d dVar) {
        boolean z = true;
        Object[] objArr = {dVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4895df94f50890c2eeb4abe37c33012d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4895df94f50890c2eeb4abe37c33012d");
            return;
        }
        this.d = dVar;
        if (dVar == null || (!dVar.equals(d.ENV_TEST) && !dVar.equals(d.ENV_DEV))) {
            z = false;
        }
        com.meituan.banma.jarvis.utils.c.a(z);
    }

    public final long b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b92746b0ee0742fd582f3f13f500d63d", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b92746b0ee0742fd582f3f13f500d63d")).longValue();
        }
        if (this.c == null || this.c.a() <= 0) {
            return 180L;
        }
        return this.c.a();
    }
}
