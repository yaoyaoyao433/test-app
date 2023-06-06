package com.sankuai.waimai.monitor.utils;

import android.content.Context;
import android.content.IntentFilter;
import android.media.AudioManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Proxy;
import android.text.TextUtils;
import android.text.format.DateFormat;
import com.meituan.android.privacy.interfaces.Privacy;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Calendar;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a {
    public static ChangeQuickRedirect a;

    public static boolean a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "dcd26962c0f44ac47cec9373fe5ac548", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "dcd26962c0f44ac47cec9373fe5ac548")).booleanValue();
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
            th.printStackTrace();
            return false;
        }
    }

    public static int b(Context context) {
        int type;
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ba0119c103282bbabe9a22f0f2d0edda", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ba0119c103282bbabe9a22f0f2d0edda")).intValue();
        }
        if (a(context)) {
            try {
                type = ((ConnectivityManager) context.getApplicationContext().getSystemService("connectivity")).getActiveNetworkInfo().getType();
            } catch (Throwable th) {
                th.printStackTrace();
            }
            if (type == 1) {
                return 0;
            }
            if (type == 0) {
                if (TextUtils.isEmpty(Proxy.getDefaultHost())) {
                    int networkType = Privacy.createTelephonyManager(context, "dj-cfdc7b9dfb4da1d3").getNetworkType();
                    Object[] objArr2 = {Integer.valueOf(networkType)};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "e08d2bae4f4362f6ddf35c952e976128", RobustBitConfig.DEFAULT_VALUE)) {
                        return ((Integer) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "e08d2bae4f4362f6ddf35c952e976128")).intValue();
                    }
                    switch (networkType) {
                        case 1:
                        case 2:
                        case 4:
                        case 7:
                        case 11:
                        case 16:
                            return 2;
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
                            return 3;
                        case 13:
                        case 18:
                        case 19:
                            return 4;
                        default:
                            return -2;
                    }
                }
                return 1;
            }
            return -2;
        }
        return -1;
    }

    public static String c(Context context) {
        boolean z = true;
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "2e93f580a9fe5726a97158609dc40a4a", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "2e93f580a9fe5726a97158609dc40a4a");
        }
        if (context != null) {
            int a2 = com.sankuai.waimai.platform.utils.f.a(context.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED")), "status", -1);
            if (a2 != 2 && a2 != 5) {
                z = false;
            }
            return z ? "charging" : "discharging";
        }
        return "unknown";
    }

    public static String d(Context context) {
        int i;
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "5a4afe48206c7628acbd99581c69b96c", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "5a4afe48206c7628acbd99581c69b96c");
        }
        if (context != null) {
            try {
                i = ((AudioManager) context.getSystemService("audio")).getRingerMode();
            } catch (Exception unused) {
                i = -1;
            }
            switch (i) {
                case 0:
                    return "silent";
                case 1:
                    return "vibrate";
                case 2:
                    return "normal";
                default:
                    return "unknown";
            }
        }
        return "unknown";
    }

    public static int e(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e1cd3892fb9f0c3139e5b192428a8310", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e1cd3892fb9f0c3139e5b192428a8310")).intValue();
        }
        Calendar calendar = Calendar.getInstance();
        if (context != null && DateFormat.is24HourFormat(context)) {
            return calendar.get(11);
        }
        int i = calendar.get(10);
        if (i == 0) {
            return 12;
        }
        return i;
    }

    public static int a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d3887b95fc3efde9ae9c07bb9e9a7305", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d3887b95fc3efde9ae9c07bb9e9a7305")).intValue() : Calendar.getInstance().get(12);
    }
}
