package com.sankuai.waimai.platform.net.weaknetwork.strategy;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class d {
    public static ChangeQuickRedirect a;
    public int b;
    public long c;

    public d(com.sankuai.waimai.platform.net.weaknetwork.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d0c1edf58594e8ee3a8ed540b4ecfbdd", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d0c1edf58594e8ee3a8ed540b4ecfbdd");
            return;
        }
        this.b = 30000;
        if (aVar != null) {
            this.b = aVar.f;
        }
    }
}
