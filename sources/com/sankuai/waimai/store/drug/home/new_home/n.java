package com.sankuai.waimai.store.drug.home.new_home;

import android.view.View;
import android.widget.FrameLayout;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class n extends com.sankuai.waimai.store.drug.home.newp.poilist.viewholders.a {
    public static ChangeQuickRedirect a;
    com.sankuai.waimai.store.drug.home.new_home.filter.c b;

    public n(View view, com.sankuai.waimai.store.drug.home.new_home.filter.d dVar, com.sankuai.waimai.store.param.a aVar) {
        super(view);
        Object[] objArr = {view, dVar, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ca13a99f000f45b656dcfc3f2e49653b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ca13a99f000f45b656dcfc3f2e49653b");
            return;
        }
        this.b = new com.sankuai.waimai.store.drug.home.new_home.filter.c(view.getContext(), aVar, dVar);
        this.b.createAndReplaceView((FrameLayout) view);
    }
}
