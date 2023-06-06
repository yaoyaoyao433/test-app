package com.meituan.android.common.statistics.utils;

import android.content.Context;
import android.net.wifi.WifiInfo;
import android.text.TextUtils;
import com.meituan.android.privacy.interfaces.Privacy;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class NetworkUtils {
    public static ChangeQuickRedirect changeQuickRedirect;

    public static String mac(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "27a3b782e276e2a7dc1523daecd628aa", 6917529027641081856L) ? (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "27a3b782e276e2a7dc1523daecd628aa") : com.meituan.android.common.unionid.oneid.util.AppUtil.getWifiMac(context);
    }

    public static String getBSSID(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "b851c4046976b115d6c96348bb59a300", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "b851c4046976b115d6c96348bb59a300");
        }
        String str = "unknown";
        if (context == null) {
            return "unknown";
        }
        try {
            WifiInfo connectionInfo = Privacy.createWifiManager(context, "com.meituan.android.common.analyse").getConnectionInfo();
            if (connectionInfo != null && !TextUtils.isEmpty(connectionInfo.getBSSID())) {
                str = connectionInfo.getBSSID();
            }
        } catch (Throwable th) {
            LogUtil.log("statistics", "AppUtil - getAPN:" + th.getMessage());
        }
        return str == null ? "" : str;
    }
}
