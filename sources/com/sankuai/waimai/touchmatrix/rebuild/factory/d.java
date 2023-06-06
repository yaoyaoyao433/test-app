package com.sankuai.waimai.touchmatrix.rebuild.factory;

import android.util.SparseArray;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.touchmatrix.show.f;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class d {
    public static ChangeQuickRedirect a;
    public SparseArray<f> b;

    public d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0cb008d67a9b9e7c10891d3a359592c2", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0cb008d67a9b9e7c10891d3a359592c2");
            return;
        }
        b bVar = new b();
        this.b = new SparseArray<>();
        this.b.put(8, bVar);
        this.b.put(4, bVar);
    }

    public static d a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "31ccb47da7f460e26f98c3af61229ee0", RobustBitConfig.DEFAULT_VALUE) ? (d) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "31ccb47da7f460e26f98c3af61229ee0") : a.a;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public static final class a {
        private static final d a = new d();
    }

    public final void a(int i, f fVar) {
        Object[] objArr = {1, fVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "db7a36f900553452edccfac217c84127", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "db7a36f900553452edccfac217c84127");
        } else {
            this.b.put(1, fVar);
        }
    }
}
