package com.sankuai.waimai.pouch.mach.tab;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.LinearLayoutManager;
import android.text.TextUtils;
import android.widget.FrameLayout;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.mach.utils.g;
import java.util.ArrayList;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class b extends com.sankuai.waimai.mach.component.base.a<PouchTabView> {
    public static ChangeQuickRedirect a = null;
    public static String b = "pouch_tab_indexchange";
    private c c;

    @Override // com.sankuai.waimai.mach.component.base.a
    public final boolean ad_() {
        return false;
    }

    @Override // com.sankuai.waimai.mach.component.base.a
    public final /* synthetic */ void a(PouchTabView pouchTabView) {
        String str;
        int i;
        PouchTabView pouchTabView2 = pouchTabView;
        Object[] objArr = {pouchTabView2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "39195d1853ba0ddf40f52db6c2dd62ec", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "39195d1853ba0ddf40f52db6c2dd62ec");
            return;
        }
        super.a((b) pouchTabView2);
        c cVar = this.c;
        ArrayList arrayList = new ArrayList(this.n.b());
        com.sankuai.waimai.mach.render.c renderEngine = this.m.getRenderEngine();
        Object[] objArr2 = {cVar, arrayList, renderEngine, this.m};
        ChangeQuickRedirect changeQuickRedirect2 = PouchTabView.a;
        if (PatchProxy.isSupport(objArr2, pouchTabView2, changeQuickRedirect2, false, "2bd66dd1de6fe339a847727cf955091f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, pouchTabView2, changeQuickRedirect2, false, "2bd66dd1de6fe339a847727cf955091f");
            return;
        }
        String str2 = cVar.e;
        Object[] objArr3 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect3 = c.a;
        if (PatchProxy.isSupport(objArr3, cVar, changeQuickRedirect3, false, "63a094e2628e0757df3cf7908e6c23a1", RobustBitConfig.DEFAULT_VALUE)) {
            str = (String) PatchProxy.accessDispatch(objArr3, cVar, changeQuickRedirect3, false, "63a094e2628e0757df3cf7908e6c23a1");
        } else {
            if (TextUtils.isEmpty(cVar.d)) {
                cVar.d = "vertical";
            }
            str = cVar.d;
        }
        if ("horizontal".equals(str)) {
            if (pouchTabView2.b.getLayoutParams() instanceof FrameLayout.LayoutParams) {
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) pouchTabView2.b.getLayoutParams();
                if (TextUtils.equals("start", str2)) {
                    layoutParams.gravity = 3;
                } else {
                    layoutParams.gravity = 5;
                }
                pouchTabView2.b.setLayoutParams(layoutParams);
            }
            i = 0;
        } else {
            if (TextUtils.equals("start", str2) && (pouchTabView2.b.getLayoutParams() instanceof FrameLayout.LayoutParams)) {
                FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) pouchTabView2.b.getLayoutParams();
                layoutParams2.gravity = 48;
                pouchTabView2.b.setLayoutParams(layoutParams2);
            }
            i = 1;
        }
        pouchTabView2.b.setLayoutManager(new LinearLayoutManager(pouchTabView2.getContext(), i, false));
        pouchTabView2.c = new a(arrayList, renderEngine);
        pouchTabView2.b.setAdapter(pouchTabView2.c);
        int i2 = cVar.b;
        if (i2 <= 0 || i2 >= cVar.c) {
            return;
        }
        pouchTabView2.c.a(i2);
    }

    @Override // com.sankuai.waimai.mach.component.base.a
    @NonNull
    public final /* synthetic */ PouchTabView b(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2f968a4419c9d58df964fde24b2188fa", RobustBitConfig.DEFAULT_VALUE) ? (PouchTabView) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2f968a4419c9d58df964fde24b2188fa") : new PouchTabView(context);
    }

    @Override // com.sankuai.waimai.mach.component.base.a
    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3b1d7e0006d05df5f94a577e3ebd24d1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3b1d7e0006d05df5f94a577e3ebd24d1");
            return;
        }
        String a2 = a("index");
        String a3 = a("count");
        String a4 = a("direction");
        String a5 = a("gravity");
        this.c = new c();
        this.c.b = g.c(a2);
        this.c.c = f(a3);
        this.c.e = a5;
        this.c.d = a4;
    }
}
