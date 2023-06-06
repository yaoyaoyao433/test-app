package com.sankuai.xm.network.systemhttp;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.xm.network.http.c;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class b implements c {
    public static ChangeQuickRedirect a;

    @Override // com.sankuai.xm.network.http.c
    public final com.sankuai.xm.network.http.b a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "903058e193c8e2131fe3ed36e2296d25", 6917529027641081856L)) {
            return (com.sankuai.xm.network.http.b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "903058e193c8e2131fe3ed36e2296d25");
        }
        try {
            a aVar = new a();
            aVar.a(str);
            return aVar;
        } catch (Exception e) {
            com.sankuai.xm.log.a.a(e);
            return null;
        }
    }
}
