package com.meituan.android.common.statistics.utils;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.meituan.android.common.statistics.Constants;
import com.meituan.android.common.statistics.Statistics;
import com.meituan.android.common.statistics.StatisticsHandler;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class NetWorkConnectionChangedReceiver extends BroadcastReceiver {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        Object[] objArr = {context, intent};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e226d504012f19df8920a4ad424c3437", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e226d504012f19df8920a4ad424c3437");
        } else if (intent != null && "android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
            handleBroadcastReceiver(context);
        }
    }

    public void handleBroadcastReceiver(final Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a442db073881c5dbd0fb99eb7d663951", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a442db073881c5dbd0fb99eb7d663951");
        } else {
            StatisticsHandler.getInstance().commit(new Runnable() { // from class: com.meituan.android.common.statistics.utils.NetWorkConnectionChangedReceiver.1
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // java.lang.Runnable
                public void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "741979eb071f3622638a37f4e7b85c4f", 6917529027641081856L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "741979eb071f3622638a37f4e7b85c4f");
                        return;
                    }
                    String netWorkType = AppUtil.getNetWorkType(context);
                    Statistics.updateDefaultEnvironment("net", netWorkType);
                    if ("WIFI".equals(netWorkType)) {
                        Statistics.updateDefaultEnvironment(Constants.Environment.KEY_BSSID, NetworkUtils.getBSSID(context));
                        Statistics.updateDefaultEnvironment(Constants.Environment.KEY_APN, AppUtil.getAPN(context));
                    }
                    Statistics.updateDefaultEnvironment("wifi", AppUtil.getWifiState(context));
                }
            });
        }
    }
}
