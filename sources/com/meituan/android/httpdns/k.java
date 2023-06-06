package com.meituan.android.httpdns;

import android.content.Context;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class k {
    public static ChangeQuickRedirect a;
    static volatile IConfigInit b;
    private static volatile IDnsListener c;

    public static IDnsListener a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "38cf3adcc588bf13ee2fb2652cd0cb8b", 6917529027641081856L)) {
            return (IDnsListener) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "38cf3adcc588bf13ee2fb2652cd0cb8b");
        }
        if (c != null) {
            return c;
        }
        if (!com.sankuai.meituan.serviceloader.b.a()) {
            com.sankuai.meituan.serviceloader.b.a(context);
        }
        List a2 = com.sankuai.meituan.serviceloader.b.a(IDnsListener.class, "DnsListener");
        if (a2 == null || a2.size() <= 0) {
            return null;
        }
        return (IDnsListener) a2.get(0);
    }
}
