package com.meituan.android.neohybrid.v2.neo.offline;

import android.webkit.WebResourceRequest;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final /* synthetic */ class c implements a {
    public static ChangeQuickRedirect a;
    private final com.meituan.android.neohybrid.v2.core.a b;

    public c(com.meituan.android.neohybrid.v2.core.a aVar) {
        this.b = aVar;
    }

    @Override // com.meituan.android.neohybrid.v2.neo.offline.a
    public final f a(com.meituan.android.neohybrid.protocol.kernel.c cVar, WebResourceRequest webResourceRequest) {
        Object[] objArr = {cVar, webResourceRequest};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "44b35b47f3e1ffe4e3f05b20a44fc911", RobustBitConfig.DEFAULT_VALUE) ? (f) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "44b35b47f3e1ffe4e3f05b20a44fc911") : b.a(this.b, cVar, webResourceRequest);
    }
}
