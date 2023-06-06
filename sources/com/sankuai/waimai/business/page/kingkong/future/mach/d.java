package com.sankuai.waimai.business.page.kingkong.future.mach;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.HashSet;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class d {
    public static ChangeQuickRedirect a;
    HashSet b;

    public d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "92587a73e4144793c4f68098992507c9", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "92587a73e4144793c4f68098992507c9");
        } else {
            this.b = null;
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    static final class a {
        private static final d a = new d();
    }

    public static d a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "97be462ab9158cd9d6327e322383b6f4", RobustBitConfig.DEFAULT_VALUE) ? (d) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "97be462ab9158cd9d6327e322383b6f4") : a.a;
    }

    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a78581b0c3a9c3c81091d6e34d78b947", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a78581b0c3a9c3c81091d6e34d78b947");
        } else if (this.b != null) {
            this.b.clear();
        }
    }
}
