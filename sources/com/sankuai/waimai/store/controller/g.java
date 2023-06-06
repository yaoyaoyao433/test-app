package com.sankuai.waimai.store.controller;

import android.app.Activity;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public abstract class g {
    public static ChangeQuickRedirect l;
    public com.sankuai.waimai.store.platform.domain.manager.poi.a m;
    public Activity n;
    public com.sankuai.waimai.store.goods.list.delegate.d o;

    public void a(View view) {
    }

    public g(com.sankuai.waimai.store.goods.list.delegate.d dVar) {
        Object[] objArr = {dVar};
        ChangeQuickRedirect changeQuickRedirect = l;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "39ef7ec8f5ee40874ed51f094997783c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "39ef7ec8f5ee40874ed51f094997783c");
            return;
        }
        this.o = dVar;
        this.m = dVar.d();
        this.n = dVar.k();
    }
}
