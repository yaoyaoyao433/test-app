package com.sankuai.waimai.store.downgrade;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a {
    public static ChangeQuickRedirect a;
    private static volatile a b;
    private final Map<String, DegradeConfigInfo> c;

    public a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b396c10bf7b3f709e2a65ba64c91fdad", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b396c10bf7b3f709e2a65ba64c91fdad");
        } else {
            this.c = new HashMap();
        }
    }

    public static a a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b20b1e108a0bf7172ce7057f355f25f7", RobustBitConfig.DEFAULT_VALUE)) {
            return (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b20b1e108a0bf7172ce7057f355f25f7");
        }
        if (b == null) {
            synchronized (com.sankuai.waimai.store.order.a.class) {
                if (b == null) {
                    b = new a();
                }
            }
        }
        return b;
    }
}
