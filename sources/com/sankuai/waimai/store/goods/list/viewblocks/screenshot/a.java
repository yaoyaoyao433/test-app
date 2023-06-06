package com.sankuai.waimai.store.goods.list.viewblocks.screenshot;

import android.support.v4.app.FragmentActivity;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.waimai.store.goods.list.delegate.d;
import com.sankuai.waimai.store.platform.domain.core.tip.SCShareTip;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a {
    public static ChangeQuickRedirect a;
    public SCShareTip b;
    public com.sankuai.waimai.store.i.screenshot.observer.a c;
    private FragmentActivity d;

    public a(d dVar) {
        Object[] objArr = {dVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ccc357514dd0dd2bc3d6ee0fb566f640", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ccc357514dd0dd2bc3d6ee0fb566f640");
            return;
        }
        this.c = new com.sankuai.waimai.store.i.screenshot.observer.a() { // from class: com.sankuai.waimai.store.goods.list.viewblocks.screenshot.a.1
        };
        this.d = dVar.k();
        com.sankuai.waimai.store.manager.screenshot.a.a(this.c);
    }
}
