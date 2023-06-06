package com.sankuai.waimai.launcher.util.image;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.squareup.okhttp.s;
import com.squareup.okhttp.t;
import com.squareup.okhttp.x;
import com.squareup.okhttp.z;
import java.io.IOException;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class b implements t {
    public static ChangeQuickRedirect a;
    private final Map<String, String> b;

    public b(Map<String, String> map) {
        Object[] objArr = {map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "191283aefc8c404ff994cdc9f532149d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "191283aefc8c404ff994cdc9f532149d");
        } else {
            this.b = map;
        }
    }

    @Override // com.squareup.okhttp.t
    public final z intercept(t.a aVar) throws IOException {
        String str;
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c82a833aacf9fa094f5087c1f9667b81", RobustBitConfig.DEFAULT_VALUE)) {
            return (z) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c82a833aacf9fa094f5087c1f9667b81");
        }
        x a2 = aVar.a();
        s sVar = a2.a;
        if (sVar != null && (str = this.b.get(sVar.b)) != null && str.endsWith(".meituan.net")) {
            a2 = a2.f().a(sVar.i().b(str).b()).a();
        }
        return aVar.a(a2);
    }
}
