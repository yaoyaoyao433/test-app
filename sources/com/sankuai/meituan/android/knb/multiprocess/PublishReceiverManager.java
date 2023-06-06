package com.sankuai.meituan.android.knb.multiprocess;

import android.content.Context;
import android.content.IntentFilter;
import com.dianping.titans.utils.Constants;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class PublishReceiverManager {
    public static ChangeQuickRedirect changeQuickRedirect;
    private static PublishReceiver receiver;

    public static boolean registerReceiver(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "dace20fcffaa91553317ff834604d600", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "dace20fcffaa91553317ff834604d600")).booleanValue();
        }
        try {
            if (KNBProcessUtil.useMultiProcess() && receiver == null && context != null) {
                receiver = new PublishReceiver();
                context.registerReceiver(receiver, new IntentFilter(Constants.MULTI_PROCESS_ACTION));
                return true;
            }
        } catch (Throwable unused) {
            receiver = null;
        }
        return false;
    }

    public static void unregisterReceiver(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "0454eff41e3e8aebcf6b3dc5180a6222", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "0454eff41e3e8aebcf6b3dc5180a6222");
        } else if (context == null || receiver == null) {
        } else {
            try {
                context.unregisterReceiver(receiver);
            } catch (Throwable unused) {
            }
            receiver = null;
        }
    }
}
