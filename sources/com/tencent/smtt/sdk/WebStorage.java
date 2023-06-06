package com.tencent.smtt.sdk;

import java.util.Map;
/* loaded from: classes6.dex */
public class WebStorage {
    private static WebStorage a;

    @Deprecated
    /* loaded from: classes6.dex */
    public interface QuotaUpdater {
        void updateQuota(long j);
    }

    private static synchronized WebStorage a() {
        WebStorage webStorage;
        synchronized (WebStorage.class) {
            if (a == null) {
                a = new WebStorage();
            }
            webStorage = a;
        }
        return webStorage;
    }

    public static WebStorage getInstance() {
        return a();
    }

    public void deleteAllData() {
        x a2 = x.a();
        if (a2 == null || !a2.b()) {
            android.webkit.WebStorage.getInstance().deleteAllData();
        } else {
            a2.c().n();
        }
    }

    public void deleteOrigin(String str) {
        x a2 = x.a();
        if (a2 == null || !a2.b()) {
            android.webkit.WebStorage.getInstance().deleteOrigin(str);
        } else {
            a2.c().e(str);
        }
    }

    public void getOrigins(ValueCallback<Map> valueCallback) {
        x a2 = x.a();
        if (a2 == null || !a2.b()) {
            android.webkit.WebStorage.getInstance().getOrigins(valueCallback);
        } else {
            a2.c().a(valueCallback);
        }
    }

    public void getQuotaForOrigin(String str, ValueCallback<Long> valueCallback) {
        x a2 = x.a();
        if (a2 == null || !a2.b()) {
            android.webkit.WebStorage.getInstance().getQuotaForOrigin(str, valueCallback);
        } else {
            a2.c().b(str, valueCallback);
        }
    }

    public void getUsageForOrigin(String str, ValueCallback<Long> valueCallback) {
        x a2 = x.a();
        if (a2 == null || !a2.b()) {
            android.webkit.WebStorage.getInstance().getUsageForOrigin(str, valueCallback);
        } else {
            a2.c().a(str, valueCallback);
        }
    }

    @Deprecated
    public void setQuotaForOrigin(String str, long j) {
        x a2 = x.a();
        if (a2 == null || !a2.b()) {
            android.webkit.WebStorage.getInstance().setQuotaForOrigin(str, j);
        } else {
            a2.c().a(str, j);
        }
    }
}
