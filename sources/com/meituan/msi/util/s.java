package com.meituan.msi.util;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.TrafficStats;
import android.os.SystemClock;
import android.text.TextUtils;
import com.dianping.titans.utils.NetworkUtil;
import com.meituan.android.common.locate.loader.LocationStrategy;
import com.meituan.android.privacy.interfaces.Privacy;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class s {
    public static ChangeQuickRedirect a = null;
    public static String b = "unknown";
    private static NetworkInfo c = null;
    private static long d = 0;
    private static long e = 0;
    private static volatile boolean f = false;
    private static final BroadcastReceiver g = new BroadcastReceiver() { // from class: com.meituan.msi.util.NetWorkUtils$1
        public static ChangeQuickRedirect a;

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            Object[] objArr = {context, intent};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "363da35db572a152db6da93b11c5c440", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "363da35db572a152db6da93b11c5c440");
            } else {
                s.a(0L);
            }
        }
    };

    public static /* synthetic */ long a(long j) {
        e = 0L;
        return 0L;
    }

    public static String a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "4d0654ce1fa701e5727495e9480225ec", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "4d0654ce1fa701e5727495e9480225ec");
        }
        if (TextUtils.equals(b, "unknown")) {
            b = a(context, "pt-9f1ef3f5277a86db");
        }
        return b;
    }

    public static boolean b(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "0af8d6c0148f8fc56ee760834d3eb706", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "0af8d6c0148f8fc56ee760834d3eb706")).booleanValue();
        }
        try {
            context.getApplicationContext().getSystemService("connectivity");
            NetworkInfo c2 = c(context);
            if (c2 != null) {
                if (c2.isConnected()) {
                    return true;
                }
            }
            return false;
        } catch (Throwable th) {
            th.printStackTrace();
            return false;
        }
    }

    private static int b(Context context, String str) {
        int type;
        Object[] objArr = {context, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "48b668730c0063d3330f449111e52c7d", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "48b668730c0063d3330f449111e52c7d")).intValue();
        }
        if (b(context)) {
            try {
                context.getApplicationContext().getSystemService("connectivity");
                type = c(context).getType();
            } catch (Throwable th) {
                th.printStackTrace();
            }
            if (type == 1) {
                return 0;
            }
            if (type == 0) {
                int networkType = Privacy.createTelephonyManager(context.getApplicationContext(), str).getNetworkType();
                Object[] objArr2 = {Integer.valueOf(networkType)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "0a68d67ee686a8eb294c31c8d307de7d", RobustBitConfig.DEFAULT_VALUE)) {
                    return ((Integer) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "0a68d67ee686a8eb294c31c8d307de7d")).intValue();
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
                    case 20:
                        return 5;
                    default:
                        return -2;
                }
            }
            return -2;
        }
        return -1;
    }

    public static String a(Context context, String str) {
        Object[] objArr = {context, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c437ddfacd1ffdcc8d81a37c950dd8a8", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c437ddfacd1ffdcc8d81a37c950dd8a8");
        }
        switch (b(context, str)) {
            case -1:
                return "none";
            case 0:
                return "wifi";
            case 1:
            default:
                return "unknown";
            case 2:
                return "2g";
            case 3:
                return "3g";
            case 4:
                return "4g";
            case 5:
                return NetworkUtil.NAME_NETWORK_5G;
        }
    }

    public static int a(List<com.sankuai.meituan.retrofit2.q> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c55d14ee50a51c53f6dcc58c81ee480e", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c55d14ee50a51c53f6dcc58c81ee480e")).intValue();
        }
        if (list == null || list.size() == 0) {
            return 0;
        }
        StringBuilder sb = new StringBuilder();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            sb.append(list.get(i).a());
            sb.append(list.get(i).b());
        }
        return sb.toString().getBytes().length;
    }

    public static long a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f19a9202b6663fd0353ab57a58a66e7a", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Long) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f19a9202b6663fd0353ab57a58a66e7a")).longValue();
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (elapsedRealtime - e >= LocationStrategy.LOCATION_TIMEOUT) {
            e = elapsedRealtime;
            try {
                d = TrafficStats.getTotalRxBytes();
            } catch (RuntimeException unused) {
            }
        }
        return d;
    }

    private static NetworkInfo c(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f0e38c86dadb6d75aeba36163b3ce7b2", RobustBitConfig.DEFAULT_VALUE)) {
            return (NetworkInfo) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f0e38c86dadb6d75aeba36163b3ce7b2");
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (c == null || e == 0 || elapsedRealtime - e >= LocationStrategy.LOCATION_TIMEOUT) {
            try {
                c = ((ConnectivityManager) context.getApplicationContext().getSystemService("connectivity")).getActiveNetworkInfo();
                e = elapsedRealtime;
                if (!f) {
                    IntentFilter intentFilter = new IntentFilter();
                    intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
                    context.getApplicationContext().registerReceiver(g, intentFilter);
                    f = true;
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
        return c;
    }

    public static String a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "4e45ceb95754eb8495c8e65345ec5ce9", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "4e45ceb95754eb8495c8e65345ec5ce9");
        }
        try {
            return new URL(str).getHost();
        } catch (MalformedURLException e2) {
            e2.printStackTrace();
            return "";
        }
    }

    public static String b(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "83a743e07762f81e925bcb905fb6e7fc", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "83a743e07762f81e925bcb905fb6e7fc");
        }
        try {
            return new URL(str).getPath();
        } catch (MalformedURLException e2) {
            e2.printStackTrace();
            return "";
        }
    }
}
