package com.sankuai.waimai.platform.net.weaknetwork.strategy;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class f {
    public static ChangeQuickRedirect a;
    public int b;
    public long c;

    public f(com.sankuai.waimai.platform.net.weaknetwork.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e93152b7b43602ddd5ec660c38b42217", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e93152b7b43602ddd5ec660c38b42217");
            return;
        }
        this.b = 60000;
        if (aVar != null) {
            this.b = aVar.k;
        }
    }
}
