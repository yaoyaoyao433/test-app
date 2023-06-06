package com.sankuai.waimai.store.config;

import com.meituan.passport.api.AbsApiFactory;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.util.v;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class f extends HashMap<String, Object> {
    public static ChangeQuickRedirect a;

    public static Map<String, Object> a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e1af6e2092153c261080cf73a4a27e12", RobustBitConfig.DEFAULT_VALUE) ? (Map) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e1af6e2092153c261080cf73a4a27e12") : new f();
    }

    public f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "eec86dd16d8b36ce47bb01b9d4eee4cd", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "eec86dd16d8b36ce47bb01b9d4eee4cd");
            return;
        }
        put("uuid", com.sankuai.waimai.store.manager.appinfo.a.a());
        put("appName", v.b ? "waimai" : v.c ? "imeituan" : "DPScope");
        put("appVersionCode", Integer.valueOf(com.sankuai.waimai.store.manager.appinfo.a.b()));
        put("platform", "android");
        put("type", v.b ? "waimai" : AbsApiFactory.PASSPORT_ONLINE_URL);
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.waimai.store.manager.appinfo.a.a;
        put("channel", PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "7ffa7d74ca8b0e052f8d35cc0bb4630c", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "7ffa7d74ca8b0e052f8d35cc0bb4630c") : com.sankuai.waimai.foundation.core.common.a.a().d());
        put("env", k.a() ? "debug" : "release");
        put("apiEnv", com.sankuai.waimai.store.base.net.sg.c.a().b());
        put("environment", com.sankuai.waimai.store.base.net.sg.c.a().b());
    }
}
