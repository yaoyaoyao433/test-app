package com.sankuai.waimai.store.drug.goods.list.delegate.impl;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final /* synthetic */ class d implements android.arch.lifecycle.l {
    public static ChangeQuickRedirect a;
    private final c b;

    public d(c cVar) {
        this.b = cVar;
    }

    @Override // android.arch.lifecycle.l
    public final void a(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e085bf5037b125a805eda49043f062c1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e085bf5037b125a805eda49043f062c1");
        } else {
            c.a(this.b, (com.sankuai.waimai.store.drug.goods.list.model.b) obj);
        }
    }
}
