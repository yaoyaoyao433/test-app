package com.meituan.android.neohybrid.neo.http.interceptor;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.retrofit2.Interceptor;
import com.sankuai.meituan.retrofit2.aj;
import java.io.IOException;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class c extends a {
    public static ChangeQuickRedirect b;
    private com.meituan.android.paybase.net.interceptor.a c;

    @Override // com.meituan.android.neohybrid.neo.http.interceptor.a, com.sankuai.meituan.retrofit2.Interceptor
    public final /* bridge */ /* synthetic */ com.sankuai.meituan.retrofit2.raw.b intercept(Interceptor.a aVar) throws IOException {
        return super.intercept(aVar);
    }

    public c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2ae20e33b8672e3f85843f986a2a8fa5", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2ae20e33b8672e3f85843f986a2a8fa5");
        } else {
            this.c = new com.meituan.android.paybase.net.interceptor.a();
        }
    }

    @Override // com.meituan.android.neohybrid.neo.http.interceptor.a
    public final com.sankuai.meituan.retrofit2.raw.b a(Interceptor.a aVar) throws IOException, com.meituan.android.neohybrid.exception.a {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d9c3975c0eaf71c1d4bac92a53e8e1c9", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.sankuai.meituan.retrofit2.raw.b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d9c3975c0eaf71c1d4bac92a53e8e1c9");
        }
        aj request = aVar.request();
        if (this.c != null && !com.meituan.android.neohybrid.neo.http.d.a(request)) {
            return this.c.intercept(aVar);
        }
        return aVar.a(request);
    }
}
