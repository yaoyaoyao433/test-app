package com.sankuai.waimai.store.drug.goods.list.delegate.impl;

import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.view.ViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.drug.goods.list.templet.drugselfbusiness.DrugSelfBusinessContainerBlock;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class b {
    public static ChangeQuickRedirect a;
    private final List<com.sankuai.waimai.store.drug.goods.list.viewblocks.base.a> b;
    private final ViewGroup c;

    public b(@NonNull com.sankuai.waimai.store.drug.goods.list.delegate.c cVar, ViewGroup viewGroup) {
        Object[] objArr = {cVar, viewGroup};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "94ccafb78179050370cab183914f77ac", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "94ccafb78179050370cab183914f77ac");
            return;
        }
        this.b = new ArrayList();
        Object[] objArr2 = {cVar};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "e76397538337130c420cbd53efeedbc7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "e76397538337130c420cbd53efeedbc7");
        } else {
            this.b.add(new com.sankuai.waimai.store.drug.goods.list.viewblocks.c(cVar));
            this.b.add(new DrugSelfBusinessContainerBlock(cVar));
        }
        this.c = (ViewGroup) viewGroup.findViewById(R.id.layout_shop_root_scroll_container);
        a();
    }

    private void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "86b184863d82f97dee4017a1adc45076", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "86b184863d82f97dee4017a1adc45076");
            return;
        }
        for (com.sankuai.waimai.store.drug.goods.list.viewblocks.base.a aVar : this.b) {
            aVar.createView(this.c);
        }
    }

    public final com.sankuai.waimai.store.drug.goods.list.viewblocks.base.a a(Class<? extends com.sankuai.waimai.store.drug.goods.list.viewblocks.base.a> cls) {
        Object[] objArr = {cls};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "88a7dca2f0f418c60307a60718b6c2d3", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.sankuai.waimai.store.drug.goods.list.viewblocks.base.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "88a7dca2f0f418c60307a60718b6c2d3");
        }
        this.c.removeAllViews();
        com.sankuai.waimai.store.drug.goods.list.viewblocks.base.a aVar = null;
        for (com.sankuai.waimai.store.drug.goods.list.viewblocks.base.a aVar2 : this.b) {
            if (aVar2.getClass() == cls) {
                this.c.addView(aVar2.getView());
                aVar = aVar2;
            } else {
                aVar2.onDestroy();
            }
        }
        this.b.clear();
        return aVar;
    }
}
