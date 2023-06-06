package com.sankuai.waimai.store.poilist.view.sub;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.newwidgets.list.g;
import com.sankuai.waimai.store.repository.model.PoiVerticality;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class b extends g<PoiVerticality, com.sankuai.waimai.store.newwidgets.list.b> {
    public static ChangeQuickRedirect a;
    protected com.sankuai.waimai.store.poilist.view.b b;

    @Override // com.sankuai.waimai.store.newwidgets.list.g
    public void a(PoiVerticality poiVerticality, int i) {
        Object[] objArr = {poiVerticality, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ae486fa3d52bf8dc3814761b4f890765", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ae486fa3d52bf8dc3814761b4f890765");
        } else if (poiVerticality == null) {
        } else {
            this.b.a(poiVerticality, i);
        }
    }

    @Override // com.sankuai.waimai.store.newwidgets.list.g
    public void a(@NonNull View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "216df69db731f7783db716ddb0a419c5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "216df69db731f7783db716ddb0a419c5");
            return;
        }
        this.b = a(view.getContext());
        Object[] objArr2 = {view};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "e5cf9c1a0f544b3357c88fc3c25d154f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "e5cf9c1a0f544b3357c88fc3c25d154f");
        } else {
            this.b.bindView(view);
        }
    }

    public com.sankuai.waimai.store.poilist.view.b a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3899f13b9178bc223f9c3d68ba990692", RobustBitConfig.DEFAULT_VALUE) ? (com.sankuai.waimai.store.poilist.view.b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3899f13b9178bc223f9c3d68ba990692") : new com.sankuai.waimai.store.poilist.view.c(context);
    }

    public final <T extends com.sankuai.waimai.store.poilist.view.c> T b() {
        return (T) this.b;
    }
}
