package com.sankuai.eh.component.web.chain;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class e {
    public static ChangeQuickRedirect a;
    String b;
    String c;
    String d;
    long e;
    long f;

    public e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "21edee009041043e0d1c34da186d0b93", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "21edee009041043e0d1c34da186d0b93");
            return;
        }
        this.e = -1L;
        this.f = -1L;
    }

    public final String toString() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d040eb6e4dfff41fca465747ed37d49b", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d040eb6e4dfff41fca465747ed37d49b") : com.sankuai.eh.component.service.utils.b.a((Object) this, true);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static class a {
        public static ChangeQuickRedirect a;
        e b;

        public a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8625a0af78457c35ab10c45b0616bd08", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8625a0af78457c35ab10c45b0616bd08");
                return;
            }
            this.b = new e();
            this.b.b = com.sankuai.eh.component.service.utils.d.c();
        }
    }
}
