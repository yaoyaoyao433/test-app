package com.sankuai.waimai.platform.net.interceptor.okhttp;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.squareup.okhttp.t;
import com.squareup.okhttp.x;
import com.squareup.okhttp.z;
import java.io.IOException;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class d implements t {
    public static ChangeQuickRedirect a;
    private com.sankuai.waimai.platform.capacity.log.c b;

    public d(com.sankuai.waimai.platform.capacity.log.c cVar) {
        Object[] objArr = {cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8da8ba369ef7cdb7cb07536658169ee4", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8da8ba369ef7cdb7cb07536658169ee4");
        } else {
            this.b = cVar;
        }
    }

    @Override // com.squareup.okhttp.t
    public final z intercept(t.a aVar) throws IOException {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c01434eaa03fe233e4fc0c6ceb0fb53e", RobustBitConfig.DEFAULT_VALUE)) {
            return (z) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c01434eaa03fe233e4fc0c6ceb0fb53e");
        }
        x a2 = aVar.a();
        this.b.a(a2.a.toString());
        return aVar.a(a2);
    }
}
