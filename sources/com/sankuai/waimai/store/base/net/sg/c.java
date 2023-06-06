package com.sankuai.waimai.store.base.net.sg;

import android.support.annotation.NonNull;
import com.dianping.titans.js.jshandler.GetAppInfoJsHandler;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.t;
import com.sankuai.waimai.store.config.k;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class c {
    public static ChangeQuickRedirect a;
    private static c b;

    public static c a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c977ba79fb1812af6b18b09804ea9957", RobustBitConfig.DEFAULT_VALUE)) {
            return (c) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c977ba79fb1812af6b18b09804ea9957");
        }
        if (b == null) {
            synchronized (c.class) {
                if (b == null) {
                    b = new c();
                }
            }
        }
        return b;
    }

    @NonNull
    public final String b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "deae3bb521e9820f7a269b34ff684bb6", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "deae3bb521e9820f7a269b34ff684bb6");
        }
        if (k.b()) {
            return "prod";
        }
        com.sankuai.waimai.store.util.b.a();
        String lowerCase = "".toLowerCase();
        if (lowerCase.contains("prod")) {
            return "prod";
        }
        if (lowerCase.contains("stage")) {
            return "st";
        }
        if (lowerCase.contains("test")) {
            return "qa";
        }
        if (lowerCase.contains("beta")) {
            return "beta";
        }
        if (lowerCase.contains(GetAppInfoJsHandler.PACKAGE_TYPE_DEV)) {
            return GetAppInfoJsHandler.PACKAGE_TYPE_DEV;
        }
        String a2 = com.sankuai.meituan.switchtestenv.a.a(com.sankuai.waimai.store.util.b.a(), "http://scapi.waimai.meituan.com");
        return (t.a(a2) || !a2.contains(".st.")) ? "prod" : "st";
    }
}
