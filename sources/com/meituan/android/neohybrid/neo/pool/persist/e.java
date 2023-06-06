package com.meituan.android.neohybrid.neo.pool.persist;

import com.meituan.android.neohybrid.core.config.NeoConfig;
import com.meituan.android.neohybrid.core.t;
import com.meituan.android.neohybrid.neo.pool.persist.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class e extends c {
    public static ChangeQuickRedirect a;

    public e(NeoConfig neoConfig) {
        super(neoConfig);
        Object[] objArr = {neoConfig};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f9d9932341c12dc68247bc73570cff78", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f9d9932341c12dc68247bc73570cff78");
        }
    }

    @Override // com.meituan.android.neohybrid.neo.pool.persist.c
    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f92ec15d0bf06ce0b5bbce0b60075299", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f92ec15d0bf06ce0b5bbce0b60075299");
        } else {
            a(c.a.LOAD_URL);
        }
    }

    public final com.meituan.android.neohybrid.core.a c() {
        return this.e;
    }

    @Override // com.meituan.android.neohybrid.neo.pool.persist.c
    public final t b() {
        return t.PRE_LOAD;
    }

    @Override // com.meituan.android.neohybrid.neo.pool.persist.c
    public final boolean d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9fb547b88e321bb05314ba523ff8672f", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9fb547b88e321bb05314ba523ff8672f")).booleanValue() : super.d() && this.g == c.a.LOAD_URL;
    }
}
