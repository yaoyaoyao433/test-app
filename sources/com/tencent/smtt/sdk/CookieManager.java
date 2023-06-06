package com.tencent.smtt.sdk;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.text.TextUtils;
import com.tencent.smtt.sdk.TbsListener;
import com.tencent.smtt.sdk.TbsLogReport;
import com.tencent.smtt.utils.TbsLog;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
/* loaded from: classes6.dex */
public class CookieManager {
    public static String LOGTAG = "CookieManager";
    private static CookieManager d;
    CopyOnWriteArrayList<b> a;
    String b;
    a c = a.MODE_NONE;
    private boolean e = false;
    private boolean f = false;

    /* loaded from: classes6.dex */
    public enum a {
        MODE_NONE,
        MODE_KEYS,
        MODE_ALL
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes6.dex */
    public class b {
        int a;
        String b;
        String c;
        ValueCallback<Boolean> d;

        b() {
        }
    }

    private CookieManager() {
    }

    public static CookieManager getInstance() {
        if (d == null) {
            synchronized (CookieManager.class) {
                if (d == null) {
                    d = new CookieManager();
                }
            }
        }
        return d;
    }

    public static int getROMCookieDBVersion(Context context) {
        String str;
        int i;
        if (Build.VERSION.SDK_INT >= 11) {
            str = "cookiedb_info";
            i = 4;
        } else {
            str = "cookiedb_info";
            i = 0;
        }
        return context.getSharedPreferences(str, i).getInt("db_version", -1);
    }

    public static void setROMCookieDBVersion(Context context, int i) {
        String str;
        int i2;
        if (Build.VERSION.SDK_INT >= 11) {
            str = "cookiedb_info";
            i2 = 4;
        } else {
            str = "cookiedb_info";
            i2 = 0;
        }
        SharedPreferences.Editor edit = context.getSharedPreferences(str, i2).edit();
        edit.putInt("db_version", i);
        edit.commit();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized void a() {
        this.f = true;
        if (this.a != null && this.a.size() != 0) {
            x a2 = x.a();
            if (a2 != null && a2.b()) {
                Iterator<b> it = this.a.iterator();
                while (it.hasNext()) {
                    b next = it.next();
                    switch (next.a) {
                        case 1:
                            setCookie(next.b, next.c, next.d);
                            break;
                        case 2:
                            setCookie(next.b, next.c);
                            break;
                    }
                }
            } else {
                Iterator<b> it2 = this.a.iterator();
                while (it2.hasNext()) {
                    b next2 = it2.next();
                    switch (next2.a) {
                        case 1:
                            if (Build.VERSION.SDK_INT < 21) {
                                break;
                            } else {
                                com.tencent.smtt.utils.i.a(android.webkit.CookieManager.getInstance(), "setCookie", new Class[]{String.class, String.class, android.webkit.ValueCallback.class}, next2.b, next2.c, next2.d);
                                break;
                            }
                        case 2:
                            android.webkit.CookieManager.getInstance().setCookie(next2.b, next2.c);
                            break;
                    }
                }
            }
            this.a.clear();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public synchronized void a(Context context, boolean z, boolean z2) {
        int i;
        int i2;
        if (this.c != a.MODE_NONE && context != null && TbsExtensionFunctionManager.getInstance().canUseFunction(context, TbsExtensionFunctionManager.COOKIE_SWITCH_FILE_NAME) && !this.e) {
            long currentTimeMillis = System.currentTimeMillis();
            long j = 0;
            String str = LOGTAG;
            TbsLog.i(str, "compatiableCookieDatabaseIfNeed,isX5Inited:" + z + ",useX5:" + z2);
            if (!z && !QbSdk.getIsSysWebViewForcedByOuter() && !QbSdk.a) {
                x.a().a(context);
                return;
            }
            boolean z3 = false;
            z2 = (QbSdk.getIsSysWebViewForcedByOuter() || QbSdk.a) ? false : false;
            boolean canUseFunction = TbsExtensionFunctionManager.getInstance().canUseFunction(context, TbsExtensionFunctionManager.USEX5_FILE_NAME);
            String str2 = LOGTAG;
            TbsLog.i(str2, "usex5 : mUseX5LastProcess->" + canUseFunction + ",useX5:" + z2);
            TbsExtensionFunctionManager.getInstance().setFunctionEnable(context, TbsExtensionFunctionManager.USEX5_FILE_NAME, z2);
            if (canUseFunction == z2) {
                return;
            }
            TbsLogReport.TbsLogInfo tbsLogInfo = TbsLogReport.getInstance(context).tbsLogInfo();
            if (TextUtils.isEmpty(this.b)) {
                tbsLogInfo.setErrorCode(701);
                i = 0;
                i2 = 0;
            } else if (p.a().j(context) > 0 && p.a().j(context) < 36001) {
                return;
            } else {
                if (canUseFunction) {
                    i = k.d(context);
                    if (i > 0) {
                        i2 = getROMCookieDBVersion(context);
                        if (i2 <= 0) {
                            z3 = true;
                        }
                    }
                    i2 = 0;
                } else {
                    i = k.d(context);
                    if (i > 0) {
                        String d2 = p.a().d(context, "cookies_database_version");
                        if (!TextUtils.isEmpty(d2)) {
                            try {
                                i2 = Integer.parseInt(d2);
                            } catch (Exception unused) {
                            }
                        }
                    }
                    i2 = 0;
                }
                if (!z3 && (i <= 0 || i2 <= 0)) {
                    tbsLogInfo.setErrorCode(702);
                } else if (i2 >= i) {
                    tbsLogInfo.setErrorCode(703);
                } else {
                    k.a(context, this.c, this.b, z3, z2);
                    tbsLogInfo.setErrorCode(TbsListener.ErrorCode.INFO_COOKIE_SWITCH_TRANSFER);
                    j = System.currentTimeMillis() - currentTimeMillis;
                }
            }
            tbsLogInfo.setFailDetail("x5->sys:" + canUseFunction + " from:" + i + " to:" + i2 + ",timeused:" + j);
            TbsLogReport.getInstance(context).eventReport(TbsLogReport.EventType.TYPE_COOKIE_DB_SWITCH, tbsLogInfo);
        }
    }

    public boolean acceptCookie() {
        x a2 = x.a();
        return (a2 == null || !a2.b()) ? android.webkit.CookieManager.getInstance().acceptCookie() : a2.c().d();
    }

    public synchronized boolean acceptThirdPartyCookies(WebView webView) {
        x a2 = x.a();
        if (a2 != null && a2.b()) {
            Object invokeStaticMethod = a2.c().b().invokeStaticMethod("com.tencent.tbs.tbsshell.WebCoreProxy", "cookieManager_acceptThirdPartyCookies", new Class[]{Object.class}, webView.getView());
            if (invokeStaticMethod != null) {
                return ((Boolean) invokeStaticMethod).booleanValue();
            }
            return true;
        } else if (Build.VERSION.SDK_INT < 21) {
            return true;
        } else {
            Object a3 = com.tencent.smtt.utils.i.a(android.webkit.CookieManager.getInstance(), "acceptThirdPartyCookies", new Class[]{android.webkit.WebView.class}, webView.getView());
            if (a3 != null) {
                return ((Boolean) a3).booleanValue();
            }
            return false;
        }
    }

    public void flush() {
        x a2 = x.a();
        if (a2 != null && a2.b()) {
            a2.c().b().invokeStaticMethod("com.tencent.tbs.tbsshell.WebCoreProxy", "cookieManager_flush", new Class[0], new Object[0]);
        } else if (Build.VERSION.SDK_INT < 21) {
        } else {
            com.tencent.smtt.utils.i.a(android.webkit.CookieManager.getInstance(), "flush", new Class[0], new Object[0]);
        }
    }

    public String getCookie(String str) {
        x a2 = x.a();
        if (a2 == null || !a2.b()) {
            try {
                return android.webkit.CookieManager.getInstance().getCookie(str);
            } catch (Throwable th) {
                th.printStackTrace();
                return null;
            }
        }
        return a2.c().a(str);
    }

    public boolean hasCookies() {
        x a2 = x.a();
        return (a2 == null || !a2.b()) ? android.webkit.CookieManager.getInstance().hasCookies() : a2.c().h();
    }

    @Deprecated
    public void removeAllCookie() {
        if (this.a != null) {
            this.a.clear();
        }
        x a2 = x.a();
        if (a2 == null || !a2.b()) {
            android.webkit.CookieManager.getInstance().removeAllCookie();
        } else {
            a2.c().e();
        }
    }

    public void removeAllCookies(ValueCallback<Boolean> valueCallback) {
        if (this.a != null) {
            this.a.clear();
        }
        x a2 = x.a();
        if (a2 != null && a2.b()) {
            a2.c().b().invokeStaticMethod("com.tencent.tbs.tbsshell.WebCoreProxy", "cookieManager_removeAllCookies", new Class[]{android.webkit.ValueCallback.class}, valueCallback);
        } else if (Build.VERSION.SDK_INT < 21) {
        } else {
            com.tencent.smtt.utils.i.a(android.webkit.CookieManager.getInstance(), "removeAllCookies", new Class[]{android.webkit.ValueCallback.class}, valueCallback);
        }
    }

    @Deprecated
    public void removeExpiredCookie() {
        x a2 = x.a();
        if (a2 == null || !a2.b()) {
            android.webkit.CookieManager.getInstance().removeExpiredCookie();
        } else {
            a2.c().b().invokeStaticMethod("com.tencent.tbs.tbsshell.WebCoreProxy", "cookieManager_removeExpiredCookie", new Class[0], new Object[0]);
        }
    }

    @Deprecated
    public void removeSessionCookie() {
        x a2 = x.a();
        if (a2 == null || !a2.b()) {
            android.webkit.CookieManager.getInstance().removeSessionCookie();
        } else {
            a2.c().b().invokeStaticMethod("com.tencent.tbs.tbsshell.WebCoreProxy", "cookieManager_removeSessionCookie", new Class[0], new Object[0]);
        }
    }

    public void removeSessionCookies(ValueCallback<Boolean> valueCallback) {
        x a2 = x.a();
        if (a2 != null && a2.b()) {
            a2.c().b().invokeStaticMethod("com.tencent.tbs.tbsshell.WebCoreProxy", "cookieManager_removeSessionCookies", new Class[]{android.webkit.ValueCallback.class}, valueCallback);
        } else if (Build.VERSION.SDK_INT < 21) {
        } else {
            com.tencent.smtt.utils.i.a(android.webkit.CookieManager.getInstance(), "removeSessionCookies", new Class[]{android.webkit.ValueCallback.class}, valueCallback);
        }
    }

    public synchronized void setAcceptCookie(boolean z) {
        x a2 = x.a();
        if (a2 == null || !a2.b()) {
            android.webkit.CookieManager.getInstance().setAcceptCookie(z);
        } else {
            a2.c().b().invokeStaticMethod("com.tencent.tbs.tbsshell.WebCoreProxy", "cookieManager_setAcceptCookie", new Class[]{Boolean.TYPE}, Boolean.valueOf(z));
        }
    }

    public synchronized void setAcceptThirdPartyCookies(WebView webView, boolean z) {
        x a2 = x.a();
        if (a2 != null && a2.b()) {
            a2.c().b().invokeStaticMethod("com.tencent.tbs.tbsshell.WebCoreProxy", "cookieManager_setAcceptThirdPartyCookies", new Class[]{Object.class, Boolean.TYPE}, webView.getView(), Boolean.valueOf(z));
        } else if (Build.VERSION.SDK_INT < 21) {
        } else {
            com.tencent.smtt.utils.i.a(android.webkit.CookieManager.getInstance(), "setAcceptThirdPartyCookies", new Class[]{android.webkit.WebView.class, Boolean.TYPE}, webView.getView(), Boolean.valueOf(z));
        }
    }

    public synchronized void setCookie(String str, String str2) {
        setCookie(str, str2, false);
    }

    public synchronized void setCookie(String str, String str2, ValueCallback<Boolean> valueCallback) {
        x a2 = x.a();
        if (a2 != null && a2.b()) {
            a2.c().b().invokeStaticMethod("com.tencent.tbs.tbsshell.WebCoreProxy", "cookieManager_setCookie", new Class[]{String.class, String.class, android.webkit.ValueCallback.class}, str, str2, valueCallback);
            return;
        }
        if (!x.a().d()) {
            b bVar = new b();
            bVar.a = 1;
            bVar.b = str;
            bVar.c = str2;
            bVar.d = valueCallback;
            if (this.a == null) {
                this.a = new CopyOnWriteArrayList<>();
            }
            this.a.add(bVar);
        }
        if (this.f) {
            if (Build.VERSION.SDK_INT < 21) {
                return;
            }
            com.tencent.smtt.utils.i.a(android.webkit.CookieManager.getInstance(), "setCookie", new Class[]{String.class, String.class, android.webkit.ValueCallback.class}, str, str2, valueCallback);
        }
    }

    public synchronized void setCookie(String str, String str2, boolean z) {
        x a2 = x.a();
        if (a2 != null && a2.b()) {
            a2.c().b().invokeStaticMethod("com.tencent.tbs.tbsshell.WebCoreProxy", "cookieManager_setCookie", new Class[]{String.class, String.class}, str, str2);
            return;
        }
        if (this.f || z) {
            android.webkit.CookieManager.getInstance().setCookie(str, str2);
        }
        if (!x.a().d()) {
            b bVar = new b();
            bVar.a = 2;
            bVar.b = str;
            bVar.c = str2;
            bVar.d = null;
            if (this.a == null) {
                this.a = new CopyOnWriteArrayList<>();
            }
            this.a.add(bVar);
        }
    }

    public boolean setCookieCompatialbeMode(Context context, a aVar, String str, boolean z) {
        System.currentTimeMillis();
        if (context == null || !TbsExtensionFunctionManager.getInstance().canUseFunction(context, TbsExtensionFunctionManager.COOKIE_SWITCH_FILE_NAME)) {
            return false;
        }
        this.c = aVar;
        if (str != null) {
            this.b = str;
        }
        if (this.c == a.MODE_NONE || !z || x.a().d()) {
            return true;
        }
        x.a().a(context);
        return true;
    }

    public void setCookies(Map<String, String[]> map) {
        x a2 = x.a();
        if ((a2 == null || !a2.b()) ? false : a2.c().a(map)) {
            return;
        }
        for (String str : map.keySet()) {
            for (String str2 : map.get(str)) {
                setCookie(str, str2);
            }
        }
    }
}
