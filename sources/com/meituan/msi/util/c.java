package com.meituan.msi.util;

import android.content.BroadcastReceiver;
import android.content.Context;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class c {
    public static ChangeQuickRedirect a;

    public static void a(Context context, BroadcastReceiver broadcastReceiver) {
        Object[] objArr = {context, broadcastReceiver};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "cf5a9c5ff58e406b331d075b77f0834b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "cf5a9c5ff58e406b331d075b77f0834b");
        } else if (context == null) {
        } else {
            try {
                context.unregisterReceiver(broadcastReceiver);
            } catch (IllegalArgumentException e) {
                e.printStackTrace();
                com.meituan.msi.log.a.a(ae.a("broadcast", e));
            }
        }
    }
}
