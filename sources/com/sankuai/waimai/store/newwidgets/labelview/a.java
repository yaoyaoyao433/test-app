package com.sankuai.waimai.store.newwidgets.labelview;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.newwidgets.labelview.b;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a extends c {
    public static ChangeQuickRedirect a;
    private final b.a e;

    public a(b.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "56ea41fe1cf9158819cdf531302b9ebf", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "56ea41fe1cf9158819cdf531302b9ebf");
        } else {
            this.e = aVar;
        }
    }

    @Override // com.sankuai.waimai.store.newwidgets.labelview.e
    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "87d90f3fb84662455d535d7d7e32354b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "87d90f3fb84662455d535d7d7e32354b");
            return;
        }
        super.a();
        this.e.a();
    }
}
