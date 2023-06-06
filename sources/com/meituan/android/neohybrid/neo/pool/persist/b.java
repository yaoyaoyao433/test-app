package com.meituan.android.neohybrid.neo.pool.persist;

import com.meituan.android.neohybrid.core.config.NeoConfig;
import com.meituan.android.neohybrid.core.t;
import com.meituan.android.neohybrid.neo.pool.persist.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class b extends c {
    public static ChangeQuickRedirect a;

    public b(NeoConfig neoConfig) {
        super(neoConfig);
        Object[] objArr = {neoConfig};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1c76b3d73dc96e236cb6c3b695f1d7bf", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1c76b3d73dc96e236cb6c3b695f1d7bf");
        }
    }

    @Override // com.meituan.android.neohybrid.neo.pool.persist.c
    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "413d43c8193bc23a52b647f38218ebfd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "413d43c8193bc23a52b647f38218ebfd");
        } else {
            a(c.a.CREATE_VIEW);
        }
    }

    @Override // com.meituan.android.neohybrid.neo.pool.persist.c
    public final t b() {
        return t.PRE_LOAD;
    }

    public final com.meituan.android.neohybrid.core.a c() {
        return this.e;
    }

    @Override // com.meituan.android.neohybrid.neo.pool.persist.c
    public final boolean d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9ab4181c2fd2a6c6f796c80ce2b9381a", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9ab4181c2fd2a6c6f796c80ce2b9381a")).booleanValue() : super.d() && this.g == c.a.CREATE_VIEW;
    }
}
