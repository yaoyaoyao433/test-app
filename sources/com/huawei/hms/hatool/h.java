package com.huawei.hms.hatool;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.meituan.android.common.locate.model.MTCellInfo;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class h {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static String a(int i, String str) {
        switch (i) {
            case 1:
            case 2:
            case 4:
            case 7:
            case 11:
                return "2G";
            case 3:
            case 5:
            case 6:
            case 8:
            case 9:
            case 10:
            case 12:
            case 14:
            case 15:
                break;
            case 13:
                return "4G";
            default:
                if (!str.equalsIgnoreCase(MTCellInfo.TYPE_TDSCDMA) && !str.equalsIgnoreCase(MTCellInfo.TYPE_WCDMA) && !str.equalsIgnoreCase("CDMA2000")) {
                    return str;
                }
                break;
        }
        return "3G";
    }

    public static String a(Context context) {
        NetworkInfo activeNetworkInfo;
        String str;
        String str2;
        if (context == null || com.sankuai.meituan.takeoutnew.util.aop.f.a(context.getPackageManager(), "android.permission.ACCESS_NETWORK_STATE", context.getPackageName()) != 0) {
            y.f("hmsSdk", "not have network state phone permission!");
            return "";
        }
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        if (connectivityManager == null || (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) == null || !activeNetworkInfo.isConnected()) {
            return "";
        }
        if (activeNetworkInfo.getType() == 1) {
            return "WIFI";
        }
        if (activeNetworkInfo.getType() == 0) {
            String subtypeName = activeNetworkInfo.getSubtypeName();
            y.c("hmsSdk", "Network getSubtypeName : " + subtypeName);
            return a(activeNetworkInfo.getSubtype(), subtypeName);
        } else if (activeNetworkInfo.getType() == 16) {
            y.f("hmsSdk", "type name = COMPANION_PROXY");
            return "COMPANION_PROXY";
        } else {
            if (activeNetworkInfo.getType() == 9) {
                str = "ETHERNET";
                str2 = "type name = ETHERNET";
            } else {
                str = "OTHER_NETWORK_TYPE";
                str2 = "type name = " + activeNetworkInfo.getType();
            }
            y.c("hmsSdk", str2);
            return str;
        }
    }
}
