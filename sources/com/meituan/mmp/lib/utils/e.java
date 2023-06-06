package com.meituan.mmp.lib.utils;

import android.content.BroadcastReceiver;
import android.content.Context;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class e {
    public static ChangeQuickRedirect a;

    public static void a(Context context, BroadcastReceiver broadcastReceiver) {
        Object[] objArr = {context, broadcastReceiver};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e7887164f9a9f3d5b9b9a942720a7f4e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e7887164f9a9f3d5b9b9a942720a7f4e");
        } else if (context == null) {
            com.meituan.mmp.lib.trace.b.d("unregisterReceiverSafely: context is null");
        } else {
            try {
                context.unregisterReceiver(broadcastReceiver);
            } catch (IllegalArgumentException e) {
                com.meituan.mmp.lib.trace.b.a(e);
            }
        }
    }
}
