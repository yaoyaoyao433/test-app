package com.sankuai.waimai.rocks.view.viewmodel;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.mach.recycler.a;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a<T extends com.sankuai.waimai.mach.recycler.a> extends e {
    public static ChangeQuickRedirect o;
    public T p;

    public final void n() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = o;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3ee973144f56a4cbbfc6a64089adf85f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3ee973144f56a4cbbfc6a64089adf85f");
        } else if (this.p != null) {
            this.p.f();
        }
    }

    @Override // com.sankuai.waimai.rocks.view.viewmodel.e
    public final void o() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = o;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2509dc5b51ce83f3264128ea59f5c62f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2509dc5b51ce83f3264128ea59f5c62f");
        } else if (this.p == null || this.p.b() == null) {
        } else {
            this.p.b().a("rocks_adapter_position", Integer.valueOf(this.w));
            this.p.b().a("rocks_is_cache", Boolean.valueOf(this.b));
        }
    }

    @Override // com.sankuai.waimai.rocks.view.viewmodel.e
    public final void p() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = o;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c1af21c9120889f4d5b2d916ebd4000d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c1af21c9120889f4d5b2d916ebd4000d");
        } else if (this.p == null || this.p.b() == null) {
        } else {
            this.p.b().a("rocks_col_index", Integer.valueOf(this.x));
            this.p.b().a("rocks_col_num", Integer.valueOf(this.y));
        }
    }
}
