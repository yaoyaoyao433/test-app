package com.sankuai.waimai.touchmatrix.rebuild.ab;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
@Deprecated
/* loaded from: classes5.dex */
public final class a {
    public static ChangeQuickRedirect a;

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public interface b {
        void a(boolean z);
    }

    public a() {
    }

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.waimai.touchmatrix.rebuild.ab.a$a  reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    static final class C1350a {
        private static final a a = new a();
    }

    public static a a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "3d4f70cacab5dfc3a4acdc6141341114", RobustBitConfig.DEFAULT_VALUE) ? (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "3d4f70cacab5dfc3a4acdc6141341114") : C1350a.a;
    }

    public final void a(b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b6cb437914bb0cb2d73fc4515d6355a0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b6cb437914bb0cb2d73fc4515d6355a0");
        } else {
            bVar.a(true);
        }
    }
}
