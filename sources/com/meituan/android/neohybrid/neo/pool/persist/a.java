package com.meituan.android.neohybrid.neo.pool.persist;

import com.meituan.android.neohybrid.core.config.NeoConfig;
import com.meituan.android.neohybrid.core.t;
import com.meituan.android.neohybrid.neo.nsr.c;
import com.meituan.android.neohybrid.neo.pool.persist.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class a extends c implements c.b {
    public static ChangeQuickRedirect a;
    private String h;

    public a(NeoConfig neoConfig) {
        super(neoConfig);
        Object[] objArr = {neoConfig};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c1583720f9d7d5ead5af5f5279e1027d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c1583720f9d7d5ead5af5f5279e1027d");
        } else {
            this.h = neoConfig.getUrl();
        }
    }

    @Override // com.meituan.android.neohybrid.neo.pool.persist.c
    public final void a(c cVar) {
        Object[] objArr = {cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "61ffd369ab710e0f43f8b759888d0c26", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "61ffd369ab710e0f43f8b759888d0c26");
            return;
        }
        super.a(cVar);
        this.e.a(this);
        com.meituan.android.neohybrid.neo.report.d.a(this.e, "neo_nsr", "1");
    }

    @Override // com.meituan.android.neohybrid.neo.pool.persist.c
    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "af1c9b8132d25a7437e9bc64587eccf3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "af1c9b8132d25a7437e9bc64587eccf3");
        } else {
            a(c.a.LOAD_URL);
        }
    }

    public final com.meituan.android.neohybrid.core.a a(boolean z) {
        if (this.g == c.a.SUCC || z) {
            return this.e;
        }
        return null;
    }

    @Override // com.meituan.android.neohybrid.neo.pool.persist.c
    public final t b() {
        return t.NATIVE_SIDE_RENDER;
    }

    @Override // com.meituan.android.neohybrid.neo.nsr.c.b
    public final void c(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "85f5b53c47ca63396b95ee78d84ac6ab", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "85f5b53c47ca63396b95ee78d84ac6ab");
        } else {
            b(c.a.SUCC);
        }
    }

    @Override // com.meituan.android.neohybrid.neo.nsr.c.b
    public final void d(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4fffa1857a85f165f42370235a3ceff7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4fffa1857a85f165f42370235a3ceff7");
        } else {
            b(c.a.FETCHED);
        }
    }

    @Override // com.meituan.android.neohybrid.neo.nsr.c.b
    public final void b(String str, int i, String str2) {
        Object[] objArr = {str, Integer.valueOf(i), str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e5c6bdf0cb73350e95ea6ac69ef95095", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e5c6bdf0cb73350e95ea6ac69ef95095");
        } else {
            b(c.a.FAIL);
        }
    }

    @Override // com.meituan.android.neohybrid.neo.nsr.c.b
    public final void e(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8b35e5e5fd9f0ef49aef202c8aeba63f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8b35e5e5fd9f0ef49aef202c8aeba63f");
        } else {
            b(c.a.DESTROY);
        }
    }
}
