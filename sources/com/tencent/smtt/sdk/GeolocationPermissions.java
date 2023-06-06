package com.tencent.smtt.sdk;

import java.util.Set;
/* loaded from: classes6.dex */
public class GeolocationPermissions {
    private static GeolocationPermissions a;

    private static synchronized GeolocationPermissions a() {
        GeolocationPermissions geolocationPermissions;
        synchronized (GeolocationPermissions.class) {
            if (a == null) {
                a = new GeolocationPermissions();
            }
            geolocationPermissions = a;
        }
        return geolocationPermissions;
    }

    public static GeolocationPermissions getInstance() {
        return a();
    }

    public void allow(String str) {
        x a2 = x.a();
        if (a2 == null || !a2.b()) {
            android.webkit.GeolocationPermissions.getInstance().allow(str);
        } else {
            a2.c().g(str);
        }
    }

    public void clear(String str) {
        x a2 = x.a();
        if (a2 == null || !a2.b()) {
            android.webkit.GeolocationPermissions.getInstance().clear(str);
        } else {
            a2.c().f(str);
        }
    }

    public void clearAll() {
        x a2 = x.a();
        if (a2 == null || !a2.b()) {
            android.webkit.GeolocationPermissions.getInstance().clearAll();
        } else {
            a2.c().o();
        }
    }

    public void getAllowed(String str, ValueCallback<Boolean> valueCallback) {
        x a2 = x.a();
        if (a2 == null || !a2.b()) {
            android.webkit.GeolocationPermissions.getInstance().getAllowed(str, valueCallback);
        } else {
            a2.c().c(str, valueCallback);
        }
    }

    public void getOrigins(ValueCallback<Set<String>> valueCallback) {
        x a2 = x.a();
        if (a2 == null || !a2.b()) {
            android.webkit.GeolocationPermissions.getInstance().getOrigins(valueCallback);
        } else {
            a2.c().b(valueCallback);
        }
    }
}
