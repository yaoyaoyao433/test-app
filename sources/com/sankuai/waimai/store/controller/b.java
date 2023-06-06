package com.sankuai.waimai.store.controller;

import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class b extends g {
    protected View.OnClickListener a;

    public b(com.sankuai.waimai.store.goods.list.delegate.d dVar) {
        super(dVar);
        this.a = new View.OnClickListener() { // from class: com.sankuai.waimai.store.controller.b.1
            public static ChangeQuickRedirect a;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Object[] objArr = {view};
                ChangeQuickRedirect changeQuickRedirect = a;
                if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "59c75fa4ff6c1f620259a7b7b5de7c32", 4611686018427387906L)) {
                    PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "59c75fa4ff6c1f620259a7b7b5de7c32");
                } else {
                    b.this.n.onBackPressed();
                }
            }
        };
    }
}
