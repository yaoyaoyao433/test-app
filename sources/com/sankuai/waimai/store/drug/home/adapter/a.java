package com.sankuai.waimai.store.drug.home.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.drug.home.adapter.subcategory.core.b;
import com.sankuai.waimai.store.drug.home.model.c;
import com.sankuai.waimai.store.drug.home.refactor.card.feed_flow.c;
import com.sankuai.waimai.store.platform.domain.core.poi.CategoryInfo;
import com.sankuai.waimai.store.widgets.recycler.e;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a {
    public static ChangeQuickRedirect a;
    public com.sankuai.waimai.store.drug.home.adapter.subcategory.core.a<? extends e> b;

    public final void a(c cVar) {
        Object[] objArr = {cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6b0c072d22d959623bf8dd3a5938622d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6b0c072d22d959623bf8dd3a5938622d");
        }
    }

    public a(@NonNull com.sankuai.waimai.store.param.a aVar, @NonNull c.a aVar2, Context context, int i) {
        Object[] objArr = {aVar, aVar2, context, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f5bf817a37b7474d93b377c85aa7ba79", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f5bf817a37b7474d93b377c85aa7ba79");
        } else {
            this.b = new b(aVar, aVar2, context, i);
        }
    }

    public final void a(com.sankuai.waimai.store.drug.home.adapter.subcategory.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fb5b6b46a269b205115c015b092371e6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fb5b6b46a269b205115c015b092371e6");
        } else {
            this.b.a(aVar);
        }
    }

    public final void a(List<CategoryInfo> list, int i) {
        Object[] objArr = {list, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d4c156ab5b320f32ec62b456baec22d8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d4c156ab5b320f32ec62b456baec22d8");
        } else {
            this.b.a(list, i);
        }
    }
}
