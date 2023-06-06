package com.sankuai.meituan.location.collector.utils;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import com.meituan.android.common.locate.util.LogUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* loaded from: classes4.dex */
public class a {
    public static ChangeQuickRedirect a;

    public static void a(Context context, BroadcastReceiver broadcastReceiver) {
        Object[] objArr = {context, broadcastReceiver};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "9509f3016c55094e39121c5c62ef60a7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "9509f3016c55094e39121c5c62ef60a7");
            return;
        }
        try {
            context.unregisterReceiver(broadcastReceiver);
            LogUtils.a("unregisterReceiver BroadcastUtils unInstallReceiver  ok");
        } catch (Throwable th) {
            LogUtils.a(a.class, th);
        }
    }

    public static void a(Context context, String str, BroadcastReceiver broadcastReceiver) {
        Object[] objArr = {context, str, broadcastReceiver};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "73523bb2151cdfd918327818daae3634", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "73523bb2151cdfd918327818daae3634");
            return;
        }
        try {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction(str);
            context.registerReceiver(broadcastReceiver, intentFilter);
            LogUtils.a("registerReceiver BroadcastUtils installReceiver " + str + " ok");
        } catch (Throwable th) {
            LogUtils.a(a.class, th);
        }
    }
}
