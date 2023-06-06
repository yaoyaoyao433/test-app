package com.huawei.updatesdk.a.a.d.i;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class a {
    private static ConnectivityManager a;

    public static int a(NetworkInfo networkInfo) {
        if (networkInfo != null && networkInfo.isConnected()) {
            int type = networkInfo.getType();
            if (1 == type || 13 == type) {
                return 1;
            }
            if (type == 0) {
                switch (networkInfo.getSubtype()) {
                    case 1:
                    case 2:
                    case 4:
                    case 7:
                    case 11:
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
                        return 3;
                    case 13:
                        return 4;
                }
            }
        }
        return 0;
    }

    public static NetworkInfo a(Context context) {
        ConnectivityManager b = b(context);
        if (b != null) {
            return b.getActiveNetworkInfo();
        }
        return null;
    }

    private static ConnectivityManager b(Context context) {
        if (a == null) {
            a = (ConnectivityManager) context.getApplicationContext().getSystemService("connectivity");
        }
        return a;
    }

    public static int c(Context context) {
        return a(a(context));
    }

    public static boolean d(Context context) {
        ConnectivityManager b;
        NetworkInfo activeNetworkInfo;
        return (context == null || (b = b(context)) == null || (activeNetworkInfo = b.getActiveNetworkInfo()) == null || !activeNetworkInfo.isConnected()) ? false : true;
    }
}
