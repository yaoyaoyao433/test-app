package com.sankuai.titans.offline.debug.adapter;

import com.meituan.robust.ChangeQuickRedirect;
import com.sankuai.meituan.serviceloader.b;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class OfflineDebugManager {
    public static ChangeQuickRedirect changeQuickRedirect;
    private static IOfflineDebug sOfflineDebug;

    static {
        List a = b.a(IOfflineDebug.class, null, new Object[0]);
        if (a == null || a.size() <= 0) {
            return;
        }
        sOfflineDebug = (IOfflineDebug) a.get(0);
    }

    public static IOfflineDebug getOfflineDebug() {
        return sOfflineDebug;
    }
}
