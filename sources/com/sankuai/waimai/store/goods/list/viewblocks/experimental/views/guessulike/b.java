package com.sankuai.waimai.store.goods.list.viewblocks.experimental.views.guessulike;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class b {
    public static ChangeQuickRedirect a;
    int b;

    public b(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2aa28d3f4e8f896ec476594910e31fa0", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2aa28d3f4e8f896ec476594910e31fa0");
        } else {
            this.b = i;
        }
    }
}
