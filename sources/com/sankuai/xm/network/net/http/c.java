package com.sankuai.xm.network.net.http;

import android.content.Context;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class c extends com.sankuai.xm.network.net.b {
    public static ChangeQuickRedirect e;

    @Override // com.sankuai.xm.network.net.b
    public final void cancel() {
    }

    @Override // com.sankuai.xm.network.net.b
    public final void a(Context context, com.sankuai.xm.network.net.config.a aVar) {
        Object[] objArr = {context, aVar};
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0f49bafc9abfabffccc6e7e6ee40cb14", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0f49bafc9abfabffccc6e7e6ee40cb14");
        } else {
            com.sankuai.xm.network.b.b("HttpClient::init", new Object[0]);
        }
    }

    @Override // com.sankuai.xm.network.net.b
    public final com.sankuai.xm.network.net.a a(com.sankuai.xm.network.net.d dVar) {
        Object[] objArr = {dVar};
        ChangeQuickRedirect changeQuickRedirect = e;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "158a57cbdbd785af74f111a678cb2937", 6917529027641081856L) ? (com.sankuai.xm.network.net.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "158a57cbdbd785af74f111a678cb2937") : new a(this, dVar);
    }
}
