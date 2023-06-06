package com.sankuai.waimai.store.widgets.filterbar.sortlist;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.View;
import android.view.ViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.newwidgets.list.g;
import com.sankuai.waimai.store.platform.shop.model.SGSortModel;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class d extends g<SGSortModel, c> {
    public static ChangeQuickRedirect a;
    private int b;
    private com.sankuai.waimai.store.widgets.filterbar.sortlist.item.a c;

    @Override // com.sankuai.waimai.store.newwidgets.list.g
    public final void a(@NonNull View view) {
    }

    @Override // com.sankuai.waimai.store.newwidgets.list.g
    public final /* synthetic */ void a(SGSortModel sGSortModel, int i) {
        SGSortModel sGSortModel2 = sGSortModel;
        Object[] objArr = {sGSortModel2, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c1b5f5fdef385ee379c47695f06b1064", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c1b5f5fdef385ee379c47695f06b1064");
        } else {
            this.c.a(((c) this.o).a(), sGSortModel2);
        }
    }

    public d(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "68596a37286bc36973b2a74f9b6eb267", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "68596a37286bc36973b2a74f9b6eb267");
        } else {
            this.b = i;
        }
    }

    @Override // com.sankuai.waimai.store.newwidgets.list.g
    public final View a(ViewGroup viewGroup) {
        com.sankuai.waimai.store.widgets.filterbar.sortlist.item.a aVar;
        Object[] objArr = {viewGroup};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "feb7f23cfc29bd4dc0efdb79701ac05f", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "feb7f23cfc29bd4dc0efdb79701ac05f");
        }
        Context context = viewGroup.getContext();
        com.sankuai.waimai.store.widgets.filterbar.sortlist.item.b bVar = (com.sankuai.waimai.store.widgets.filterbar.sortlist.item.b) this.o;
        int i = this.b;
        Object[] objArr2 = {context, bVar, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.waimai.store.widgets.filterbar.sortlist.factory.a.a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "38654806991d84f6746fee23a40e20ac", RobustBitConfig.DEFAULT_VALUE)) {
            aVar = (com.sankuai.waimai.store.widgets.filterbar.sortlist.item.a) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "38654806991d84f6746fee23a40e20ac");
        } else if (i == 1) {
            aVar = new com.sankuai.waimai.store.widgets.filterbar.sortlist.item.one.a(context, bVar);
        } else if (i == 2) {
            aVar = new com.sankuai.waimai.store.widgets.filterbar.sortlist.item.two.a(context, bVar);
        } else {
            aVar = new com.sankuai.waimai.store.widgets.filterbar.sortlist.item.one.a(context, bVar);
        }
        this.c = aVar;
        this.c.c = ((c) this.o).b();
        com.sankuai.waimai.store.widgets.filterbar.sortlist.item.a aVar2 = this.c;
        int c = ((c) this.o).c();
        int d = ((c) this.o).d();
        aVar2.d = c;
        aVar2.e = d;
        return this.c.createView(viewGroup);
    }
}
