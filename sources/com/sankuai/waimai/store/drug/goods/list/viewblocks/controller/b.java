package com.sankuai.waimai.store.drug.goods.list.viewblocks.controller;

import android.support.v4.app.FragmentActivity;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.waimai.store.drug.goods.list.delegate.c;
import com.sankuai.waimai.store.platform.domain.core.tip.SCShareTip;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class b {
    public static ChangeQuickRedirect a;
    public SCShareTip b;
    public com.sankuai.waimai.store.i.screenshot.observer.a c;
    private FragmentActivity d;

    public b(c cVar) {
        Object[] objArr = {cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fe87f95e4459b0e02b4678a80eaff3f3", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fe87f95e4459b0e02b4678a80eaff3f3");
            return;
        }
        this.c = new com.sankuai.waimai.store.i.screenshot.observer.a() { // from class: com.sankuai.waimai.store.drug.goods.list.viewblocks.controller.b.1
        };
        this.d = cVar.k();
        a.a(this.c);
    }
}
