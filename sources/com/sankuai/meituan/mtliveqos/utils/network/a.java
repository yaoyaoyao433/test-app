package com.sankuai.meituan.mtliveqos.utils.network;

import android.annotation.SuppressLint;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.util.Log;
import com.meituan.android.privacy.interfaces.MtTelephonyManager;
import com.meituan.android.privacy.interfaces.Privacy;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.mtliveqos.common.c;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class a {
    public static ChangeQuickRedirect a;

    @SuppressLint({"MissingPermission"})
    public static int a(Context context) {
        int type;
        int i;
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "86adc532001b6f6c4e0e96b6e45b4767", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "86adc532001b6f6c4e0e96b6e45b4767")).intValue();
        }
        if (b(context)) {
            try {
                type = ((ConnectivityManager) context.getApplicationContext().getSystemService("connectivity")).getActiveNetworkInfo().getType();
            } catch (Throwable th) {
                Log.e("MtLiveQosNetState", "getNetworkType: ", th);
            }
            if (type == 1) {
                return c.e.NETWORK_WIFI.k;
            }
            if (type == 0) {
                MtTelephonyManager createTelephonyManager = Privacy.createTelephonyManager(context, "MTLiveQosLibrary");
                if (createTelephonyManager != null) {
                    i = createTelephonyManager.getNetworkType();
                } else {
                    i = c.e.NETWORK_UNKNOWN.k;
                }
                Object[] objArr2 = {Integer.valueOf(i)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "38434d37d4df3b5027aa61ead41c0c8d", RobustBitConfig.DEFAULT_VALUE)) {
                    return ((Integer) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "38434d37d4df3b5027aa61ead41c0c8d")).intValue();
                }
                switch (i) {
                    case 0:
                        return c.e.NETWORK_UNKNOWN.k;
                    case 1:
                    case 2:
                    case 4:
                    case 7:
                    case 11:
                    case 16:
                        return c.e.NETWORK_2G.k;
                    case 3:
                    case 5:
                    case 6:
                    case 8:
                    case 9:
                    case 10:
                    case 12:
                    case 14:
                    case 15:
                    case 17:
                        return c.e.NETWORK_3G.k;
                    case 13:
                    case 18:
                    case 19:
                        return c.e.NETWORK_4G.k;
                    case 20:
                        return c.e.NETWORK_5G.k;
                    default:
                        return c.e.NETWORK_UNKNOWN.k;
                }
            }
            return c.e.NETWORK_UNKNOWN.k;
        }
        return c.e.NETWORK_UNAVAILABLE.k;
    }

    @SuppressLint({"MissingPermission"})
    private static boolean b(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "0e64a335950499d82768609f99985d3d", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "0e64a335950499d82768609f99985d3d")).booleanValue();
        }
        try {
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getApplicationContext().getSystemService("connectivity")).getActiveNetworkInfo();
            if (activeNetworkInfo != null) {
                if (activeNetworkInfo.isConnected()) {
                    return true;
                }
            }
            return false;
        } catch (Throwable th) {
            Log.e("MtLiveQosNetState", "isNetworkConnected: ", th);
            return false;
        }
    }
}
