package com.sankuai.waimai.store.util.monitor;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.util.monitor.monitor.IMonitor;
import com.sankuai.waimai.store.util.monitor.report.e;
import java.util.Map;
/* compiled from: ProGuard */
@Deprecated
/* loaded from: classes5.dex */
public final class c {
    public static ChangeQuickRedirect a;
    private static final com.sankuai.waimai.store.util.monitor.report.c b = new e();

    public static void a(IMonitor iMonitor, String str, String str2) {
        Object[] objArr = {iMonitor, str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e570f20d643e0e7e0f1c0071bf0094b1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e570f20d643e0e7e0f1c0071bf0094b1");
        } else {
            b.a(iMonitor, str, str2);
        }
    }

    public static void a(IMonitor iMonitor, String str, String str2, Map<String, String> map) {
        Object[] objArr = {iMonitor, str, str2, map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "fd9dad5c584aa86c79fde528d5575706", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "fd9dad5c584aa86c79fde528d5575706");
        } else {
            b.a(iMonitor, str, str2, map);
        }
    }

    public static void a(IMonitor iMonitor) {
        Object[] objArr = {iMonitor};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "7dfbfab8eff03a89073ef874bfc8399f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "7dfbfab8eff03a89073ef874bfc8399f");
        } else {
            b.d(iMonitor);
        }
    }

    public static void b(IMonitor iMonitor, String str, String str2) {
        Object[] objArr = {iMonitor, str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "53b159b0829182171ad890c4ab2971da", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "53b159b0829182171ad890c4ab2971da");
        } else {
            b.b(iMonitor, str, str2);
        }
    }

    public static void b(IMonitor iMonitor, String str, String str2, Map<String, String> map) {
        Object[] objArr = {iMonitor, str, str2, map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "1e77f57bc2d7d76e1a0b7f7fc9bf65fc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "1e77f57bc2d7d76e1a0b7f7fc9bf65fc");
        } else {
            b.b(iMonitor, str, str2, map);
        }
    }
}
