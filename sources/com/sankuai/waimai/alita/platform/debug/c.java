package com.sankuai.waimai.alita.platform.debug;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class c implements e {
    public static ChangeQuickRedirect a = null;
    public static String b = "DebugSettingDefaultImpl";
    private static volatile c c;

    @Override // com.sankuai.waimai.alita.platform.debug.e
    public final boolean a() {
        return true;
    }

    @Override // com.sankuai.waimai.alita.platform.debug.e
    public final boolean b() {
        return false;
    }

    @Override // com.sankuai.waimai.alita.platform.debug.e
    public final boolean c() {
        return true;
    }

    @Override // com.sankuai.waimai.alita.platform.debug.e
    public final boolean d() {
        return false;
    }

    public static synchronized c e() {
        synchronized (c.class) {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "235df9f1bb6a7df2f55240d8cf74c98b", RobustBitConfig.DEFAULT_VALUE)) {
                return (c) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "235df9f1bb6a7df2f55240d8cf74c98b");
            }
            if (c == null) {
                c = new c();
            }
            return c;
        }
    }
}
