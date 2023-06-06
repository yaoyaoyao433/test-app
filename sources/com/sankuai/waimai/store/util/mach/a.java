package com.sankuai.waimai.store.util.mach;

import android.support.annotation.Nullable;
import android.util.Pair;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.environment.b;
import com.sankuai.shangou.stone.util.t;
import com.sankuai.waimai.store.util.monitor.c;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a {
    public static ChangeQuickRedirect a;

    public static void a(SGCommonMachReportInfo sGCommonMachReportInfo) {
        Object[] objArr = {sGCommonMachReportInfo};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "087f378895b15f430355cae84723b86c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "087f378895b15f430355cae84723b86c");
            return;
        }
        Pair<String, String> b = b(sGCommonMachReportInfo);
        if (a(b) && a()) {
            throw new IllegalArgumentException("不要上报空数据！！！");
        }
        c.a(new SGCommonMachReportConfig(sGCommonMachReportInfo.b), (String) b.first, (String) b.second);
    }

    private static boolean a(Pair<String, String> pair) {
        Object[] objArr = {pair};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "99738f3de4232591cc9c12e3119dc351", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "99738f3de4232591cc9c12e3119dc351")).booleanValue() : pair == null || (t.a((String) pair.first) && t.a((String) pair.second));
    }

    public static boolean a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "83add09064d85d9734642e15c02d1363", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "83add09064d85d9734642e15c02d1363")).booleanValue() : b.c.DEVELOP.equals(com.sankuai.shangou.stone.util.environment.a.a());
    }

    @Nullable
    private static Pair<String, String> b(SGCommonMachReportInfo sGCommonMachReportInfo) {
        Object[] objArr = {sGCommonMachReportInfo};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "7b1db5ecf8ba2dd3f6262b327dfb8a11", RobustBitConfig.DEFAULT_VALUE)) {
            return (Pair) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "7b1db5ecf8ba2dd3f6262b327dfb8a11");
        }
        if (sGCommonMachReportInfo == null) {
            return null;
        }
        return Pair.create(sGCommonMachReportInfo.a(), sGCommonMachReportInfo.b());
    }
}
