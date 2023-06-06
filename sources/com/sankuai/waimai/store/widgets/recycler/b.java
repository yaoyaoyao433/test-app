package com.sankuai.waimai.store.widgets.recycler;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.widgets.recycler.e;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public abstract class b<Holder extends e> extends a<e> {
    public static ChangeQuickRedirect e;
    protected k f;

    @Override // com.sankuai.waimai.store.widgets.recycler.a, com.sankuai.waimai.store.widgets.recycler.f
    public final void a(k kVar) {
        Object[] objArr = {kVar};
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6f7ba38207556decadda8bfdf69966f7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6f7ba38207556decadda8bfdf69966f7");
            return;
        }
        this.f = kVar;
        a((h) kVar);
    }

    public final void b(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7d9882da67ab45ac4db6b576e96ddeb1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7d9882da67ab45ac4db6b576e96ddeb1");
        } else if (this.f != null) {
            if (i > h()) {
                i += h();
            }
            this.f.b(i, i2);
        }
    }

    public final void c(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "78e7a7722c0144157da721901200cb79", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "78e7a7722c0144157da721901200cb79");
        } else if (this.f != null) {
            if (i > h()) {
                i += h();
            }
            this.f.c(i, i2);
        }
    }

    public final void d(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f79fb7c817cffd7a277fe918c151b12e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f79fb7c817cffd7a277fe918c151b12e");
        } else if (this.f != null) {
            if (i > h()) {
                i += h();
            }
            this.f.d(i, i2);
        }
    }
}
