package com.tencent.open.b;

import android.content.Context;
import android.database.Cursor;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import com.meituan.metrics.traffic.report.NetLogConstants;
import com.sankuai.common.utils.APNMatchTools;
import com.tencent.open.log.SLog;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class a {
    protected static final Uri a = Uri.parse("content://telephony/carriers/preferapn");

    public static String b(Context context) {
        return "";
    }

    public static String a(Context context) {
        int d = d(context);
        if (d == 2) {
            return "wifi";
        }
        if (d == 1) {
            return APNMatchTools.APNNet.CMWAP;
        }
        if (d == 4) {
            return APNMatchTools.APNNet.CMNET;
        }
        if (d == 16) {
            return APNMatchTools.APNNet.UNIWAP;
        }
        if (d == 8) {
            return APNMatchTools.APNNet.UNINET;
        }
        if (d == 64) {
            return "wap";
        }
        if (d == 32) {
            return "net";
        }
        if (d == 512) {
            return APNMatchTools.APNNet.CTWAP;
        }
        if (d == 256) {
            return APNMatchTools.APNNet.CTNET;
        }
        if (d == 2048) {
            return APNMatchTools.APNNet.GNET_3;
        }
        if (d == 1024) {
            return APNMatchTools.APNNet.GWAP_3;
        }
        String b = b(context);
        return (b == null || b.length() == 0) ? "none" : b;
    }

    public static String c(Context context) {
        try {
            Cursor query = context.getContentResolver().query(a, null, null, null, null);
            if (query == null) {
                return null;
            }
            query.moveToFirst();
            if (query.isAfterLast()) {
                if (query != null) {
                    query.close();
                }
                return null;
            }
            String string = query.getString(query.getColumnIndex(NetLogConstants.Details.PROXY));
            if (query != null) {
                query.close();
            }
            return string;
        } catch (SecurityException e) {
            SLog.e("openSDK_LOG.APNUtil", "getApnProxy has exception: " + e.getMessage());
            return "";
        }
    }

    public static int d(Context context) {
        ConnectivityManager connectivityManager;
        NetworkInfo activeNetworkInfo;
        try {
            connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        } catch (Exception e) {
            SLog.e("openSDK_LOG.APNUtil", "getMProxyType has exception: " + e.getMessage());
        }
        if (connectivityManager == null || (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) == null) {
            return 128;
        }
        if (activeNetworkInfo.getTypeName().toUpperCase().equals("WIFI")) {
            return 2;
        }
        String lowerCase = activeNetworkInfo.getExtraInfo().toLowerCase();
        if (lowerCase.startsWith(APNMatchTools.APNNet.CMWAP)) {
            return 1;
        }
        if (!lowerCase.startsWith(APNMatchTools.APNNet.CMNET) && !lowerCase.startsWith("epc.tmobile.com")) {
            if (lowerCase.startsWith(APNMatchTools.APNNet.UNIWAP)) {
                return 16;
            }
            if (lowerCase.startsWith(APNMatchTools.APNNet.UNINET)) {
                return 8;
            }
            if (lowerCase.startsWith("wap")) {
                return 64;
            }
            if (lowerCase.startsWith("net")) {
                return 32;
            }
            if (lowerCase.startsWith(APNMatchTools.APNNet.CTWAP)) {
                return 512;
            }
            if (lowerCase.startsWith(APNMatchTools.APNNet.CTNET)) {
                return 256;
            }
            if (lowerCase.startsWith(APNMatchTools.APNNet.GWAP_3)) {
                return 1024;
            }
            if (lowerCase.startsWith(APNMatchTools.APNNet.GNET_3)) {
                return 2048;
            }
            if (lowerCase.startsWith("#777")) {
                String c = c(context);
                if (c != null) {
                    if (c.length() > 0) {
                        return 512;
                    }
                }
                return 256;
            }
            return 128;
        }
        return 4;
    }

    public static String e(Context context) {
        NetworkInfo activeNetworkInfo;
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        return (connectivityManager == null || (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) == null) ? "MOBILE" : activeNetworkInfo.getTypeName();
    }
}
