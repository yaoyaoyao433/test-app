package com.sankuai.waimai.platform.net.interceptor.okhttp;

import android.net.Uri;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.squareup.okhttp.aa;
import com.squareup.okhttp.t;
import com.squareup.okhttp.u;
import com.squareup.okhttp.x;
import com.squareup.okhttp.y;
import com.squareup.okhttp.z;
import java.io.IOException;
import java.nio.charset.Charset;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class g extends com.sankuai.waimai.platform.capacity.log.g implements t {
    public static ChangeQuickRedirect b;

    @Override // com.squareup.okhttp.t
    public final z intercept(t.a aVar) throws IOException {
        Charset forName;
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "95edf88cf67ddd85ca7bf362f3a0a513", RobustBitConfig.DEFAULT_VALUE)) {
            return (z) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "95edf88cf67ddd85ca7bf362f3a0a513");
        }
        Object[] objArr2 = {aVar};
        ChangeQuickRedirect changeQuickRedirect2 = b;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "8851a61fb46a8a1c95ba03529cb09080", RobustBitConfig.DEFAULT_VALUE)) {
            return (z) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "8851a61fb46a8a1c95ba03529cb09080");
        }
        x a = aVar.a();
        z a2 = aVar.a(a);
        if (a(a.a.toString())) {
            String a3 = a(a);
            aa aaVar = a2.g;
            String str = null;
            byte[] e = aaVar != null ? aaVar.e() : null;
            if (e != null) {
                u a4 = aaVar.a();
                if (a4 != null) {
                    forName = a4.a(Charset.forName("UTF-8"));
                } else {
                    forName = Charset.forName("UTF-8");
                }
                str = com.sankuai.waimai.platform.net.util.c.a(e, forName, a2.a("Content-Encoding", null));
            }
            a(a.a.toString(), a3, a2.c, str);
            if (e == null) {
                return a2;
            }
            z.a g = a2.g();
            g.g = aa.a(a2.g.a(), e);
            return g.a();
        }
        return a2;
    }

    private String a(x xVar) {
        y yVar;
        Object[] objArr = {xVar};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4b9a9a7cfc0cb5c37f6f0971de8661cc", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4b9a9a7cfc0cb5c37f6f0971de8661cc");
        }
        try {
            if ("POST".equalsIgnoreCase(xVar.b) && (yVar = xVar.d) != null && yVar.contentLength() > 0) {
                okio.c cVar = new okio.c();
                yVar.writeTo(cVar);
                return Uri.decode(cVar.p());
            }
            return null;
        } catch (IOException e) {
            com.sankuai.waimai.foundation.utils.log.a.a(e);
        }
        return null;
    }
}
