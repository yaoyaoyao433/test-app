package com.sankuai.waimai.store.drug.home.newp.block.rxevent;

import android.support.annotation.NonNull;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.waimai.store.platform.domain.core.poi.CategoryInfo;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class d {
    public static ChangeQuickRedirect a;
    @NonNull
    public CategoryInfo b;
    private int c;

    public d(@NonNull CategoryInfo categoryInfo, int i) {
        Object[] objArr = {categoryInfo, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fac484b44621affabf3ad126b505ef35", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fac484b44621affabf3ad126b505ef35");
            return;
        }
        this.c = i;
        this.b = categoryInfo;
    }
}
