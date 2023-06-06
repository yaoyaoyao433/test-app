package com.sankuai.waimai.store.poi.list.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.platform.domain.core.poi.CategoryInfo;
import com.sankuai.waimai.store.poi.list.adapter.subcategory.core.b;
import com.sankuai.waimai.store.poi.list.refactor.card.feed_flow.c;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a {
    public static ChangeQuickRedirect a;
    public com.sankuai.waimai.store.poi.list.adapter.subcategory.core.a b;
    public boolean c;
    private boolean d;

    public a(@NonNull com.sankuai.waimai.store.param.a aVar, @NonNull c.a aVar2, Context context, int i) {
        Object[] objArr = {aVar, aVar2, context, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5efcb69f0fabaca011d0aeabc8b12972", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5efcb69f0fabaca011d0aeabc8b12972");
            return;
        }
        this.d = true;
        this.c = false;
        if (aVar2.c == 1 || aVar2.c == 2 || aVar2.c == 4 || aVar2.c == 5 || aVar2.c == 6) {
            this.b = new b(aVar, aVar2, context, i);
        } else {
            this.b = new com.sankuai.waimai.store.poi.list.adapter.subcategory.core.c(aVar, aVar2, context, i);
        }
    }

    public final void a(com.sankuai.waimai.store.poi.list.adapter.subcategory.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "eeb34058675437f0ff4de03898a664a4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "eeb34058675437f0ff4de03898a664a4");
        } else {
            this.b.a(aVar);
        }
    }

    public final void a(List list, int i) {
        Object[] objArr = {list, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a31dca9aac87baa59d8e011a9e957a3e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a31dca9aac87baa59d8e011a9e957a3e");
        } else {
            this.b.a((List<CategoryInfo>) list, i);
        }
    }
}
