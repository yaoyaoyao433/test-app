package com.meituan.ai.speech.base.utils;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.support.annotation.Keep;
import android.telephony.TelephonyManager;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes2.dex */
public class NetworkUtils {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Keep
    public static int getAPNType(Context context) {
        NetworkInfo activeNetworkInfo;
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "c8f2a438b87693f1088eba1340966051", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "c8f2a438b87693f1088eba1340966051")).intValue();
        }
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        if (connectivityManager == null || (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) == null) {
            return 0;
        }
        int type = activeNetworkInfo.getType();
        if (type == 1) {
            return 1;
        }
        if (type != 0) {
            return type == 9 ? 5 : 0;
        }
        int subtype = activeNetworkInfo.getSubtype();
        TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
        if (subtype != 13 || telephonyManager == null || telephonyManager.isNetworkRoaming()) {
            if (subtype == 3 || subtype == 8 || !(subtype != 5 || telephonyManager == null || telephonyManager.isNetworkRoaming())) {
                return 3;
            }
            if (subtype == 1 || subtype == 2 || subtype != 4 || telephonyManager == null) {
                return 2;
            }
            telephonyManager.isNetworkRoaming();
            return 2;
        }
        return 4;
    }
}
