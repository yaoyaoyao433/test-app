package com.meituan.android.common.locate.reporter;

import android.content.Context;
import android.content.SharedPreferences;
import com.meituan.android.common.locate.util.LogUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import okhttp3.OkHttpClient;
/* loaded from: classes2.dex */
public class m {
    private static String a = "LocationInfoReporter ";
    private static OkHttpClient b;
    public static ChangeQuickRedirect changeQuickRedirect;
    private final Context c;

    public m(Context context, OkHttpClient okHttpClient) {
        Object[] objArr = {context, okHttpClient};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2566ded143a1459f69b6025c20b750e6", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2566ded143a1459f69b6025c20b750e6");
            return;
        }
        this.c = context;
        b = okHttpClient;
    }

    public static OkHttpClient a() {
        return b;
    }

    public static synchronized boolean a(Context context) {
        synchronized (m.class) {
            Object[] objArr = {context};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "1f6c82ecf20f8985e29b201d70f96d95", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "1f6c82ecf20f8985e29b201d70f96d95")).booleanValue();
            } else if (context == null) {
                LogUtils.a(a + "setReportEnable context null");
                return false;
            } else {
                SharedPreferences b2 = f.b();
                if (b2 == null) {
                    LogUtils.a(a + "getReportEnable sharedPreferences null");
                    return false;
                }
                boolean z = b2.getBoolean("isUserAgrees", true);
                LogUtils.a(a + "getReportEnable the " + z);
                return z;
            }
        }
    }

    public void b(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ec6c69994ba1609acf6a3410c2db54a8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ec6c69994ba1609acf6a3410c2db54a8");
            return;
        }
        try {
            d a2 = d.a(context);
            if (a2 == null) {
                return;
            }
            LogUtils.a(a + "startCollectForground");
            a2.b(context);
        } catch (Exception e) {
            LogUtils.a(m.class, e);
        }
    }

    public void c(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5b521a24aa7f521adb2c56e06e357d76", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5b521a24aa7f521adb2c56e06e357d76");
            return;
        }
        try {
            d a2 = d.a(context);
            if (a2 == null) {
                return;
            }
            LogUtils.a(a + "stopCollectForground");
            a2.b();
        } catch (Exception e) {
            LogUtils.a(m.class, e);
        }
    }
}
