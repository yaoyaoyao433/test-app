package com.sankuai.waimai.monitor.utils;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import org.apache.http.impl.client.DefaultHttpClient;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class d {
    public static ChangeQuickRedirect a = null;
    public static String b = "HttpClientProvider";
    private static d d;
    public DefaultHttpClient c;

    public d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6fa423ac6dbc8708d6b0742def5c6c70", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6fa423ac6dbc8708d6b0742def5c6c70");
        } else {
            this.c = null;
        }
    }

    public static d a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a7f5e60d39d5ae8b29a23be0c343a10f", RobustBitConfig.DEFAULT_VALUE)) {
            return (d) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a7f5e60d39d5ae8b29a23be0c343a10f");
        }
        if (d == null) {
            d = new d();
        }
        return d;
    }
}
