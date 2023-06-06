package com.sankuai.waimai.store.goods.list.templet.newmarket.spulist;

import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.goods.list.templet.newmarket.spulist.adapter.j;
import com.sankuai.waimai.store.goods.list.templet.newmarket.spulist.adapter.p;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class f extends com.sankuai.waimai.store.newwidgets.list.e<j> {
    public static ChangeQuickRedirect a;
    private p c;

    @Override // com.sankuai.waimai.store.newwidgets.list.g
    public final int a() {
        return R.layout.wm_sc_shop_content_goods_sort_item_layout;
    }

    @Override // com.sankuai.waimai.store.newwidgets.list.g
    public final void a(@NonNull View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b56ab8ac2b0f62110403380420d0dfa7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b56ab8ac2b0f62110403380420d0dfa7");
            return;
        }
        this.c = new p();
        this.c.a((p) this.o);
        this.c.a(view);
    }

    @Override // com.sankuai.waimai.store.newwidgets.list.e
    public final void a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d44d5bd4c2621aa233264a3f7964a6c2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d44d5bd4c2621aa233264a3f7964a6c2");
        } else {
            this.c.a(((j) this.o).b(i), i);
        }
    }

    @Override // com.sankuai.waimai.store.newwidgets.list.e
    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "82e8f7a1738fd84ae2f0b5c2366f069d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "82e8f7a1738fd84ae2f0b5c2366f069d");
            return;
        }
        super.b();
        this.c.c();
    }
}
