package com.sankuai.waimai.store.goods.list.views.sale.sub.core.base;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.ViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.waimai.store.util.z;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public abstract class c extends com.sankuai.waimai.store.base.b implements com.sankuai.waimai.store.goods.list.views.sale.sub.a {
    public static ChangeQuickRedirect c;
    public final com.sankuai.waimai.store.base.statistic.a d;

    public abstract int a();

    public c(@NonNull ViewGroup viewGroup, @Nullable com.sankuai.waimai.store.base.statistic.a aVar) {
        super(viewGroup.getContext());
        Object[] objArr = {viewGroup, aVar};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "30056a7e82e1325a4bcd72c30dcbcc3b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "30056a7e82e1325a4bcd72c30dcbcc3b");
            return;
        }
        this.d = aVar;
        bindView(z.a(viewGroup.getContext(), a(), viewGroup, true));
    }
}
