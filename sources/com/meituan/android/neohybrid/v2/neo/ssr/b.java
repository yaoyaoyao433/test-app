package com.meituan.android.neohybrid.v2.neo.ssr;

import android.webkit.WebResourceRequest;
import com.meituan.android.neohybrid.protocol.kernel.c;
import com.meituan.android.neohybrid.v2.neo.offline.f;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final /* synthetic */ class b implements com.meituan.android.neohybrid.v2.neo.offline.a {
    public static ChangeQuickRedirect a;
    private final a b;

    public b(a aVar) {
        this.b = aVar;
    }

    @Override // com.meituan.android.neohybrid.v2.neo.offline.a
    public final f a(c cVar, WebResourceRequest webResourceRequest) {
        Object[] objArr = {cVar, webResourceRequest};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b0c9a0a8d88c8afef043acdabf8724c0", RobustBitConfig.DEFAULT_VALUE) ? (f) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b0c9a0a8d88c8afef043acdabf8724c0") : a.a(this.b, cVar, webResourceRequest);
    }
}
