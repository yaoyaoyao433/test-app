package com.sankuai.waimai.store.drug.newwidgets.labelview;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.drug.newwidgets.labelview.b;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a extends c {
    public static ChangeQuickRedirect a;
    private final b.a e;

    public a(b.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "24989e90b71ed6ed6b53879f3c08e093", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "24989e90b71ed6ed6b53879f3c08e093");
        } else {
            this.e = aVar;
        }
    }

    @Override // com.sankuai.waimai.store.drug.newwidgets.labelview.e
    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3cd87ebc7b2d6c6df326807cf71a9107", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3cd87ebc7b2d6c6df326807cf71a9107");
            return;
        }
        super.a();
        this.e.a();
    }
}
