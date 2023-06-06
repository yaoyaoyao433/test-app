package com.sankuai.waimai.store.drug.goods.list.controller;

import android.app.Activity;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public abstract class g {
    public static ChangeQuickRedirect k;
    public com.sankuai.waimai.store.platform.domain.manager.poi.a l;
    public Activity m;
    public com.sankuai.waimai.store.drug.goods.list.delegate.c n;

    public void a(View view) {
    }

    public g(com.sankuai.waimai.store.drug.goods.list.delegate.c cVar) {
        Object[] objArr = {cVar};
        ChangeQuickRedirect changeQuickRedirect = k;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "28c18ed4547dcde2a7ac5e1edf6304aa", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "28c18ed4547dcde2a7ac5e1edf6304aa");
            return;
        }
        this.n = cVar;
        this.l = cVar.d();
        this.m = cVar.k();
    }
}
