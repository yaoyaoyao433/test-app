package com.sankuai.waimai.store.drug.goods.list.controller;

import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class b extends g {
    protected View.OnClickListener a;

    public b(com.sankuai.waimai.store.drug.goods.list.delegate.c cVar) {
        super(cVar);
        this.a = new View.OnClickListener() { // from class: com.sankuai.waimai.store.drug.goods.list.controller.b.1
            public static ChangeQuickRedirect a;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Object[] objArr = {view};
                ChangeQuickRedirect changeQuickRedirect = a;
                if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1c09490befdcbabe800278e57dc08fdb", 4611686018427387906L)) {
                    PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1c09490befdcbabe800278e57dc08fdb");
                } else {
                    b.this.m.onBackPressed();
                }
            }
        };
    }
}
