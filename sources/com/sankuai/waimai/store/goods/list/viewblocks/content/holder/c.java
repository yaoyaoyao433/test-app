package com.sankuai.waimai.store.goods.list.viewblocks.content.holder;

import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.waimai.store.widgets.recycler.e;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class c extends e {
    public static ChangeQuickRedirect a;
    public com.sankuai.waimai.store.goods.list.mach.a b;
    public com.sankuai.waimai.mach.recycler.c c;

    public c(View view, com.sankuai.waimai.store.goods.list.mach.a aVar) {
        super(view);
        Object[] objArr = {view, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "07ff4af94ecea78ebee8de65df18511f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "07ff4af94ecea78ebee8de65df18511f");
        } else {
            this.b = aVar;
        }
    }
}
