package com.meituan.android.neohybrid.neo.report;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class c {
    public static ChangeQuickRedirect a;

    public static void a(String str, Map<String, Object> map) {
        Object[] objArr = {str, map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "dd3197a29ba5f74c28bd174844151fae", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "dd3197a29ba5f74c28bd174844151fae");
        } else {
            a(str, map, null);
        }
    }

    public static void a(String str, Map<String, Object> map, List<Float> list) {
        Object[] objArr = {str, map, list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f2f80fc044d4bfd3b7d37852b887cacb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f2f80fc044d4bfd3b7d37852b887cacb");
        } else {
            com.meituan.android.paybase.common.analyse.cat.a.a(str, map, list, "com.meituan.android.neohybrid.neo.report.NeoReportController");
        }
    }

    public static void a(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "acff6cd8d191b40f7fccbea0d1ff0851", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "acff6cd8d191b40f7fccbea0d1ff0851");
        } else {
            com.dianping.codelog.b.b(c.class, str, str2);
        }
    }
}
