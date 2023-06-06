package com.meituan.android.mrn.utils.config;

import com.meituan.android.mrn.utils.config.e;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public abstract class f<V extends e> extends e {
    public static ChangeQuickRedirect f;
    private final c<V> a;

    public abstract V a();

    public f(c<V> cVar) {
        Object[] objArr = {cVar};
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e8adf9b6ba63b1087c22315dfec5d5cb", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e8adf9b6ba63b1087c22315dfec5d5cb");
        } else {
            this.a = cVar;
        }
    }

    @Override // com.meituan.android.mrn.utils.config.e
    public final boolean b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = f;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8f6f37ffbba43891c2b32cd7b9e5e611", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8f6f37ffbba43891c2b32cd7b9e5e611")).booleanValue() : this.a.b(a());
    }

    @Override // com.meituan.android.mrn.utils.config.e
    public final void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a27a2507eb234abac3d7d9bb7b2a0d55", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a27a2507eb234abac3d7d9bb7b2a0d55");
        } else {
            this.a.d(a());
        }
    }

    @Override // com.meituan.android.mrn.utils.config.e
    public final void d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7f117ef5e0eec4623f5ea213eafc2269", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7f117ef5e0eec4623f5ea213eafc2269");
        } else {
            this.a.c(a());
        }
    }

    @Override // com.meituan.android.mrn.utils.config.e
    public final Object e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = f;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1d0c45e1fce2323af35970c1e4892113", RobustBitConfig.DEFAULT_VALUE) ? PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1d0c45e1fce2323af35970c1e4892113") : this.a.a(a());
    }
}
