package com.sankuai.xm.network;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class e extends com.sankuai.xm.network.net.c {
    public static ChangeQuickRedirect a;

    @Override // com.sankuai.xm.network.net.c
    public final com.sankuai.xm.network.net.b a(int i) {
        Object[] objArr = {1};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "286bb0ea8d5dc3c51018acb142584c7b", 6917529027641081856L) ? (com.sankuai.xm.network.net.b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "286bb0ea8d5dc3c51018acb142584c7b") : new com.sankuai.xm.network.net.http.c();
    }
}
