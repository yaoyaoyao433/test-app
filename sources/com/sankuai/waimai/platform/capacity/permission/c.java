package com.sankuai.waimai.platform.capacity.permission;

import android.text.TextUtils;
import com.meituan.android.cipstorage.q;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.HashMap;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class c {
    public static ChangeQuickRedirect a;
    public static HashMap<String, Long> b;
    public q c;
    private final String d;

    public c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9a81459f93ddd30da5a7e34aa9881b0a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9a81459f93ddd30da5a7e34aa9881b0a");
            return;
        }
        this.d = "wm_permission_config_file";
        this.c = q.a(com.meituan.android.singleton.b.a, "wm_permission_config_file", 1);
        b = new HashMap<>();
    }

    public static c a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "2079e8e65d37b25678f9ebd12c5c6be7", RobustBitConfig.DEFAULT_VALUE) ? (c) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "2079e8e65d37b25678f9ebd12c5c6be7") : a.a;
    }

    public static String a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "0ba2b2a34286ed8359df8b6cb5d5a563", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "0ba2b2a34286ed8359df8b6cb5d5a563");
        }
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        return str + "_declined_timestamp";
    }

    public final void a(String str, Long l) {
        Object[] objArr = {str, l};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7e8002598fb0f6140a8101de5acc9b6c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7e8002598fb0f6140a8101de5acc9b6c");
        } else {
            b.put(str, l);
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    static class a {
        private static c a = new c();
    }
}
